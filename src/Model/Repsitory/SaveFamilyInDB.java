package Model.Repsitory;

import Model.Entity.Family;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveFamilyInDB {

    private Family family;

    public SaveFamilyInDB(Family family) {
        this.family = family;
    }

    public SaveFamilyInDB() {
    }

    public void saveFamily() throws SQLException {
        PreparedStatement preparedStatement =
                ConetToDb.getConnection().prepareStatement("insert INTO family(familyName,familyOwnerId,familyIncome,familyCount,FAMILYADDRESS) VALUES (?,?,?,?,?)");

        preparedStatement.setString(1, family.getFamilyOwnerLName());
        preparedStatement.setString(2, family.getFamilyOwnerId());
        preparedStatement.setString(3, family.getFamilyIncome());
        preparedStatement.setInt(4, family.getFamilyCount());
        preparedStatement.setString(5, family.getFamilyAddress());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void updateIncome(String id,String income) throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("UPDATE FAMILY SET FAMILYINCOME=? WHERE FAMILYOWNERID=?");
        preparedStatement.setString(1,income);
        preparedStatement.setString(2,id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }


}
