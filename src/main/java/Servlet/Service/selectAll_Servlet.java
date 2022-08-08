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
import java.util.ArrayList;

@WebServlet("/members")
public class selectAll_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        memberDAO dao = new memberDAO();
        ArrayList<memberDTO> selectAll = dao.selectAll();

//        writer.println("전체회원 목록<br>");

        String output = "";

        output = "<style> table, td {border : 5px solid black} </style>";
        output += "<table>";
        output += "<caption>전체회원 리스트</caption>";
        output += "<tr><th>아이디</th><th>이름</th></tr>";

        for (memberDTO dto: selectAll
             ) {
            output += "<tr><td>" + dto.getId() + "</td>"
            + "<td>" + dto.getName() +"</td></tr>";
             }

        output+= "</table>";
        writer.println(output);

        writer.println("<br> <a href='login.html'>홈으로</a>");

    }
}



