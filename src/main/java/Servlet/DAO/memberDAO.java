package Servlet.DAO;

import Servlet.DTO.memberDTO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

public class memberDAO {


    public ArrayList<memberDTO> selectAll() {

        Connection con = null;

        ArrayList<memberDTO> list = new ArrayList<>();

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "select * from servletmember";

            PreparedStatement pr = con.prepareStatement(sql);

            ResultSet resultSet = pr.executeQuery();


            while (resultSet.next()) {

                memberDTO dto = new memberDTO(resultSet.getString(1), resultSet.getString(2),
                        resultSet.getString(3));

                list.add(dto);
            }

        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return list;
    }
/*
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

                memberDTO dto = new memberDTO(resultSet.getString(1), resultSet.getString(2),
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

*/



    public void join(memberDTO dto) {

        int condition = 0;
        Connection con = null;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "insert into servletmember values(?,?,?)";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,dto.getId());
            pr.setString(2,dto.getPw());
            pr.setString(3,dto.getName());

            int joinResult = pr.executeUpdate();

            condition = joinResult;


        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }



    }
     /*   try {
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
*/

    public int delete(String userid) {

        int deleteResult = 0;
        Connection con = null;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
             con = ds.getConnection();

//sql
            String sql = "delete from servletmember where id = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1, userid);

            deleteResult = pr.executeUpdate();

        } catch ( Exception e) {
            e.printStackTrace();
        } finally {
            try { con.close();}
            catch ( Exception e) {}
        }

        return deleteResult;
    }
        /*try {
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

*/


    public int login(String userid, String userpw) {

        Connection con = null;
        int condition = 0;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();


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


} catch (Exception e) { e.printStackTrace();}
finally { try {con.close(); } catch (Exception e) {} }

        return condition;
    }

        /*
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
*/




    public int edit(memberDTO dto) {

        Connection con = null;

        int editResult = 0;
        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "update servletmember set name = ? where id = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,dto.getName());
            pr.setString(2,dto.getId());

            editResult = pr.executeUpdate();



        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return editResult;

    }






//
}
