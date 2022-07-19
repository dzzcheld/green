package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet_3")
public class FirstServlet_3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 보낼때 html형식의 text를 utf-8로 바꿔라
		// setContentType() 을 이용해 클라이언트에 전솔할 데이터 종류 지정
		response.setContentType("text/html;charset=utf-8");
		
		//	PrintWriter 는 new로 초기화 하지 않고 바로 사용할 수 있다
		//	자바에서 웹으로 데이터를 출력하기 위해 사용된다
		PrintWriter out=response.getWriter();
		
		//	out.print("") 파라미터로 설정된 String을 브라우저에게 보내는 기능이다
		
		//	text를 통해 자바스크립트를 구현하겠다는 뜻
		out.print("<script type='text/javascript'>");
		
		//	href는 페이지 이동, 뒤로가기 버튼을 누른경우 이전 페이지로 이동이 가능함.
		out.print("location.href='SecondServlet_3';");
		out.print("</script>");
	}

}
