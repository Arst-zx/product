package com.imooc.product.service.impl;

import com.imooc.product.DTO.CarDTO;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.enums.ResultEnum;
import com.imooc.product.exception.ProductException;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductInfoService;
import com.imooc.product.utils.JsonUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author 章鑫
 * @date 2018/8/23 10:31
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public List<ProductInfo> findUpAll() {
        List<ProductInfo> list = productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
        return list;
    }

    @Override
    public List<ProductInfo> findListByProductIdIn(List<String> productIdList) {
        List<ProductInfo> list = productInfoRepository.findListByProductIdIn(productIdList);
        return list;
    }

    @Override
    @Transactional
    public void decreaseStock(List<CarDTO> carDTOList) {

        for(CarDTO carDTO: carDTOList) {

            Optional<ProductInfo> productInfoOptional = productInfoRepository.findById(carDTO.getProductId());

            //判断商品是否存在
            if (!productInfoOptional.isPresent()) {
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            ProductInfo productInfo = productInfoOptional.get();
            Integer result = productInfo.getProductStock() - carDTO.getProductQuantity();

            //库存是否足够
            if (result < 0) {
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            //扣库存
            productInfo.setProductStock(result);
            productInfoRepository.save(productInfo);

            //发送mq消息
            amqpTemplate.convertAndSend("productInfo", JsonUtil.toJson(productInfo));
        }
    }
}
