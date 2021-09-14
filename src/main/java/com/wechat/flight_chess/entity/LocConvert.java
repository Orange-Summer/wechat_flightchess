package com.wechat.flight_chess.entity;

/**
 * 地址转换为前端的地址
 */
public class LocConvert {
    public static int locConvert(Plane plane){
        int index= plane.getIndex();
        int loc= plane.getLoc();
        String planeType= plane.getPlaneType();
        switch (planeType){
            case "blue":
                if (loc == -2){
                    return index;
                }else if (loc == -1){
                    return 4;
                }else if (loc <= 49){
                    return loc+20;
                }else {
                    return loc-50+52+20;
                }
            case "orange":
                if (loc == -2){
                    return index+5;
                }else if (loc == -1){
                    return 4+5;
                }else if (loc <= 38){
                    return loc+20+13;
                }else if (loc <= 49){
                    return loc+20+13-52;
                }else {
                    return loc-50+58+20;
                }
            case "green":
                if (loc == -2){
                    return index+10;
                }else if (loc == -1){
                    return 4+10;
                }else if (loc <= 25){
                    return loc+20+26;
                }else if (loc <= 49){
                    return loc+20+26-52;
                }else {
                    return loc-50+64+20;
                }
            case "red":
                if (loc == -2){
                    return index+15;
                }else if (loc == -1){
                    return 4+15;
                }else if (loc <= 12) {
                    return loc + 20 + 39;
                }else if (loc <= 49){
                    return loc+20+39-52;
                }else {
                    return loc-50+70+20;
                }
        }
        return 0;
    }
}
