package Model.Entity;

public class Changes {

    private String empName,empId,operation,idChanged,time;

    public Changes(String empName, String empId, String operation, String idChanged, String time) {
        this.empName = empName;
        this.empId = empId;
        this.operation = operation;
        this.idChanged = idChanged;
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

    public String getIdChanged() {
        return idChanged;
    }

    public void setIdChanged(String idChanged) {
        this.idChanged = idChanged;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
