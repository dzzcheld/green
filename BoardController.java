package sec03.brd07;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.UploadContext;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.graalvm.compiler.lir.LIRInstruction.Temp;

import com.sun.jdi.Location;

import jdk.jfr.internal.PrivateAccess;
import sun.jvm.hotspot.runtime.StaticBaseConstructor;
import sun.security.action.GetLongAction;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String ARTICLE_IMAGE_REPO="C:\\board\\article_image";
	BoardService boardService;
	ArticleVO articleVO;
	
	public void init(ServletConfig config) throws ServletException {
		
		boardService=new BoardService();
		articleVO=new ArticleVO();
				
	}//	init

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nextPage="";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		HttpSession session;
		String action=request.getPathInfo();
		System.out.println("action:" + action);
		
		try {
			List<ArticleVO>articleList=new ArrayList<ArticleVO>();
			
			if(action==null) {
				articlesList=boardService.listArticles();
				request.setAttribute("articleList", articleList);
				nextPage="/board06/listArticles.jsp";
				
			}else if(action.equals("/listArticles.do")) {
				articlesList=boardService.listArticles();
				request.setAttribute("articleList", articleList);
				nextPage="/board06/listArticles.jsp";
			
			}else if(action.equals("/articleForm.do")) {
				nextPage="/board06/articleForm.jsp";
			
			}else if(action.equals("/addArticle.do")) {
				int articleNO=0;
				
				Map<String, String>articleNapMap=Upload(request, response);
				String title=articleMap.get("title");
				String content=articleMap.get("content");
				String imageFileName=articleMap.get(imageFileName);
				
				articleVO.setParentNO(0);
				articleVO.setId("hong");
				articleVO.setTitle(tite);
				articleVO.setContent(content);
				articleVO.setImageFileName(imageFileName);
				articleNO=boardService.addArticle(articleVO);
				
				if(imageFileName !=null && imageFileName.length()!=0) {
					File srcFile=new File(ARTICLE_IMAGE_REPO + "\\" + "temp" + "\\" + imageFileName);
					File destDir.mkdirs();
					FileUtils.moveFileToDirectory(srcFile, destDir, true);
				}
				PrintWriter pWriter=response.getWriter();
				pWriter.print("<script>" + "alert('새글을 추가했습니다'); " + "location.href='" + request.getContextPath() 
						+ "/board/listArticles.do':" + "</script>" );
				return;
			}else if(action.equals("/viewArticle.do")) {
				String articleNO=request.getParameter("articleNO");
				articleVO=boardService.viewArticle(Integer.parseInt(articleNO));
				request.setAttribute("article", articleVO);
				nextPage="/board06/viewArticle.jsp";
			}else if(action.equals("/modArticle.do")) {
				
				Map<String, String>articleMap=upload(request, response);
				int articleNO=Integer.parseInt(articleMap.get(articleNO));
				articleVO.setArticleNO(articleNO);
				
				String title=articleMap.get("title");
				String content=articleMap.get("content");
				String imageFileName=articleMap.get("imageFileName");
				
				articleVO.setParentNO(0);
				articleVO.setId("hong");
				articleVO.setTitle(title);
				articleVO.setContent(content);
				articleVO.setImageFileName(imageFileName);
				
				boardService.modArticle(articleVO);
				if(imageFileName!=null && imageFileName.length()!=0) {
					String originalFileName=articleMap.get("originalFileName");
					File srcFile=new File(ARTICLE_IMAGE_REPO + "\\" + "temp" + "\\" + imageFileName);
					File destDir=new File(ARTICLE_IMAGE_REPO + "\\" + "articleNO" + "\\" + originalFileName);
					
					oldFile.delete();
					
				}
				PrintWriter pw=response.getWriter();
				pw.print("<script>" + "alert('글을 수정했습니다.'):" + "location.href= '"
						+"/board/viewArticle.do?articleNO="+ articleNO + ":" + "</script>");
				return;
			}else if (action.equals("/removeArticle.do")) {
				int articleNO=Integer.parseInt(request.getParameter("articleNO"));
				List<Integer>articleNOList=boardService.removeArticle(articleNO);
				for(int _articleNO:_articleNO articleNOList) {
					File imgDir=new File(ARTICLE_IMAGE_REPO + "\\" + _articleNO);
					if(imgDir.exists()) {
						FileUtils.deleteDirectory(imgDir);
					}
				}
				
				PrintWriter pw=response.getWriter();
				pw.print("<script>" + "alert('글을 삭제했습니다'):" + "location.href='" +request.getContextPath()
						+ "/board/listArticles.do':" + "</script>");
				return;
			}else if(action.equals("/replyForm.do")) {
				int parentNO=Integer.parseInt(request.getParameter("parentNO"));
				session=request.getSession();
				session.setAttribute("parentNO", parentNO);
				nextPage="/board06/replyForm.jsp";
			}else if (action.equals("/addReply.do")) {
				session=request.getSession();
				int parentNO =(Integer)session.getAttribute("parentNO");
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	

}/// class/
	

