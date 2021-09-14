package com.wechat.flight_chess.entity;

import java.io.Serializable;

/**
 * (LeaderBoard)实体类
 */
public class LeaderBoard implements Serializable {
    private static final long serialVersionUID = -24147536630108346L;

    private Integer id;

    private String name;

    private Integer score;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
