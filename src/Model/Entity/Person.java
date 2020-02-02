package Model.Entity;

public class Person {

    private String fName, lName, idNumber, gender, role, job, familyOwnerId, income, address, time, empName, empId, operation;
    private int age, rowNumber;

    public Person(String fName, String lName, String idNumber, String gender, String role, String job, String familyOwnerId, String income, String address, String time, String empName, String empId, String operation, int age, int rowNumber) {
        this.fName = fName;
        this.lName = lName;
        this.idNumber = idNumber;
        this.gender = gender;
        this.role = role;
        this.job = job;
        this.familyOwnerId = familyOwnerId;
        this.income = income;
        this.address = address;
        this.time = time;
        this.empName = empName;
        this.empId = empId;
        this.operation = operation;
        this.age = age;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFamilyOwnerId() {
        return familyOwnerId;
    }

    public void setFamilyOwnerId(String familyOwnerId) {
        this.familyOwnerId = familyOwnerId;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }
}