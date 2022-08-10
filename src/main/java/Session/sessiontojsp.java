package Session;

import Servlet.DTO.memberDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tojsp")
public class sessiontojsp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession se = req.getSession();

        resp.setContentType("text/html; charset = utf-8");
        PrintWriter out = resp.getWriter();

        String result = "";
        if (se.getAttribute("member1") != null) {
            memberDTO member1 = (memberDTO)se.getAttribute("member1");

            result+="<table border='5'>";
    result+="<tr><td>아이디</td><td>" + member1.getId() + "</td></tr>";
    result+= "<tr><td>비밀번호</td><td>" + member1.getPw() + " </td></tr>";
    result+= "<tr><td>이름</td><td>" + member1.getName() + "</td></tr>";
    result+="</table>";
        }else {
            result = "조회할 정보가 없습니다 확인하세요";
        }

        out.println(result);


    }
}
