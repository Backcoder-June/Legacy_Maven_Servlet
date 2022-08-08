package Servlet.Service;

import Servlet.DAO.memberDAO;
import Servlet.DTO.memberDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/join")
public class join_Service extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        String name = req.getParameter("name");

        memberDTO dto = new memberDTO(id, pw, name);
        memberDAO dao = new memberDAO();

        //login 조회 로직 이용해서 회원가입
        int condition = dao.login(id, pw);

        if (condition == 3) {
            dao.join(dto);
            writer.println("회원가입을 축하드랍니다!");
        } else { writer.println("이미 가입된 회원입니다.");}

        writer.println("<br>");
        writer.println("<a href = 'login.html'>로그인하러 가기</a>");


    }
}
