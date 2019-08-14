package com.imooc.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 章鑫
 * @date 2018/8/23 15:49
 */
@Data
public class ProductVO {

    /**
     * 类目名称
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * 类目id
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 商品信息
     */
    @JsonProperty("food")
    List<ProductInfoVO> productInfoVOList;
}
