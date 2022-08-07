package Servlettest.Service;

import Servlettest.DAO.testDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delete")
public class delete_Service extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");

        testDAO dao = new testDAO();

        int condition = dao.login(id, pw);

        if (condition == 2) {
            dao.delete(id);
            writer.println("회원탈퇴가 완료되었습니다.<br>");
            writer.println("<a href ='http://localhost:8090/webServlet_war/members'>회원목록 조회</a>");

        } else {
            writer.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
            writer.println("<a href = 'delete.html'> 다시 시도</a> <br> ");
            writer.println("<a href = 'login.html'> 로그인 페이지 </a> <br> ");

        }




    }
}
