package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @author 章鑫
 * @date 2018/8/23 15:01
 */
public interface ProductCategoryService {

    /**
     * 商品类目查询
     */
    List<ProductCategory> findListByCategoryTypeIn(List<Integer> categoryTypeList);
}
