package a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GetServlet")
@SuppressWarnings("serial")
public class GetServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		
		System.out.println(name+"--"+age);
		resp.getWriter().write("响应get请求的内容");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("这是post请求。。。交给get请求处理。。。。");
		doGet(req, resp);
	}
}
