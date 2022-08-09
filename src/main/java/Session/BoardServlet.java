package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();


            String sessionid = (String)session.getAttribute("sessionid");

        if (sessionid == null) {
            sessionid = "Guest";
        }

        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        String ouput = "<h1> Board </h1>";

        ouput += "<table border = 5>";
        ouput += "<tr><th>제목</th><td><input type ='text' name = 'title'></td></tr>";
        ouput += "<tr><th>내용</th><td><textarea name = 'contents' rows=5 cols=50></textarea></td></tr>";
        ouput += "<tr><th>작성자</th><td><input type ='text' name = 'writer'" +
                "value="+sessionid+" readonly></td></tr>";

        ouput += "</table>";


        writer.println(ouput);


    }
}
