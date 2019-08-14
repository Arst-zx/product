package com.imooc.product.enums;

/**
 * @Author 章鑫
 * @Date 2018/8/30 15:47
 */

import lombok.Getter;

/**
 * @Author: 章鑫
 * @Project_name：product
 * @Name: ResultEnum
 * @Create: 2018-08-30 15:47
 * @Description:
 **/
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"库存有误"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }
}
