package Dispatch.Dispatcher.dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test1")
public class test1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=utf-8");

        String name = req.getParameter("name");
        PrintWriter writer = resp.getWriter();

        writer.println("첫번째 서블릿 처리<br>");

        name = name.toUpperCase();

        RequestDispatcher rd = req.getRequestDispatcher("test2");

        req.setAttribute("username", name);

        rd.forward(req,resp);


    }
}
