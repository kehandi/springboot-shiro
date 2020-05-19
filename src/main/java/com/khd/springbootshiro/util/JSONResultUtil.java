package com.khd.springbootshiro.util;

import lombok.Data;

/**
 * @author mac
 * @title: JSONResultUtil
 * @projectName springboot-shiro
 * @description: TODO
 * @date 2020/5/19 15:18
 */
@Data
public class JSONResultUtil<T> {

    private Boolean result;

    private T data;

    public JSONResultUtil () {

    }

    public JSONResultUtil(Boolean result, T data) {
        this.result = result;
        this.data = data;
    }
}
