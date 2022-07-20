package asd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session1
 */
//	서블릿 맵핑
@WebServlet("/Session1")

//	웹의 동작을 위해서 상속 받음
public class Session1 extends HttpServlet {
	
	//	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//	html text 파일을 utf-8 로 반환해준다
		response.setContentType("text/html; charset=utf-8");
		
		//	new 없이도 객체 생성 가능, 자바에서 웹으로 데이터를 출력하기 위해 사용
		//	클라이언트 쪽으로 보내는 데이터의 흐름을 건드리기 위해 사용(수정)
		PrintWriter out=response.getWriter();
		
		//	세션 객체 생성(이미 있다면 반환)
		HttpSession session=request.getSession();
		
		//	생성된 세션 객체의 id를 가져온다	
		out.println("세션 아이디" + new Date(session.getId()) + "<br>" );
		//	최초 세션 객체 생성 시간을 가져온다
		out.println("최초 세션 생성 시작 :" + new Date(session.getCreationTime()) + "<br>" );
		//	세션 객체에 가장 최근에 접근한 시간을 가져온다
		out.println("최근 세션 접근 시각 :" + new Date(session.getLastAccessedTime()) +"<br>" );
		//	세션의 유효 시간을 5초로 설정합니다.		
		out.println("기본 세션 유효 시간 :" + new Date(session.getMaxInactiveInterval()) + "<br>" );
		session.setMaxInactiveInterval(5);
		//	세션 객체의 유효 시간을 가져온다
		out.println("세션 유효 시간 :" + session.getMaxInactiveInterval() + "<br>");
		
		//	세션 객체가 생겼으면 참
		if(session.isNew()) {
			out.print("새 세션이 만들어졌습니다.");
		}
		//	invalidate()를 호출하여 생성된 세션 객체를 강제로 삭제한다.
		session.invalidate();
	}

}
/*
 * 세션
 * 웹 페이지들 사이의 공유 정보를 서버의 메모리에 저장해 놓고 사용하는 방법
 * 
 * 정보가 서버 메모리에 저장
 * 쿠키보다 보안에 유리하지만 서버에 부하를 줄 수 있음
 * 로그인 상태 유지 기능이나 장바구니 담기 기능 등에 주로 사용됨
 * 
 * 브라우저(사용자)당 객체가 생성된다.
 * 
 * 
 * */
