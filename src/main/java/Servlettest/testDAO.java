package Servlettest;

import java.sql.*;
import java.util.ArrayList;

public class testDAO {
    public ArrayList<testDTO> test () {

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
}
