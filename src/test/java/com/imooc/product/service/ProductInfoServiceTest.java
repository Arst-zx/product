package com.imooc.product.service;

import com.imooc.product.DTO.CarDTO;
import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author 章鑫
 * @date 2018/8/23 14:47
 */
@Component
public class ProductInfoServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productInfoService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findListByProductIdIn() {
        List<ProductInfo> list = productInfoService.findListByProductIdIn(Arrays.asList("157875196366190022","157875196366190023"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() {
        CarDTO carDTO = new CarDTO();
        carDTO.setProductId("157875196366190022");
        carDTO.setProductQuantity(2);

        productInfoService.decreaseStock(Arrays.asList(carDTO));
    }
}
