package Dispatch.Dispatcher.dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first")
public class firstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        String id = req.getParameter("id");
        id = id.toUpperCase();

        req.setAttribute("upperid", id);
        RequestDispatcher rd = req.getRequestDispatcher("second");
        rd.forward(req, resp);

        // firstServlet 에서 처리한걸


        // 넘겨받을 Webservlet url / 이후



        // second 로 갔다가 처리하고 다시 first로 돌아옴
        // first 에서도 응답값 출력 가능
//        rd.include(req, resp);

        /*
        RequestDispatcher rd2 = req.getRequestDispatcher("third");
        rd2.forward(req, resp);
*/

    }

}
