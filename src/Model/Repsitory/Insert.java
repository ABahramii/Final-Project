package Model.Repsitory;

import Controller.Employee;
import Model.Entity.Changes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Insert {


    private  static PreparedStatement pstmt = null;
    private  static Connection conn = Config.getConnect();


    private static String time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static void insertPrices(String year, int bread, int rice, int meat, int dairy, int vegetables, float cpi, float inf) throws SQLException {
        Employee employee = Employee.getInstance();
        String empId = employee.getEmpId();
        String employeName=employee.getFname()+" "+employee.getLname();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        String sql = "insert into inflation (year, bread, rice, meat, dairy, vegetables, cpi, inf, created_date, updated_date, agent_name, agent_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, year);
        pstmt.setInt(2, bread);
        pstmt.setInt(3, rice);
        pstmt.setInt(4, meat);
        pstmt.setInt(5, dairy);
        pstmt.setInt(6, vegetables);
        pstmt.setFloat(7, cpi);
        pstmt.setFloat(8, inf);
        pstmt.setString(9, time());
        pstmt.setString(10, "unchanged");
        pstmt.setString(11,employeName );
        pstmt.setString(12, empId);

        pstmt.executeUpdate();
        pstmt.close();
        Changes changes = new Changes(employeName,empId,"submit inflation",year,time);
        SaveChangesInDB saveChangesInDB = new SaveChangesInDB(changes);
    }
    public static void insertDoc(String neme, String id, String date, String path) throws SQLException {
        Employee employee = Employee.getInstance();
        String empId = employee.getEmpId();
        String employeName=employee.getFname()+" "+employee.getLname();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = dtf.format(now);
        String sql = "insert into DOCUMENTS (owner_name, owner_id, register_date, file_path, agent_name, agent_id) " +
                "values (?, ?, ?, ?, ?, ?)";

        pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, neme);
        pstmt.setString(2, id);
        pstmt.setString(3, date);
        pstmt.setString(4, path);
        pstmt.setString(5, employeName);
        pstmt.setString(6, empId);

        pstmt.executeUpdate();
        pstmt.close();
        Changes changes = new Changes(employeName,empId,"submit document",neme,time);
        SaveChangesInDB saveChangesInDB = new SaveChangesInDB(changes);
    }

}
