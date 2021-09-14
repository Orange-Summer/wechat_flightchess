package com.wechat.flight_chess.dispose;

/**
 * 游戏相关参数和配置
 */
public class GameDispose {

	/**
	 * 每种颜色的初始化飞机数量
	 */
	public static final int PLANE_NUMBER = 4 ;
	
	/**
	 * 航线总格子数
	 */
	public static final int PATH_CAPACITANCE = 57;
	
	/**
	 * 外环总格子数+1
	 */
	public static final int LIST_PATN_CAPACITANCE = 53 ;
	
	/**
	 * 十字架总格子数
	 */
	public static final int CROSS_PATH_CAPACITANCE = 24 ;
	
	/**
	 * 颜色数组
	 * 分别是红,蓝，橘，绿
	 */
	public static final String[] COLORARRAY = new String[]{"red","blue","orange","green",} ;

}
