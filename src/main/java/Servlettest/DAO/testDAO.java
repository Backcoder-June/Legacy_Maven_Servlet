package Servlettest.DAO;

import Servlettest.DTO.testDTO;

import java.sql.*;
import java.util.ArrayList;

public class testDAO {


    public ArrayList<testDTO> selectAll() {

        Connection con = null;

        ArrayList<testDTO> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 로드하는데에 문제 발생" + e.getMessage());
            e.printStackTrace(); }



        try {
            con = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/backcoder", "backcoder", "1111");
            System.out.println("연결 완료!");

//sql

            String sql = "select * from servletmember";

            PreparedStatement pr = con.prepareStatement(sql);

            ResultSet resultSet = pr.executeQuery();


            while (resultSet.next()) {

                testDTO dto = new testDTO(resultSet.getString(1), resultSet.getString(2),
                        resultSet.getString(3));

                list.add(dto);
            }

        } catch (SQLException e) {
            System.err.println("연결 오류" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                con.close();
                System.out.println("연결 해제 성공!");
            } catch (SQLException e) {
            }
        }
        return list;
    }




    public void join(testDTO dto) {

        int condition = 0;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 로드하는데에 문제 발생" + e.getMessage());
            e.printStackTrace(); }


        try {
            con = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/backcoder", "backcoder", "1111");
            System.out.println("연결 완료!");

//sql

            String sql = "insert into servletmember values(?,?,?)";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,dto.getId());
            pr.setString(2,dto.getPw());
            pr.setString(3,dto.getName());

            int joinResult = pr.executeUpdate();

            condition = joinResult;


        } catch (SQLException e) {
            System.err.println("연결 오류" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                con.close();
                System.out.println("연결 해제 성공!");
            } catch (SQLException e) {
            }
        }

    }


    public int delete(String userid) {

        int deleteResult = 0;
        int condition = 0;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 로드하는데에 문제 발생" + e.getMessage());
            e.printStackTrace(); }


        try {
            con = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/backcoder", "backcoder", "1111");
            System.out.println("연결 완료!");

//sql

            String sql = "delete from servletmember where id = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1, userid);

            deleteResult = pr.executeUpdate();


        } catch (SQLException e) {
            System.err.println("연결 오류" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                con.close();
                System.out.println("연결 해제 성공!");
            } catch (SQLException e) {
            }
        }

        return deleteResult;
    }




    public int login(String userid, String userpw) {

        Connection con = null;
        int condition = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 로드하는데에 문제 발생" + e.getMessage());
            e.printStackTrace(); }


        try {
            con = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/backcoder", "backcoder", "1111");
            System.out.println("연결 완료!");

//sql

            String sql = "select id, pw from servletmember where id=?";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1,userid);
            ResultSet rs = pt.executeQuery();

            String dbid= null;
            String dbpw = null;
            if (rs.next()) {
                condition=1;

                dbid = rs.getString("id");
                dbpw = rs.getString("pw");

                if (dbpw.equals(userpw)) {
                    condition=2;
                }
            } else {condition = 3; }

        } catch (SQLException e) {
            System.err.println("연결 오류" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                con.close();
                System.out.println("연결 해제 성공!");
            } catch (SQLException e) {
            }
        }
        return condition;
    }





//
}
