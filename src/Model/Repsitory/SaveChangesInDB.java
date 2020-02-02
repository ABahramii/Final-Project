package Model.Repsitory;

import Model.Entity.Changes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveChangesInDB {

    private Changes changes;

    public SaveChangesInDB(Changes changes) {
        this.changes = changes;
    }

    public void saveChange() throws SQLException {
        PreparedStatement preparedStatement =
                ConetToDb.getConnection().prepareStatement("INSERT INTO changes(empName,empId,operation,idChanged,time) VALUES (?,?,?,?,?)");

        preparedStatement.setString(1, changes.getEmpName());
        preparedStatement.setString(2, changes.getEmpId());
        preparedStatement.setString(3, changes.getOperation());
        preparedStatement.setString(4, changes.getIdChanged());
        preparedStatement.setString(5, changes.getTime());
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
}
