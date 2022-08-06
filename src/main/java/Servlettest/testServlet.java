package Servlettest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/hello")
public class testServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        testDAO dao = new testDAO();
        ArrayList<testDTO> selectAll = dao.test();


//        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().println("헬로우 Servlet!");

        for (testDTO dto: selectAll
             ) {

            resp.getWriter().println(dto + "<br>");
        }


    }
}



