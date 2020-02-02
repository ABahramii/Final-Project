package Model.Repsitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConetToDb {

    public static Connection connection;

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "a", "1");
        System.out.println("conect ok");
    }

    public static Connection getConnection() {
        return connection;
    }
}
