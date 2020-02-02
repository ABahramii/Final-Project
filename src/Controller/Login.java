package Controller;

import Model.Repsitory.ConetToDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    private String empId;
    private String password;
    private String post;

    public Login(String empId, String password, String post) throws LoginException {
        this.empId = empId;
        this.password = password;
        this.post = post;

        if (this.empId.isEmpty()) {
            throw new LoginException("ENTER EMPLOYEE ID");
        }
        if (this.password.isEmpty()) {
            throw new LoginException("ENTER PASSWORD");
        }
    }

    public Boolean isValid(String empId, String password) throws SQLException {


        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPID=?");
        preparedStatement.setString(1, empId);
        ResultSet resultSet = preparedStatement.executeQuery();
        String pass = null;

        while (resultSet.next()) {
            pass = resultSet.getString("PASSWORD");
        }

        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }

    }

    public Boolean isValid2(String empId, String password) throws SQLException {

        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM BOSS WHERE USERNAME=?");
        preparedStatement.setString(1, empId);
        ResultSet resultSet = preparedStatement.executeQuery();
        String pass = null;

        while (resultSet.next()) {
            pass = resultSet.getString("password");
        }

        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }

    }

    public String getName(String empId) throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM employee WHERE empId=?");
        preparedStatement.setString(1, empId);
        ResultSet resultSet = preparedStatement.executeQuery();
        String name = null;
        while (resultSet.next()) {
            name = resultSet.getString("FNAME");
        }
        return name;
    }

    public String getName2(String empId) throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM employee WHERE empId=?");
        preparedStatement.setString(1, empId);
        ResultSet resultSet = preparedStatement.executeQuery();
        String name = null;
        while (resultSet.next()) {
            name = resultSet.getString("LNAME");
        }
        return name;
    }


}
