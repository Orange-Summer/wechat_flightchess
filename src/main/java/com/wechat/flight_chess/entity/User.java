package com.wechat.flight_chess.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-06-09 17:10:59
 */
public class User implements Serializable {
    private static final long serialVersionUID = 332961821735744376L;

    private Integer id;

    private String color;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
