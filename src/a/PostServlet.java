package a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("����get���󡣡�����");
		String name=req.getParameter("name");
		String gender = req.getParameter("gender");
		
		System.out.println(name+"--"+gender);
		resp.getWriter().write("post��Ӧ������");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("����post���󡣡���������get����������");
		doGet(req, resp);
	}
}
