package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * @author 章鑫
 * @date 2018/8/23 17:14
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);

        return resultVO;
    }
}
