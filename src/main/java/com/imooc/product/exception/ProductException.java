package com.imooc.product.exception;

/**
 * @Author 章鑫
 * @Date 2018/8/30 15:43
 */

import com.imooc.product.enums.ResultEnum;

/**
 * @Author: 章鑫
 * @Project_name：product
 * @Name: ProductException
 * @Create: 2018-08-30 15:43
 * @Description:
 **/
public class ProductException extends RuntimeException{

    private Integer code;

    public ProductException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
