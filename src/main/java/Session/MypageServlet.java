package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/mypage")
public class MypageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        HttpSession session = req.getSession();

        if (session.getAttribute("sessionid") != null) {
            String sessionid = (String) session.getAttribute("sessionid");
            writer.println("마이페이지 아이디 : " + sessionid + "확인되었습니다<br>");
        } else {writer.println("session 없어도 그냥 getAttribute 없는 부분은 출력해주는거 방지 ");}
    }
}
