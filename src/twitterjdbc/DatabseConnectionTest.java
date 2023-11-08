package twitterjdbc;

import java.sql.*;

public class DatabseConnectionTest {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/java_on_twitter";
        String username = "postgres";
        String password = "123";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            if (connection != null) {
                System.out.println("Koneksi ke database berhasil!");
            }
        } catch (SQLException e) {
            System.err.println("Koneksi ke database gagal: " + e.getMessage());
        }
    }
}
