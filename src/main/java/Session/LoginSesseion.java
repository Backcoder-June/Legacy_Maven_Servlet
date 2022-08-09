package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginsession")
public class LoginSesseion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");

        HttpSession session = req.getSession();

        session.setAttribute("sessionid", id);

        if (id != null && pw != null) {
            writer.println("<h1>로그인하셨습니다</h1>");
            writer.println("<h1>사용 가능 메뉴는 다음과 같습니다.</h1>");
            writer.println("<ul><li><a href='mypage'> 내정보확인하러 가기 </a></li>");
            writer.println("<li><a href='board'> 글쓰러 가기 </a></li>");
            writer.println("<li><a href='logout'> 로그아웃하러 가기 </a></li></ul>");
            writer.println("<li><a href='bank'> 은행 session 5분 </a></li></ul>");
        }else {
            writer.println("<h1>로그인 한 세션이 없습니다.</h1>");
        }

    }
}
