package com.imooc.product.enums;

import lombok.Getter;

/**
 * @author 章鑫
 * @date 2018/8/23 14:37
 * 商品上下架状态
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 商品在架、下架
     */
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
