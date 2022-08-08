package Servlet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/connection")
public class ConPool_test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");

            /*for (int i = 0; i<1000; i++) {
                Connection con = null;
                con = DriverManager.getConnection
                        ("jdbc:mysql://127.0.0.1:3306/backcoder", "backcoder", "1111");
                System.out.println("연결 완료!");
                con.close();
            }
            //20초 걸렸다 이렇게 매번 드라이버연결 서버연결 종료 하면 오래걸림
            => Connection pool 사용  */

            // context.xml 에서 Resource 설정해두고 그거 가져오기

            //1. context.xml 파일 정의해둔 내용 읽어올 준비
            Context initcontext = new InitialContext();
            //2. Resource 태그 설정 읽어와
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            // java -component - environment 파일  type 읽고
            // ( 1~2 고정 )
            //3. name 연결고리로 db 골라서 가져오기
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            // 고른 db 로 가져와서 connection pooling 용 객체 생성

            long start = System.currentTimeMillis();

                Connection con = ds.getConnection(); //미리 생성해둔 con 가져오는 것
                System.out.println("연결성공");
                con.close();

            long stop = System.currentTimeMillis();
            System.out.println((stop - start) / 1000 + "초 소요");
// 1초 소요

        } catch (Exception e) {
            System.err.println("JDBC 드라이버를 로드하는데에 문제 발생" + e.getMessage());
            e.printStackTrace();
        }

    }
}











