package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet_3")
public class SecondServlet_3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	setContentType()을 이용해  클라이언트에 전송할 데이터 종류 지정
		//	html text 형식의 파일을 utf-8로 인코딩하여 브라우저로 보낸다
		response.setContentType("text/html;charset=utf-8");
		
		//	PrintWriter는 new로 초기화 하지 않고 바로 사용할 수 있다
		//	자바에서 웹으로 데이터를 출력하기 위해 사용된다.
		PrintWriter out=response.getWriter();
		
		//	out.print("") 파라미터로 설정된 String을 브라우저에게 보내는 기능이다
		
		out.println("<html><body>");
		out.println("location을 이용한 redirect 실습입니다.");
		out.println("</body><html>");
		
	}

}
