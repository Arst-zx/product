package com.imooc.product.service;

import com.imooc.product.DTO.CarDTO;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author 章鑫
 * @date 2018/8/23 10:27
 */

public interface ProductInfoService {

    /**
     * 1.查询所有在架商品
     * @return List<ProductInfo>
     */
    List<ProductInfo> findUpAll();

    /**
     * 按订单id查询商品列表
     * @param productIdList
     * @return List<ProductInfo>
     */
    List<ProductInfo> findListByProductIdIn(List<String> productIdList);

    /**
     * 扣库存
     * @param carDTOList
     */
    void decreaseStock(List<CarDTO> carDTOList);
}
