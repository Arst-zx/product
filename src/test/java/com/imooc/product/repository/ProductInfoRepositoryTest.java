package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author 章鑫
 * @date 2018/8/22 15:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus()throws Exception {
        List<ProductInfo> list = productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findByProductIdIn()throws Exception {
        List<ProductInfo> list = productInfoRepository.findListByProductIdIn(Arrays.asList("157875196366190022","157875196366190023"));
        Assert.assertTrue(list.size() > 0);
    }
}