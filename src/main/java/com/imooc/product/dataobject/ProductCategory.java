package com.imooc.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author 章鑫
 * @date 2018/8/22 17:25
 */
@Data
@Entity
public class ProductCategory {

    /**
     * 类目id
     */
    @Id
    @GeneratedValue
    private String categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 商品创建时间
     */
    private Date createTime;

    /**
     * 商品修改时间
     */
    private Date updateTime;
}
