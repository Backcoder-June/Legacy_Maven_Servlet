package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bank")
public class BankServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        HttpSession session = req.getSession();

        String sessionid = (String)session.getAttribute("sessionid");

        PrintWriter writer = resp.getWriter();
        writer.println("Bank 서블릿 아이디 "+ sessionid + "인증. 5분간 유효" );


        session.setMaxInactiveInterval(60*2);

    }
}
