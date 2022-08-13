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
        String jspfile ="";


        //로그인 세션
        //( 로그인이 없을시 Guest 만들기 위해 굳이 세션을 생성하면 낭비다 =>
        // VIEW 단에서 조종하자. )
            if (req.getParameter("id") != null) {
                String userid = req.getParameter("id");
                HttpSession idsession = req.getSession();
                idsession.setAttribute("userid", userid);

                RequestDispatcher rd = req.getRequestDispatcher("/MVC/logined_Home.jsp");
                rd.forward(req, resp);
            }


        if (service.equalsIgnoreCase("memberlist")) {
            memberDAO dao = new memberDAO();
            ArrayList<memberDTO> list = dao.selectAll();
            req.setAttribute("allmember", list );
            jspfile = "/MVC/allmember.jsp";
        }

        if (service.equalsIgnoreCase("boardwriting")) {
            jspfile = "/MVC/boardwriting.jsp";
        }

        RequestDispatcher rd = req.getRequestDispatcher(jspfile);
        rd.forward(req, resp);


    }
}
