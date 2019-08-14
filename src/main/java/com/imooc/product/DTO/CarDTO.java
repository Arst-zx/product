package com.imooc.product.DTO;

/**
 * @Author 章鑫
 * @Date 2018/8/30 15:32
 */

import lombok.Data;

/**
 * @Author: 章鑫
 * @Project_name：product
 * @Name: CarDTO
 * @Create: 2018-08-30 15:32
 * @Description:
 **/
@Data
public class CarDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品购买数量
     */
    private Integer productQuantity;
}
