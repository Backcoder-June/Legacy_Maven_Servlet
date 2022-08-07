package Servlettest.Service;

import Servlettest.DAO.testDAO;
import Servlettest.DTO.testDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/members")
public class selectAll_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        testDAO dao = new testDAO();
        ArrayList<testDTO> selectAll = dao.selectAll();

        resp.getWriter().println("전체회원 목록<br>");

        for (testDTO dto: selectAll
             ) { resp.getWriter().println(dto + "<br>"); }


    }
}



