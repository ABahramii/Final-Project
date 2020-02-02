package Model.Repsitory;

import Model.Entity.Unemployment;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveUnemploymentInDB {

    private Unemployment unemployment;

    public SaveUnemploymentInDB(Unemployment unemployment) {
        this.unemployment = unemployment;
    }

    public void save() throws SQLException {
        PreparedStatement preparedStatement =
                ConetToDb.getConnection().prepareStatement("INSERT INTO UNEMPLOYMENT(year, count, empid, empname ,time) VALUES (?,?,?,?,?)");
        preparedStatement.setString(1, unemployment.getYear());
        preparedStatement.setString(2, unemployment.getCount());
        preparedStatement.setString(3, unemployment.getEmpId());
        preparedStatement.setString(4, unemployment.getEmpName());
        preparedStatement.setString(5, unemployment.getTime());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
