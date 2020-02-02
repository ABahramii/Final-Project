package Model.Entity;

public class Employee2 {
    private  String fName,lName,password,idNumber;
    private int rowNumber;

    public Employee2(String fName, String lName, String password, String idNumber, int rowNumber) {
        this.fName = fName;
        this.lName = lName;
        this.password = password;
        this.idNumber = idNumber;
        this.rowNumber = rowNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }
}
