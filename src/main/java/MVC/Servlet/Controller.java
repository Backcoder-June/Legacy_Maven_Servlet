package MVC.Servlet;

import Servlet.DAO.BoardDAO;
import Servlet.DAO.memberDAO;
import Servlet.DTO.BoardDTO;
import Servlet.DTO.memberDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/starting")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String service = req.getParameter("menu");
        String jspfile ="";


        //로그인 세션
        //( 로그인이 없을시 Guest 만들기 위해 굳이 세션을 생성하면 낭비다 =>
        // VIEW 단에서 조종하자. )

        if (service.equalsIgnoreCase("로그인")) {
            if (req.getParameter("id") != null) {

                String id = req.getParameter("id");
                String pw = req.getParameter("pw");

                memberDAO dao = new memberDAO();
                int condition = dao.login(id, pw);


                if (condition == 2) {

                    HttpSession idsession = req.getSession();
                    idsession.setAttribute("userid", id);

                    jspfile = "/MVC/logined_Home.jsp";
                } else if (condition == 1 || condition == 3) {

                    jspfile = "/MVC/loginFail.jsp";
                }
            }
        }

        if (service.equalsIgnoreCase("로그아웃")) {
            HttpSession logoutSession = req.getSession();
            logoutSession.removeAttribute("userid");
            jspfile = "/MVC/Home.jsp";
        }


        if (service.equalsIgnoreCase("memberlist")) {
            memberDAO dao = new memberDAO();
            ArrayList<memberDTO> list = dao.selectAll();
            req.setAttribute("allmember", list );
            jspfile = "/MVC/allmember.jsp";
        }


        if (service.equalsIgnoreCase("allboard")) {
            BoardDAO bdao = new BoardDAO();

            ArrayList<BoardDTO> allboard = bdao.Allboard();
            req.setAttribute("allboard", allboard);
            jspfile = "/MVC/allboard.jsp";
        }

        // 게시물 작성
        if (service.equalsIgnoreCase("boardwriting")) {
            jspfile = "/MVC/boardwriting.jsp";
        }

        // 여기 post 로 서블릿 따로 메소드 하나 짜서 옮기자
        if (service.equalsIgnoreCase("작성")) {
            BoardDTO boardDTO = new BoardDTO();

            boardDTO.setTitle(req.getParameter("title"));
            boardDTO.setContents(req.getParameter("contents"));
            boardDTO.setWriter(req.getParameter("writer"));

            BoardDAO boardDAO = new BoardDAO();
            boardDAO.saveBoard(boardDTO);

            jspfile = "/MVC/boardsuccess.jsp";
        }

        // 회원가입
        if (service.equalsIgnoreCase("회원가입")) {

            memberDTO dto = new memberDTO(req.getParameter("id"), req.getParameter("pw"), req.getParameter("name"));
            memberDAO dao = new memberDAO();

            int condition = dao.login(req.getParameter("id"), req.getParameter("pw"));
            if (condition==3) {
                dao.join(dto);
                jspfile = "/MVC/joinsuccess.jsp";
            } else {
                jspfile = "/MVC/joinfail.jsp";
            }

        }

        if (service.equalsIgnoreCase("회원탈퇴")) {

            memberDAO dao = new memberDAO();

            int condition = dao.login(req.getParameter("id"), req.getParameter("pw"));

            if (condition == 2) {

                dao.delete(req.getParameter("id"));
                // 세션도 같이 삭제 해줘야지
                HttpSession deleteSession = req.getSession();
                deleteSession.invalidate();

                jspfile = "/MVC/deletesuccess.jsp";
            }else {
                jspfile = "/MVC/deletefail.jsp";
            }
        }


        // 내 게시물
        if (service.equalsIgnoreCase("myboard")) {
            BoardDAO dao = new BoardDAO();

            BoardDTO myboard = dao.myboard(Integer.parseInt(req.getParameter("id")));
            req.setAttribute("myboard", myboard);
            jspfile = "/MVC/myboard.jsp";

        }

        // 수정 페이지
        if (service.equalsIgnoreCase("수정하기")) {

            BoardDAO dao = new BoardDAO();
            BoardDTO target = dao.myboard(Integer.parseInt(req.getParameter("id")));

            req.setAttribute("myboard", target);

            jspfile = "/MVC/boardediting.jsp";
        }

        // 수정
        if (service.equalsIgnoreCase("수정")) {
            BoardDTO dto = new BoardDTO();

            dto.setId(Integer.parseInt(req.getParameter("id")));
            dto.setTitle(req.getParameter("title"));
            dto.setContents(req.getParameter("contents"));
            dto.setWriter(req.getParameter("writer"));

            BoardDAO dao = new BoardDAO();
            dao.editBoard(dto);

            req.setAttribute("myboard", dto );
             jspfile = "/MVC/myboard.jsp";
        }

        if (service.equalsIgnoreCase("FBI")) {
            HttpSession session2 = req.getSession();
            String sessionid = (String)session2.getAttribute("userid");

            BoardDAO dao = new BoardDAO();
            ArrayList<BoardDTO> fbi = dao.fbi(sessionid);
            req.setAttribute("fbi", fbi);
            jspfile = "/MVC/FBIboards.jsp";
        }


        RequestDispatcher rd = req.getRequestDispatcher(jspfile);
        rd.forward(req, resp);


    }
}
