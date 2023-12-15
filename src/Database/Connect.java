package Database;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Connect {
    private static String URL = "jdbc:sqlserver://localhost:1433;databaseName=QL_BANHANG;encrypt=false";
    private static String USER = "sa";
    private static String PASSWORD = "tam";

    public static void connectDB() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connect successful!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Connect false!");
        }
    }

    public static boolean querySelect(String sql) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            try (PreparedStatement statement = connection.prepareStatement(sql);
                    ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String email = resultSet.getString("email");
                    String password = resultSet.getString("password");
                    if (email.equals("") && password.equals("")) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Select Lỗi!");
            return false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
