package com.example.demo.Db;

import java.sql.*;

public class DbUtils {

    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/text?useUnicode=true&characterEncoding=UTF-8&serverTimezone=PRC";
    private static String username="root";
    private static String password="";

    public static Connection open(){
        Connection conn=null;
        try {
                Class.forName(driver);
                conn= DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.getMessage();
        }
        return conn;
    }

    public static Connection close(ResultSet rs, PreparedStatement statement, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
