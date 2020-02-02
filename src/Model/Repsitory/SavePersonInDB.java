package Model.Repsitory;

import Model.Entity.Person;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SavePersonInDB {

    private Person person;

    public SavePersonInDB(Person person) {
        this.person = person;
    }

    public void savePerson() throws SQLException {

        PreparedStatement preparedStatement =
                ConetToDb.getConnection().prepareStatement
                        ("INSERT INTO person(fName,lName,idNumber,age,gender,role,job,familyOwnerId,income,address,time,empName,empId,operation,rowNumber ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

        preparedStatement.setString(1, person.getfName());
        preparedStatement.setString(2, person.getlName());
        preparedStatement.setString(3, person.getIdNumber());
        preparedStatement.setInt(4, person.getAge());
        preparedStatement.setString(5, person.getGender());
        preparedStatement.setString(6, person.getRole());
        preparedStatement.setString(7, person.getJob());
        preparedStatement.setString(8, person.getFamilyOwnerId());
        preparedStatement.setString(9, person.getIncome());
        preparedStatement.setString(10, person.getAddress());
        preparedStatement.setString(11, person.getTime());
        preparedStatement.setString(12, person.getEmpName());
        preparedStatement.setString(13, person.getEmpId());
        preparedStatement.setString(14, person.getOperation());
        preparedStatement.setInt(15,person.getRowNumber());
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    public void update() throws SQLException {

        PreparedStatement preparedStatement =
                ConetToDb.getConnection().prepareStatement("UPDATE PERSON SET FNAME=?,LNAME=?,IDNUMBER=?,AGE=?,GENDER=?,ROLE=?,JOB=?,FAMILYOWNERID=?,INCOME=?,ADDRESS=?,TIME=?,OPERATION=? WHERE ROWNUMBER=?");
        preparedStatement.setString(1,person.getfName());
        preparedStatement.setString(2,person.getlName());
        preparedStatement.setString(3,person.getIdNumber());
        preparedStatement.setInt(4,person.getAge());
        preparedStatement.setString(5,person.getGender());
        preparedStatement.setString(6,person.getRole());
        preparedStatement.setString(7,person.getJob());
        preparedStatement.setString(8,person.getFamilyOwnerId());
        preparedStatement.setString(9,person.getIncome());
        preparedStatement.setString(10,person.getAddress());
        preparedStatement.setString(11,person.getTime());
        preparedStatement.setString(12,person.getOperation());
        preparedStatement.setInt(13,person.getRowNumber());
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

}
