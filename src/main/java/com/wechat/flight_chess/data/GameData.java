package com.wechat.flight_chess.data;

import com.wechat.flight_chess.dispose.GameDispose;
import com.wechat.flight_chess.entity.Cell;
import com.wechat.flight_chess.entity.Dice;
import com.wechat.flight_chess.entity.Plane;
import com.wechat.flight_chess.entity.Role;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 游戏实时数据类
 */
public class GameData {

	/**
	 * 游戏是否开始
	 */
	private boolean isStart = false;

	/**
	 * 红色飞机数组
	 */
	private Plane[] redP = new Plane[4];
	/**
	 * 蓝色飞机数组
	 */
	private Plane[] blueP = new Plane[4];
	/**
	 * 绿色飞机数组
	 */
	private Plane[] greenP = new Plane[4];
	/**
	 * 黄色飞机数组
	 */
	private Plane[] orangeP = new Plane[4];

	/**
	 * 外环线路
	 */
	private List<Cell> pathList = new ArrayList<Cell>(
			GameDispose.LIST_PATN_CAPACITANCE);

	/**
	 * 十字架线路
	 */
	private List<Cell> crossList = new ArrayList<Cell>(
			GameDispose.CROSS_PATH_CAPACITANCE);
	/**
	 * 红棋线路
	 */
	private List<Cell> redList = new ArrayList<Cell>(
			GameDispose.PATH_CAPACITANCE);

	/**
	 * 绿棋线路
	 */
	private List<Cell> greenList = new ArrayList<Cell>(
			GameDispose.PATH_CAPACITANCE);

	/**
	 * 蓝棋线路
	 */
	private List<Cell> blueList = new ArrayList<Cell>(
			GameDispose.PATH_CAPACITANCE);

	/**
	 * 黄棋线路
	 */
	private List<Cell> orangeList = new ArrayList<Cell>(
			GameDispose.PATH_CAPACITANCE);

	
	/**
	 * 游戏玩家数组
	 * 0，蓝色
	 * 1，黄色
	 * 2，绿色
	 * 3，红色
	 */
	private Role[] players = new Role[4];

	/**
	 * 红色玩家老家
	 */
	private Cell[] redHome = new Cell[4];

	/**
	 * 黄色玩家老家
	 */
	private Cell[] orangeHome = new Cell[4];

	/**
	 * 绿色玩家老家
	 */
	private Cell[] greenHome = new Cell[4];

	/**
	 * 蓝色玩家老家
	 */
	private Cell[] blueHome = new Cell[4];

	/**
	 * 当前角色编号 0为蓝色 1为黄色 2为绿色 3为红色
	 */
	private int currentRole = 0;

	/**
	 * 游戏色子
	 */
	private Dice dice = new Dice();

	/**
	 * 玩家是否投掷色子
	 */
	private boolean isClick = false;
	
	/**
	 * 当前选择的飞机编号
	 */
	private int NumberOfCurrentPlane = -1;


		{

		// 初始化所有飞机
		for (int i = 0; i < GameDispose.PLANE_NUMBER; i++) {
			this.getPlane(Plane.TYPE_BLUE)[i] = new Plane(Plane.TYPE_BLUE,false,i,this);
			this.getPlane(Plane.TYPE_RED)[i] = new Plane(Plane.TYPE_RED,true,i,this);
			this.getPlane(Plane.TYPE_GREEN)[i] = new Plane(Plane.TYPE_GREEN,false,i,this);
			this.getPlane(Plane.TYPE_ORANGE)[i] = new Plane(Plane.TYPE_ORANGE,false,i,this);
		}

		// 初始化当前角色编号
		this.setCurrentRole(0);

		// 初始化外环线路
		for (int i = 0; i < GameDispose.LIST_PATN_CAPACITANCE; i++) {
			//红、蓝、橘、绿
			if (i < 1) {
				Cell cell = new Cell(i, null);
				this.pathList.add(cell);
			} else if (i < 5) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 8) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 14) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 18) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 21) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 27) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 31) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 34) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 40) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 44) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 47) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			} else if (i < 53) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[(i - 1) % 4]);
				this.pathList.add(cell);
			}
		}

		// 初始化十字架线路
		for (int i = 0; i < GameDispose.CROSS_PATH_CAPACITANCE; i++) {
			// 初始化顺序为蓝，橘，绿，红
			if (i < 6) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[1]);
				this.crossList.add(cell);
			} else if (i < 12) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[2]);
				this.crossList.add(cell);
			} else if (i < 18) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[3]);
				this.crossList.add(cell);
			} else if (i < 24) {
				Cell cell = new Cell(i, GameDispose.COLORARRAY[0]);
				this.crossList.add(cell);
			}
		}

		// 初始化红棋路线
		this.blueList.addAll(this.pathList.subList(1, 51));
		this.blueList.addAll(this.crossList.subList(0, 6));

		// 初始化黄棋路线
		this.orangeList.addAll(this.pathList.subList(14, 53));
		this.orangeList.addAll(this.pathList.subList(1, 12));
		this.orangeList.addAll(this.crossList.subList(6, 12));

		// 初始化绿棋路线
		this.greenList.addAll(this.pathList.subList(27, 53));
		this.greenList.addAll(this.pathList.subList(1, 25));
		this.greenList.addAll(this.crossList.subList(12, 18));

		// 初始化蓝棋路线
		this.redList.addAll(this.pathList.subList(40, 53));
		this.redList.addAll(this.pathList.subList(1, 38));
		this.redList.addAll(this.crossList.subList(18, 24));

		// 初始化所有玩家老家
		for (int i = 0; i < 4; i++) {
			this.redHome[i] = new Cell(i, Plane.TYPE_RED);
			
			this.orangeHome[i] = new Cell(i, Plane.TYPE_ORANGE);
			
			this.greenHome[i] = new Cell(i, Plane.TYPE_GREEN);

			this.blueHome[i] = new Cell(i, Plane.TYPE_BLUE);
		}

	}

	/**
	 * 获得指定颜色的飞机数组
	 * 
	 * @param type
	 * @return
	 */
	public Plane[] getPlane(String type) {
		if (Plane.TYPE_BLUE.equals(type))
			return this.blueP;
		else if (Plane.TYPE_GREEN.equals(type))
			return this.greenP;
		else if (Plane.TYPE_RED.equals(type))
			return this.redP;
		else if (Plane.TYPE_ORANGE.equals(type))
			return this.orangeP;
		else
			return null;
	}

	/**
	 * 获得指定颜色的线路
	 * 
	 * @param type
	 * @return
	 */
	public List<Cell> getLine(String type) {

		if (Plane.TYPE_BLUE.equals(type))
			return this.blueList;
		else if (Plane.TYPE_GREEN.equals(type))
			return this.greenList;
		else if (Plane.TYPE_RED.equals(type))
			return this.redList;
		else if (Plane.TYPE_ORANGE.equals(type))
			return this.orangeList;
		else
			return null;
	}

	/**
	 * 通过老家第一个点和老家的机场编号计算飞机停靠位置
	 * 
	 * @return
	 */
	private static Point getLoc(Point point, int index) {
		if (index < 2)
			return new Point(point.x + index * 42, point.y);
		else if (index < 4)
			return new Point(point.x + (index - 2) * 42, point.y + 42);
		else
			return null;
	}

	/**
	 * @return the isStart
	 */
	public boolean isStart() {
		return isStart;
	}

	/**
	 * @param isStart
	 *            the isStart to set
	 */
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}

	/**
	 * @return the redHome
	 */
	public Cell[] getRedHome() {
		return redHome;
	}

	/**
	 * @param redHome
	 *            the redHome to set
	 */
	public void setRedHome(Cell[] redHome) {
		this.redHome = redHome;
	}

	/**
	 * @return the orangeHome
	 */
	public Cell[] getOrangeHome() {
		return orangeHome;
	}

	/**
	 * @param OrangeHome
	 *            the orangeHome to set
	 */
	public void setOrangeHome(Cell[] OrangeHome) {
		this.orangeHome = OrangeHome;
	}

	/**
	 * @return the greenHome
	 */
	public Cell[] getGreenHome() {
		return greenHome;
	}

	/**
	 * @param greenHome
	 *            the greenHome to set
	 */
	public void setGreenHome(Cell[] greenHome) {
		this.greenHome = greenHome;
	}

	/**
	 * @return the blueHome
	 */
	public Cell[] getBlueHome() {
		return blueHome;
	}

	/**
	 * @param blueHome
	 *            the blueHome to set
	 */
	public void setBlueHome(Cell[] blueHome) {
		this.blueHome = blueHome;
	}

	/**
	 * @return the currentRole
	 */
	public int getCurrentRole() {
		return currentRole;
	}

	/**
	 * @param currentRole
	 *            the currentRole to set
	 */
	public void setCurrentRole(int currentRole) {
		this.currentRole = currentRole;
	}

	/**
	 * @return the dice
	 */
	public Dice getDice() {
		return dice;
	}

	/**
	 * @param dice
	 *            the dices to set
	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * @return the isClick
	 */
	public boolean isClick() {
		return isClick;
	}

	/**
	 * @param isClick
	 *            the isClick to set
	 */
	public void setClick(boolean isClick) {
		this.isClick = isClick;
	}

	/**
	 * @return the players
	 */
	public Role[] getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Role[] players) {
		this.players = players;
	}

	/**
	 * @return the numberOfCurrentPlane
	 */
	public int getNumberOfCurrentPlane() {
		return NumberOfCurrentPlane;
	}

	/**
	 * @param numberOfCurrentPlane the numberOfCurrentPlane to set
	 */
	public void setNumberOfCurrentPlane(int numberOfCurrentPlane) {
		NumberOfCurrentPlane = numberOfCurrentPlane;
	}


}
