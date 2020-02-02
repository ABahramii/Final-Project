package Model.Repsitory;

import Model.Entity.Unemployement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveUnemployementInDB {
    private Unemployement unemployement;

    public SaveUnemployementInDB(Unemployement unemployement) {
        this.unemployement = unemployement;
    }

    public void save() throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("INSERT INTO UNEMPLOYEMENT(employement, unemployement, year, rate, empname, empid, time, rownumber) VALUES (?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,unemployement.getEmployement());
        preparedStatement.setString(2,unemployement.getUnemployement());
        preparedStatement.setString(3,unemployement.getYear());
        preparedStatement.setFloat(4,unemployement.getRate());
        preparedStatement.setString(5,unemployement.getEmpName());
        preparedStatement.setString(6,unemployement.getEmpId());
        preparedStatement.setString(7,unemployement.getTime());
        preparedStatement.setInt(8,unemployement.getRowNumber());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void update() throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("UPDATE UNEMPLOYEMENT SET EMPLOYEMENT=?,UNEMPLOYEMENT=?,RATE=?,TIME=? WHERE YEAR=?");
        preparedStatement.setString(1,unemployement.getEmployement());
        preparedStatement.setString(2,unemployement.getUnemployement());
        preparedStatement.setFloat(3,unemployement.getRate());
        preparedStatement.setString(4,unemployement.getTime());
        preparedStatement.setString(5,unemployement.getYear());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
