package servlet;
import Bean.*;
import DBUtil.*;
import Dao.*;
import Dao.dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		if("addzhiyuan".equals(request.getParameter("method"))) {addzhiyuan(request,response);}
		else if("register".equals(request.getParameter("method")))register(request,response);
		else if("chaxun".equals(request.getParameter("method"))) {chaxun(request,response);}
		else if("addhuiyi".equals(request.getParameter("method"))) {addhuiyi(request,response);}
		else if("huiyidelete".equals(request.getParameter("method"))) {huiyidelete(request,response);}
		else if("huiyiupdate".equals(request.getParameter("method"))) {huiyiupdate(request,response);}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	private void huiyiupdate(HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
	    res.setContentType("text/html;charset=utf-8");
	    String a=req.getParameter("RID");
	}

	private void huiyidelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
	    res.setContentType("text/html;charset=utf-8");
	    String a=req.getParameter("RID");
	    dao.huiyidelete(a);
	    req.getRequestDispatcher("huiyi.jsp").forward(req, res);
	
	    
	}

	private void addhuiyi(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
	    res.setContentType("text/html;charset=utf-8");
		Bean.jiben j=new Bean.jiben();
		j.setRid(req.getParameter("RID"));
		j.setRloc(req.getParameter("Rloc"));
		j.setRname(req.getParameter("Rname"));
		j.setRzt(req.getParameter("Rzt"));
		j.setRnum(""+req.getParameter("RID").charAt(0));
		System.out.println(""+req.getParameter("RID").charAt(0));
		j.setRusezt(req.getParameter("Rusezt"));
		dao.huiyiadd(j);
		req.getRequestDispatcher("huiyi.jsp").forward(req, res);
	}

	private void register(HttpServletRequest request, HttpServletResponse response) {
		
		
	}

	private void chaxun(HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
	    res.setContentType("text/html;charset=utf-8");
	    String user=req.getParameter("user");
	    String UserID=req.getParameter("UserID");
	    System.out.println(user+"****"+UserID);
	    
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void addzhiyuan(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Bean.zhiyuan h=new Bean.zhiyuan();
        h.setID(req.getParameter("ID"));
        h.setName(req.getParameter("name"));
        h.setPhone(req.getParameter("phone"));
        h.setBumen(req.getParameter("bumen"));
        h.setSex((req.getParameter("sex")));
        h.setZhiwei(req.getParameter("zhiwei"));
        dao userdao = new dao();
        dao.zhiyuanadd(h);
        req.getRequestDispatcher("end.jsp").forward(req, resp);
    }
	
}
