package com.wechat.flight_chess.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author OrangeSummer
 * @date Created on 2021/6/24
 */
@Data
public class Result {
    private String color="White";

    private int chess=-1;

    private List<Integer> moveStep=new ArrayList<>();

    private int playerWin = -1;
}
