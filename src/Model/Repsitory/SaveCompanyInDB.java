package Model.Repsitory;

import Model.Entity.Company;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveCompanyInDB {

    private Company company;

    public SaveCompanyInDB(Company company) {
        this.company = company;
    }

    public void save() throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("INSERT INTO COMPANY(name, establishdate, ownername, companyid, members, income, address, empname, empid,time,rowNumber ) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1, company.getCompanyName());
        preparedStatement.setString(2, company.getEstablishDate());
        preparedStatement.setString(3, company.getOwnerName());
        preparedStatement.setString(4, company.getCompanyId());
        preparedStatement.setString(5, company.getMembers());
        preparedStatement.setString(6, company.getIncome());
        preparedStatement.setString(7, company.getAddress());
        preparedStatement.setString(8, company.getEmpName());
        preparedStatement.setString(9, company.getEmpId());
        preparedStatement.setString(10, company.getTime());
        preparedStatement.setInt(11,company.getRowNumber());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void update() throws SQLException {
        PreparedStatement preparedStatement =
                ConetToDb.getConnection().prepareStatement("UPDATE COMPANY SET NAME=? , ESTABLISHDATE=? ,OWNERNAME=?,COMPANYID=?,MEMBERS=?,INCOME=?,ADDRESS=? WHERE ROWNUMBER=?");
        preparedStatement.setString(1,company.getCompanyName());
        preparedStatement.setString(2,company.getEstablishDate());
        preparedStatement.setString(3,company.getOwnerName());
        preparedStatement.setString(4,company.getCompanyId());
        preparedStatement.setString(5,company.getMembers());
        preparedStatement.setString(6,company.getIncome());
        preparedStatement.setString(7,company.getAddress());
        preparedStatement.setInt(8,company.getRowNumber());
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
}
