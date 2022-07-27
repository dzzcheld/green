package sec01.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileDownload
 */
@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8 ");
		
		//	file 경로를 file_repo에 저장한다.
		String file_repo="C:\\file_repo";
		//	fileName을 받아서 fileName에 저장한다.
		String fileName=(String)request.getParameter("fileName");
		System.out.println("fileName="+ fileName);
		
		//	프로세스의 출력스트림을 담당한다
		OutputStream out=response.getOutputStream();
		
		//	파일 디렉토리\\ 파일이름을 downFile에 저장한다.
		String downFile=file_repo+"\\" + fileName;
		
		//	경로에 있는 파일을 File 클래스로 인스턴스화 하여 f에 저장한다.
		File f=new File(downFile);
		
		//	웹 브라우저 cache를 제어하는 구문
		response.setHeader("Catch-Control", "no-cache");
		
		//	attachment와 filename을 함께 주게 되면 Body에 오는 값을 다운로드 받으라는 의미.
		response.addHeader("Content-disposition","attachment; fileName"+fileName);

		//	파일의 경로와 이름이 저정된 객체를 입력 스트림에 저장한다.
		FileInputStream in=new FileInputStream(f);
		
		//	실제로 파일을 전송처리 한다
		//	실제로 전송할 파일으 크기를 1024 바이트로 지정한다.
		byte[] buffer=new byte[1024*8];
		while(true) {
			int count=in.read(buffer);
		//	
			if(count==-1)
				break;
			out.write(buffer, 0, count);
		}
		in.close();
		out.close();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}

}
