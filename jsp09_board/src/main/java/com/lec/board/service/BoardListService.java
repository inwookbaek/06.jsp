package com.lec.board.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.lec.board.dao.BoardDAO;
import com.lec.board.vo.BoardBean;
import com.lec.db.JDBCUitility;

public class BoardListService {

	public int getListCount() {

		// 총레코드건수 : select count(*) from board
		int listCount = 0;
		Connection conn = JDBCUitility.getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(conn);
		listCount = boardDAO.selectListCount();

		return listCount;
	}

	public List<BoardBean> getBoardList() {
		// select * from borad limit 0, 10;
		List<BoardBean> boardList = new ArrayList<>();
		Connection conn = JDBCUitility.getConnection();
		BoardDAO boardDAO = BoardDAO.getInstance();
		boardDAO.setConnection(conn);
		boardList = boardDAO.selectBoardList();
		return boardList;
	}
}