package Dispatch.Dispatcher.dispatcher;
import Servlet.DTO.memberDTO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forward1")
public class forward1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String name = request.getParameter("name");

        memberDTO dto = new memberDTO(id, pw, name);

        request.setAttribute("dto", dto);
        RequestDispatcher rd = request.getRequestDispatcher("forward2");
        rd.forward(request, response);

    }

}





