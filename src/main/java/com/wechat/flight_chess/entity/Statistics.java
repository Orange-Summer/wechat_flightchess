package com.wechat.flight_chess.entity;

import java.io.Serializable;

/**
 * (Statistics)实体类
 *
 * @author makejava
 * @since 2021-06-09 17:10:44
 */
public class Statistics implements Serializable {
    private static final long serialVersionUID = -88628961526451036L;

    private Integer id;

    private String name;

    private Integer maxDistance;

    private Integer eatPlane;

    private Integer score;

    private String type;


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

    public Integer getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(Integer maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Integer getEatPlane() {
        return eatPlane;
    }

    public void setEatPlane(Integer eatPlane) {
        this.eatPlane = eatPlane;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
