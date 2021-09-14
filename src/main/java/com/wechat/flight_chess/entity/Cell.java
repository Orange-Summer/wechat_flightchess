package com.wechat.flight_chess.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 一格棋盘对象
 *
 */
public class Cell {

	private int location = 0;
	
	private List<Plane> planeList = new ArrayList<com.wechat.flight_chess.entity.Plane>();
	
	private String cellColor = null ;
	
	public Cell(int location,String colorStr){
		this.location = location;
		this.cellColor = colorStr ;
	}

	/**
	 * @return the location
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(int location) {
		this.location = location;
	}

	/**
	 * @return the planeList
	 */
	public List<Plane> getPlaneList() {
		return planeList;
	}

	/**
	 * @param planeList the planeList to set
	 */
	public void setPlaneList(List<Plane> planeList) {
		this.planeList = planeList;
	}

	/**
	 * @return the cellColor
	 */
	public String getCellColor() {
		return cellColor;
	}

	/**
	 * @param cellColor the cellColor to set
	 */
	public void setCellColor(String cellColor) {
		this.cellColor = cellColor;
	}

}
