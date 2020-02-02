package Model.Repsitory;

import Model.Entity.Employee2;
import oracle.jdbc.proxy.annotation.Pre;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveEmployeInDB {
    private Employee2 employee2;

    public SaveEmployeInDB(Employee2 employee2) {
        this.employee2 = employee2;
    }

    public void save() throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("INSERT INTO EMPLOYEE(fname, empid, password, lname,ROWNUMBER) VALUES (?,?,?,?,?)");
        preparedStatement.setString(1,employee2.getfName());
        preparedStatement.setString(2,employee2.getIdNumber());
        preparedStatement.setString(3,employee2.getPassword());
        preparedStatement.setString(4,employee2.getlName());
        preparedStatement.setInt(5,employee2.getRowNumber());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void update() throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("UPDATE EMPLOYEE SET EMPID=?,LNAME=?,FNAME=?,PASSWORD=? WHERE ROWNUMBER=?");
        preparedStatement.setString(1,employee2.getIdNumber());
        preparedStatement.setString(2,employee2.getlName());
        preparedStatement.setString(3,employee2.getfName());
        preparedStatement.setString(4,employee2.getPassword());
        preparedStatement.setInt(5,employee2.getRowNumber());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
