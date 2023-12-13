package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connect {
    private static String URL = "jdbc:sqlserver://localhost:1433;databaseName=QL_BANHANG;encrypt=false";
    private static String USER = "sa";
    private static String PASSWORD = "tam";

    public static void connectDB(){
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "SELECT * FROM tbACCOUNT";
            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                System.out.println("Connect successful!");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Connect false!");
        }
    } 
}
