package MVC.Servlet;

import Servlet.DAO.memberDAO;
import Servlet.DTO.memberDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/starting")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String service = req.getParameter("menu");
        HttpSession idsession = req.getSession();
        idsession.setAttribute("id", req.getParameter("id"));

        String jspfile ="";
        if (service.equalsIgnoreCase("memberlist")) {
            memberDAO dao = new memberDAO();
            ArrayList<memberDTO> list = dao.selectAll();
            req.setAttribute("allmember", list );
            jspfile = "/MVC/allmember.jsp";
        } else if (service.equalsIgnoreCase("boardwriting")) {
            jspfile = "/MVC/boardwriting.jsp";
        }
        RequestDispatcher rd = req.getRequestDispatcher(jspfile);
        rd.forward(req, resp);
    }
}
