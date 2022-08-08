package Servlet.Service;

import Servlet.DAO.memberDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class login_Service extends HttpServlet {

    memberDAO dao = new memberDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        String role = req.getParameter("role");

        int condition = dao.login(id,pw);

        String output = "";

        if (condition == 2) {

            if (role.equals("admin")) {
                output = id + " 관리자님 로그인 되셨습니다.";
                output += "<ul><li> <a href = 'members'>모든 사용자 정보 조회</a></li><br>";
                output += "<li>블랙리스트 관리</li><br>";
                output += "<li>서비스 관리</li></ul><br>";


            } else if (role.equals("user")) {
                output = id + "사용자님 환영합니다!";
                output += "<ul><li> <a href='update.html'>내정보 수정</a></li><br>";
                output += "<li><a href ='delete.html'>회원 탈퇴</a></li><br>";
                output += "<li><a href = 'board.html'>게시판 이용</a></li></ul><br>";
            }
        } else if(condition == 1 ){
            output = "비밀번호가 일치하지않습니다";
        }
        else{
            output = "<a href = 'join.html'>회원가입이 필요합니다</a>";}

        resp.getWriter().println(output);
    }
}
