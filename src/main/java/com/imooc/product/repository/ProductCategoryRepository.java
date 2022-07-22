package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * @author 章鑫
 * @date 2018/8/22 17:29
 */
public interface ProductCategoryRepository extends JpaRepository <ProductCategory, Integer>{
    List<ProductCategory> findListByCategoryTypeIn(List<Integer> categoryTypeList);
}


