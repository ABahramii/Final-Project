package Model.Entity;

public class Unemployement {
    private String unemployement,employement,year,empId,empName,time;
    private float rate;
    private int rowNumber;

    public Unemployement(String unemployement, String employement, String year, String empId, String empName, String time, float rate, int rowNumber) {
        this.unemployement = unemployement;
        this.employement = employement;
        this.year = year;
        this.empId = empId;
        this.empName = empName;
        this.time = time;
        this.rate = rate;
        this.rowNumber = rowNumber;
    }

    public String getUnemployement() {
        return unemployement;
    }

    public void setUnemployement(String unemployement) {
        this.unemployement = unemployement;
    }

    public String getEmployement() {
        return employement;
    }

    public void setEmployement(String employement) {
        this.employement = employement;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }
}
