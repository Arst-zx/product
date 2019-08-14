package com.imooc.product.VO;

import lombok.Data;

/**
 * @author 章鑫
 * @date 2018/8/23 15:45
 * 最外层请求对象
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
