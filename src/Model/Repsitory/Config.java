package Model.Repsitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private  static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private  static String user = "admin";
    private  static String pass = "amir99";
    private static Connection conn;
    public static Connection getConnect() {
        try {
            if (conn == null){
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(url, user, pass);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Failed to create the database connection.");
        }
        return conn;
    }

    public void connClose() throws SQLException {
        conn.close();
    }
}