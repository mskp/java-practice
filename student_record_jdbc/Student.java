package com.sus.student_record_jdbc;

import java.sql.*;

public class Student {
    public static Statement connect(String url, String userName, String password) {
        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            return con.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public static boolean insert(int rollNo, String name, String email) {
        try (Statement state = connect("jdbc:mysql://localhost:3306/sushant", "root", "")) {
            if (state == null) return false;

            String query = String.format("INSERT INTO student(r_no, name, email) VALUES('%d', '%s', '%s')", rollNo, name, email);
            try {
                state.executeUpdate(query);
                return true;
            } catch (SQLException e) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean delete(int rollNo) {
        try (Statement state = connect("jdbc:mysql://localhost:3306/sushant", "root", "")) {
            if (state == null) return false;

            String query = String.format("DELETE FROM student WHERE r_no=%d", rollNo);
            try {
                state.executeUpdate(query);
                return true;
            } catch (SQLException e) {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }

    public static void display() {
        try (Statement state = connect("jdbc:mysql://localhost:3306/sushant", "root", "");) {
            if (state == null) return;

            String query = "SELECT * FROM student";
            try {
                ResultSet rs = state.executeQuery(query);

                while (rs.next()) {
                    System.out.printf("""
                            Roll No: %d
                            Name: %s
                            Email: %s
                            """, rs.getInt("r_no"), rs.getString("name"), rs.getString("email"));
                }
            } catch (SQLException ignored) {
            }
        } catch (SQLException ignored) {
        }
    }
}
