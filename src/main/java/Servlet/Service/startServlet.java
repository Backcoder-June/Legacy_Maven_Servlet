package Servlet.Service;

import Servlet.DAO.memberDAO;
import Servlet.DTO.memberDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/start")
public class startServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        if (req.getParameter("menu").equalsIgnoreCase("memberlist")) {

            memberDAO dao = new memberDAO();

            ArrayList<memberDTO> allmember = dao.selectAll();

            req.setAttribute("allmember", allmember);

            RequestDispatcher rd = req.getRequestDispatcher("/JSP_prac/servjsp.jsp");

            rd.forward(req, resp);

        } else if (req.getParameter("menu").equalsIgnoreCase("boardwriting")) {

            RequestDispatcher rd = req.getRequestDispatcher("/JSP_prac/boardwriting.jsp");

            rd.forward(req, resp);
        }  else { resp.getWriter().println("없는 페이지");}



    }
}
