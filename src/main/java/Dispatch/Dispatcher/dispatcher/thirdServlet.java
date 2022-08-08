package Dispatch.Dispatcher.dispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/third")
public class thirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=utf-8");
        req.setCharacterEncoding("utf-8");


        // getAttribute 는 Object 타입으로 반화함. 형변환 해서 받자
        String upperid = (String)req.getAttribute("upperid");

        resp.getWriter().println(upperid + "회원님 안녕히가세요.");


    }
}
