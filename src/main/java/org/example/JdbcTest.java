package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcTest {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/studentdb";
        String user = "iucsdc";
        String password = "iucsdc";

        try (Connection connection =
                     DriverManager.getConnection(url, user, password)) {

            System.out.println("Database connected successfully!");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
