package com.lec.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.command.CommandHandler;

public class MemberHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		// jdbc, insert into
		req.setAttribute("member", "회원이 성공적으로 등록되었습니다!!");
		return "/view/member.jsp";
	}
}
