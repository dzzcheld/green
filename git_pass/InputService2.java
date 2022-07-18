package asd;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 맵핑
@WebServlet("/input2")

// 웹 동작을 위해 상속 받음
public class InputService2 extends HttpServlet {
	
	// init 생성자로 메모리에 할당되면 예외
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}
    
	// 요청과 응답을 매개변수로 받음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//	인코딩 형식을 UTF-8로 한다
		request.setCharacterEncoding("UTF-8");

		//전송되어 온 name속성 들만 Enumeration 타입으로 받아옵니다
		Enumeration enu=request.getParameterNames();
		
		//요소들이 있으면 참
		while(enu.hasMoreElements()) {
			
			// name 속성을 지닌 다른 요소를 지정한다
			String name=(String)enu.nextElement();
			
			//	name을 속성이 있고 values 가 있는 것들을 저장한다.
			String [] values=request.getParameterValues(name);
			for(String value:values) {
				System.out.println("name=" + name + ",value=" + value);
			}
		}
	}

	
	public void destroy() {
		System.out.println("destroy  메서드 호출");
	}

}
