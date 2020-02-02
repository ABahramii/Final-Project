package Model.Repsitory;

import Controller.Employee;
import Model.Entity.Changes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Update {
    private static PreparedStatement pstmt = null;
    private static Connection conn = Config.getConnect();

    private static String time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static void updatePrices(String year, int bread, int rice, int meat, int dairy, int vegetables, float cpi, float inf) throws SQLException {
        Employee employee = Employee.getInstance();
        String empId = employee.getEmpId();
        String employeName=employee.getFname()+" "+employee.getLname();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        String sql = "UPDATE INFLATION SET " +
                "bread = ?," +
                " rice = ?," +
                " meat = ?," +
                " dairy = ?," +
                " vegetables = ?," +
                " cpi = ?," +
                " inf = ?," +
                " updated_date = ?," +
                " agent_name = ?," +
                " agent_id = ?" +
                " where year = ?";

        pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, bread);
        pstmt.setInt(2, rice);
        pstmt.setInt(3, meat);
        pstmt.setInt(4, dairy);
        pstmt.setInt(5, vegetables);
        pstmt.setFloat(6, cpi);
        pstmt.setFloat(7, inf);
        pstmt.setString(8, time());
        pstmt.setString(9, employeName);
        pstmt.setString(10, empId);
        pstmt.setString(11, year);

        pstmt.executeUpdate();
        pstmt.close();
        Changes changes = new Changes(employeName,empId,"edit inflation",year,time);
        SaveChangesInDB saveChangesInDB = new SaveChangesInDB(changes);
    }

    public static void updateNextInflation(String year, float inf) throws SQLException {
        Employee employee = Employee.getInstance();
        String empId = employee.getEmpId();
        String employeName=employee.getFname()+" "+employee.getLname();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        String sql = "UPDATE INFLATION SET inf = ?, updated_date = ?, agent_name = ?, agent_id = ? where year = ?";

        pstmt = conn.prepareStatement(sql);

        pstmt.setFloat(1, inf);
        pstmt.setString(2, time());
        pstmt.setString(3, employeName);
        pstmt.setString(4, empId);
        pstmt.setString(5, year);

        pstmt.executeUpdate();
        pstmt.close();
        Changes changes = new Changes(employeName,empId,"edit inflation",year,time);
        SaveChangesInDB saveChangesInDB = new SaveChangesInDB(changes);
    }

}

