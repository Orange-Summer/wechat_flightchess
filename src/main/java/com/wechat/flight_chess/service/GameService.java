package com.wechat.flight_chess.service;


import com.wechat.flight_chess.entity.Result;

import java.util.List;

/**
 * 游戏服务接口
 *
 */
public interface GameService {
	
	/**
	 * 开始游戏
	 */
	public void startGame() ;

	/**
	 * 掷骰子
	 * @return
	 */
	public int throwDice();

	/**
	 * 棋子移动
	 * @param color
	 * @param chess
	 * @return
	 */
	public List<Result> makeMove(String color, int chess);
	
	/**
	 * 判断玩家掷色子结果
	 * @param flag
	 * @param diceNumber
	 */
	public List<Result> judgePlayerThrowResult(int flag , int diceNumber) ;
	
	/**
	 * 判断电脑掷色子结果
	 * @param flag
	 * @param diceNumber
	 */
	public List<Result> judgeCompThrowResult(int flag ,int diceNumber) ;
	
	/**
	 * 判断输赢情况
	 * 
	 * @return
	 * -1，没有任何一方赢，
	 * 0，你赢了
	 * 1，黄方赢
	 * 2，绿方赢
	 * 3，红方赢
	 */
	public int  judgeIsWin(int flag) ;
	
	/**
	 * 重新开始游戏
	 */
	public void restartGame() ;

}
