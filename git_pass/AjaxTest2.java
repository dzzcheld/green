package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxTest2
 */
@WebServlet("/AjaxTest2")
public class AjaxTest2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		String result="";
		PrintWriter writer=response.getWriter();
		
		//	도서 정보를 XML로 작성한 후 클라이언트로 전송합니다.
		result="<main><book>"+
				"<title><![CDATA[초보자를 위한 자바 프로그래밍]]</title>"+
				"<writer><![CDATA[은포북스 저 | 이병승]]></writer>"+
				"<image><![CDATA[http://localhost:8080/pro16/image/image1/jpg]]></image>"+
				"</book>"+
				"<book>"+
				"<title><![CDATA[모두의 파이썬]]></title>"+
				"<writer><![CDATA[길벗 저 | 이승찬]]</writer>"+
				"<image><![CDATA[http://localhost:8080/pro16/image/image2.jpg]]></image>"+
				"</book></main>";
		System.out.println(result);
		writer.print(result);
	}

}