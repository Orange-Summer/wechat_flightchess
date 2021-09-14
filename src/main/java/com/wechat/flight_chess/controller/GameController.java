package com.wechat.flight_chess.controller;


import com.wechat.flight_chess.entity.Result;
import com.wechat.flight_chess.service.GameService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 游戏控制类
 */
@RestController
@RequestMapping("/game")
@CrossOrigin
public class GameController  {

	@Resource
	private GameService gameService ;
	
	/**
	 * 开始游戏
	 */
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public int startGame(HttpServletRequest req, HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin","*");
		gameService.startGame();
		return 1;
	}

	@RequestMapping(value = "/throw", method = RequestMethod.GET)
	public int throwDice(HttpServletRequest req, HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin","*");
		return gameService.throwDice();
	}


	@RequestMapping(value = "/move", method = RequestMethod.GET)
	public List<Result> makeMove(HttpServletRequest req, HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin","*");
		String color=req.getParameter("color");
		int chess=Integer.parseInt(req.getParameter("chess"));
		return gameService.makeMove(color, chess);
	}

	/**
	 * 重新开始游戏
	 */
	@RequestMapping(value = "/restart", method = RequestMethod.GET)
	public int restartGame(HttpServletRequest req, HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin","*");
		gameService.startGame();
		return  1;
	}

}
