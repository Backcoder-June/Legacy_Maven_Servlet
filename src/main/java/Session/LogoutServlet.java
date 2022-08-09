package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        HttpSession session = req.getSession();


            String sessionid = (String) session.getAttribute("sessionid");



        String output = "";

        if (sessionid == null) {
         writer.println("로그인 된 정보가 없습니다.");
        } else {
            output += sessionid + "<h2>님 로그아웃 되었습니다.</h2> <br>";
            session.removeAttribute("sessionid");
            //session.invalidate();
            //session.setMaxInactiveInterval(0);

            output += "<a href = login.html > 홈으로 </a><br>";

            writer.println(output);

        }

    }
}
