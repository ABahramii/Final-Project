package Controller;

import Model.Repsitory.ConetToDb;
import oracle.jdbc.proxy.annotation.Pre;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InputContorollers {


    public static char checkName(String firstname) {
        String specialChar = "-/?@~|.#$*%^&_+=()><!,:';";

        char result = 'c';

        if (firstname.matches(".*\\d.*") || firstname.matches(".*[" + specialChar + "]+.*"))
            result = 'l';

        if (firstname.length() == 0)
            result = 'e';

        if (firstname.length() > 40)
            result = 'o';

        return result;
    }

    public static char checkNation(String nationCode) throws SQLException {
        char result = 'c';

        if (nationCode.length() != 10)
            result = 'l';

        if (!nationCode.matches("[0-9]+"))
            result = 's';

        if (isValidfmilyOwnerId(nationCode))
            result = 'm';

        return result;
    }

    public static char checkNation2(String nationCode) throws SQLException {
        char result = 'c';

        if (nationCode.length() != 10)
            result = 'l';

        if (!nationCode.matches("[0-9]+"))
            result = 's';

        if (checkAgentId(nationCode))
            result = 'm';

        return result;
    }

    public static boolean checkAgentId(String idNumber) throws SQLException {
        boolean b=false;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPID=?");
        preparedStatement.setString(1,idNumber);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            b=true;
        }
        return b;
    }

    public static char checkFamilyOwnerId(String nationCode, String idNumber) throws SQLException {
        char result = 'c';

        if (nationCode.length() != 10)
            result = 'l';

        if (!nationCode.matches("[0-9]+"))
            result = 's';

        if (!isValidfmilyOwnerId(nationCode) && (!nationCode.equals(idNumber))) {
            result = 'm';
        }
        return result;
    }

    public static char checkIncome(String income) {
        char result = 'c';

        if (income.length() == 0)
            result = 'e';

        if (!income.matches("[0-9]+"))
            result = 's';

        return result;
    }

    public static boolean checkUnemploymentYear(String year) throws SQLException {
        boolean b=false;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM UNEMPLOYEMENT WHERE YEAR=?");
        preparedStatement.setString(1,year);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            b=true;
        }
        return b;
    }

    public static boolean checkSubmitUnemployement(String emp,String unEmp,String year) throws SQLException {

        boolean b=true;
        if(emp.isEmpty() || unEmp.isEmpty() || year.isEmpty() || checkUnemploymentYear(year) || checkIncome(emp)=='s' || checkIncome(unEmp)=='s')
            b=false;

        return b;
    }

    public static boolean checkSubmitUnemployement2(String emp,String unEmp,String year) throws SQLException {

        boolean b=true;
        if(emp.isEmpty() || unEmp.isEmpty() || year.isEmpty() || (!checkUnemploymentYear(year)) || checkIncome(emp)=='s' || checkIncome(unEmp)=='s')
            b=false;

        return b;
    }

    public static int getRowUnemployment(String year) throws SQLException {
        int row=0;
        PreparedStatement preparedStatement=ConetToDb.getConnection().prepareStatement("SELECT * FROM UNEMPLOYEMENT WHERE YEAR=?");
        preparedStatement.setString(1,year);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            row=resultSet.getInt("ROWNUMBER");
        }
        return row;
    }


    public static char checkMemberAge(String member) {
        char result = 'c';

        if (member.length() > 3)
            result = 'l';

        if (member.length() == 0)
            result = 'e';

        if (!member.matches("[0-9]+"))
            result = 's';

        return result;
    }

    public static char checkAddress(String address) {
        String specialChar = "?@~|$%^&><!;";

        char result = 'c';

        if (address.matches(".*[" + specialChar + "]+.*"))
            result = 's';

        if (address.length() == 0)
            result = 'e';

        if (address.length() > 4000)
            result = 'o';

        return result;
    }

    public static char checkMember(String member) {

        char result = 'c';
        if (!member.matches("[0-9]+")) {
            result = 's';
        }

        if (member.length() == 0) {
            result = 'e';
        }

        return result;
    }

    public static boolean isValidfmilyOwnerId(String id) throws SQLException {
        boolean b = false;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM person where idNumber=?");
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            b = true;
        }
        return b;
    }

    public static String getAddress(String id) throws SQLException {
        String address = null;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("select * from person where idNumber=?");
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            address = resultSet.getString("address");
        }
        return address;
    }

    public static String getSelectedJob(int index) {
        String job = null;

        if (index == 0) {
            job = "employee";
        } else if (index == 1) {
            job = "labor";
        } else if (index == 2) {
            job = "doctor";
        } else if (index == 3) {
            job = "teacher";
        } else if (index == 4) {
            job = "student";
        } else if (index == 5) {
            job = "housewife";
        } else if (index == 6) {
            job = "freelancer";
        } else if (index == 7) {
            job = "other";
        }

        return job;
    }

    public static int getFamilyCount(String familyOwnerId) throws SQLException {

        int count = 0;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM family WHERE familyOwnerId=?");
        preparedStatement.setString(1, familyOwnerId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            count = resultSet.getInt("familyCount");
        }
        return count;

    }

    public static int getFamilyIncome(String familyOwnerId) throws SQLException {

        int income = 0;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM family WHERE familyOwnerId=?");
        preparedStatement.setString(1, familyOwnerId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            income += Integer.parseInt(resultSet.getString("familyIncome"));
        }
        return income;

    }

    public static void updateFamilyCount(String familyOwnerId, int count) throws SQLException {

        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("UPDATE family SET familyCount=? WHERE familyOwnerId=?");
        preparedStatement.setInt(1, count);
        preparedStatement.setString(2, familyOwnerId);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    public static void updateFamilyIncome(String familyOwnerId, int income) throws SQLException {

        String familyIncome = String.valueOf(income);
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("UPDATE family SET familyIncome=? WHERE familyOwnerId=?");
        preparedStatement.setString(1, familyIncome);
        preparedStatement.setString(2, familyOwnerId);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    public static boolean checkRole(String role, String gender, String job) {

        boolean b = false;
        if (role.equals("father") && gender.equals("female"))
            b = true;

        if (role.equals("mother") && gender.equals("male"))
            b = true;

        return b;
    }

    public static boolean checkSubmit2
            (String fName, String lName, String idNumber, String age, String gender, String role, String job, String familyOwnerId, String income, String address,int rowNUmber) throws SQLException, SubmitException {

        boolean b = true;
        if (fName.isEmpty() || lName.isEmpty() || idNumber.isEmpty() || gender.equals("null") ||
                role.equals("null") || job.equals("null") || familyOwnerId.isEmpty() || income.isEmpty() || address.isEmpty() || age.isEmpty() ) {
            b = false;

        }
        if (checkName(fName) == 'l' || checkName(lName) == 'l' || checkNation(idNumber) == 's' || checkNation(idNumber) == 'l' ||
                checkFamilyOwnerId(familyOwnerId, idNumber) == 'l' || checkFamilyOwnerId(familyOwnerId, idNumber) == 's' || checkFamilyOwnerId(familyOwnerId, idNumber) == 'm' ||
                checkIncome(income) == 's' || checkMemberAge(age) == 'l' || checkMemberAge(age) == 's' || checkAddress(address) == 'l' || checkAddress(address) == 'o' || checkRole(role, gender, job)) {
            b = false;
        }

        if(!getPersonId(rowNUmber).equals(idNumber)){
            if(checkNation(idNumber)=='m'){
                b=false;
            }
        }

        return b;
    }

    public static boolean checkSubmit
            (String fName, String lName, String idNumber, String age, String gender, String role, String job, String familyOwnerId, String income, String address) throws SQLException, SubmitException {

        boolean b = true;
        if (fName.isEmpty() || lName.isEmpty() || idNumber.isEmpty() || gender.equals("null") ||
                role.equals("null") || job.equals("null") || familyOwnerId.isEmpty() || income.isEmpty() || address.isEmpty() || age.isEmpty() || isValidfmilyOwnerId(idNumber)) {
            b = false;

        }
        if (checkName(fName) == 'l' || checkName(lName) == 'l' || checkNation(idNumber) == 's' || checkNation(idNumber) == 'l' ||
                checkFamilyOwnerId(familyOwnerId, idNumber) == 'l' || checkFamilyOwnerId(familyOwnerId, idNumber) == 's' || checkFamilyOwnerId(familyOwnerId, idNumber) == 'm' ||
                checkIncome(income) == 's' || checkMemberAge(age) == 'l' || checkMemberAge(age) == 's' || checkAddress(address) == 'l' || checkAddress(address) == 'o' || checkRole(role, gender, job)) {
            b = false;
        }

        return b;
    }

    public static boolean checkAgentSubmit(String fname,String lname,String password,String idNumber,int rowNumber) throws SQLException {
        Boolean b=true;
        if(fname.isEmpty() || lname.isEmpty() || password.isEmpty() || idNumber.isEmpty() || checkName(fname) == 'l' || checkName(lname) == 'l'|| checkNation2(idNumber) == 's' || checkNation2(idNumber) == 'l'){
            b=false;
        }
        if(!getAgentId(rowNumber).equals(idNumber)){
            if(checkNation2(idNumber)=='m'){
                b=false;
            }
        }
        return b;
    }

    public static String getAgentId(int rowNumber) throws SQLException {
        String id=null;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM EMPLOYEE WHERE ROWNUMBER=?");
        preparedStatement.setInt(1,rowNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            id=resultSet.getString("EMPID");
        }
        return id;
    }
    public static boolean checkAgentSubmit2(String fname,String lname,String password,String idNumber) throws SQLException {
        Boolean b=true;
        if(fname.isEmpty() || lname.isEmpty() || password.isEmpty() || idNumber.isEmpty() || checkName(fname) == 'l' || checkName(lname) == 'l'|| checkNation2(idNumber) == 's' || checkNation2(idNumber) == 'l' || checkNation2(idNumber)=='m'){
            b=false;
        }
        return b;
    }

    public static boolean checkCompanySubmit(String name, String stablish, String ownerName, String companyId, String member, String income, String address) throws SQLException {

        boolean b = true;
        if (name.isEmpty() || stablish.equals("null") || ownerName.isEmpty() || companyId.isEmpty() || member.isEmpty() || income.isEmpty() || address.isEmpty()) {
            b = false;
        }

        if (checkCompanyName(name) == 'm' || checkCompanyName(name) == 'l' || checkName(ownerName) == 'l' || checkCompanyId(companyId) == 'm' || checkCompanyId(companyId) == 'l' ||
                checkCompanyId(companyId) == 's' || checkMember(member) == 's' || checkIncome(income) == 's' || checkAddress(address) == 's') {
            b = false;
        }
        return b;
    }
    public static boolean checkCompanySubmit2(String name, String stablish, String ownerName, String companyId, String member, String income, String address,int rowNumber) throws SQLException {

        boolean b = true;
        if (name.isEmpty() || stablish.equals("null") || ownerName.isEmpty() || companyId.isEmpty() || member.isEmpty() || income.isEmpty() || address.isEmpty()) {
            b = false;
        }

        if ( checkCompanyName(name) == 'l' || checkName(ownerName) == 'l'  || checkCompanyId(companyId) == 'l' ||
                checkCompanyId(companyId) == 's' || checkMember(member) == 's' || checkIncome(income) == 's' || checkAddress(address) == 's') {
            b = false;
        }
        if(!InputContorollers.getCompanyId(rowNumber,"NAME").equals(name)){
            if(checkCompanyName(name)=='m'){
                b=false;
            }
        }
        if(!InputContorollers.getCompanyId(rowNumber,"COMPANYID").equals(companyId)){
            if(checkCompanyId(companyId)=='m'){
                b=false;
            }
        }
        return b;
    }

    public static boolean submitUnemployment(String year, String count) throws SQLException {

        boolean b = true;
        if (checkIncome(count) == 's' || checkIncome(count) == 'e' || checkYear(year))
            b = false;
        return b;
    }

    public static boolean isCompanyIdValid(String companyId) throws SQLException {

        boolean b = false;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM company WHERE companyId=?");
        preparedStatement.setString(1, companyId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            b = true;
        }
        return b;
    }

    public static char checkCompanyId(String companyId) throws SQLException {
        char result = 'c';

        if (companyId.length() != 10)
            result = 'l';

        if (!companyId.matches("[0-9]+"))
            result = 's';

        if (isCompanyIdValid(companyId))
            result = 'm';

        return result;
    }

    public static boolean isValidCompanyName(String companyName) throws SQLException {
        boolean b = false;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM company WHERE NAME=?");
        preparedStatement.setString(1, companyName);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            b = true;
        }
        return b;
    }

    public static char checkCompanyName(String companyName) throws SQLException {

        String specialChar = "-/?@~|.#$*%^&_+=()><!,:';";
        char result = 'c';
        if (isValidCompanyName(companyName)) {
            result = 'm';
        }
        if (companyName.matches(".*\\d.*") || companyName.matches(".*[" + specialChar + "]+.*"))
            result = 'l';

        if (companyName.length() == 0)
            result = 'e';

        return result;

    }

    public static boolean checkYear(String year) throws SQLException {
        boolean b = false;
        PreparedStatement preparedStatement =
                ConetToDb.getConnection().prepareStatement("SELECT * FROM UNEMPLOYMENT WHERE YEAR=?");
        preparedStatement.setString(1, year);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            b = true;
        }
        return b;
    }

    public  static  ResultSet search(String table,String field,String search) throws SQLException {
        String sql="SELECT * FROM "+table +" WHERE "+ field +"=?";
        PreparedStatement preparedStatement =
        ConetToDb.getConnection().prepareStatement(sql);
        preparedStatement.setString(1,search);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public static int getRowNUmbers(String table) throws SQLException {
        int rowNumbers=0;
        String sql = "SELECT * FROM "+table+" ";
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            rowNumbers += 1;
        }
        rowNumbers+=1;
        return rowNumbers;
    }

    public static String getCompanyId(int rowNumber,String columnName) throws SQLException {
        String id=null;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM COMPANY WHERE ROWNUMBER=?");
        preparedStatement.setInt(1,rowNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            id=resultSet.getString(columnName);
        }
        return id;
    }

    public static String getPersonId(int rowNumber) throws SQLException {
        String id=null;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM PERSON WHERE ROWNUMBER=?");
        preparedStatement.setInt(1,rowNumber);
        ResultSet resultSet= preparedStatement.executeQuery();
        while (resultSet.next()){
            id=resultSet.getString("IDNUMBER");
        }
        return id;
    }

    public static void deleteCompany(int rowNumber) throws SQLException {
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("DELETE FROM COMPANY WHERE ROWNUMBER=?");
        preparedStatement.setInt(1,rowNumber);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        afterDelete(rowNumber);
    }

    public static void afterDelete(int rowNumber) throws SQLException {
        int row;
        PreparedStatement preparedStatement = ConetToDb.getConnection().prepareStatement("SELECT * FROM COMPANY");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            row=resultSet.getInt("ROWNUMBER");
            if(row>rowNumber){
                row-=1;
                PreparedStatement preparedStatement1 = ConetToDb.getConnection().prepareStatement("UPDATE COMPANY SET ROWNUMBER=? WHERE ROWNUMBER=?");
                preparedStatement1.setInt(1,row);
                row+=1;
                preparedStatement1.setInt(2,row);
                preparedStatement1.executeUpdate();
                preparedStatement1.close();
            }
        }
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }



}
