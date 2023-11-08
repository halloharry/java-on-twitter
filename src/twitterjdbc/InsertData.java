package twitterjdbc;

import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/java_on_twitter";
        String username = "postgres";
        String password = "123";

        // pengecekan koneksi database driver kita
        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            // deklarasi query untuk menambahkan data kedalam tabel
            String insertQuery = "INSERT INTO java_twitter (username, email) VALUES (?, ?)";

            // Sql statement
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "joko");
            preparedStatement.setString(2, "joko@mail.com");

            int insertRow = preparedStatement.executeUpdate(); // ekesekusi query
            // menampilkan log jika berhasil atau tidak
            if (insertRow > 0) {
                System.out.println("Data berhasil disisipkan ke dalam tabel.");
            } else {
                System.out.println("Gagal menyisipkan data.");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
