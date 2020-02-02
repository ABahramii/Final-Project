package Model.Entity;

public class Family {

    private String familyOwnerLName,familyOwnerId,familyIncome,familyAddress;
    private int familyCount;

    public Family(String familyOwnerLName, String familyOwnerId, String familyIncome, String familyAddress, int familyCount) {
        this.familyOwnerLName = familyOwnerLName;
        this.familyOwnerId = familyOwnerId;
        this.familyIncome = familyIncome;
        this.familyAddress = familyAddress;
        this.familyCount = familyCount;
    }

    public String getFamilyOwnerLName() {
        return familyOwnerLName;
    }

    public void setFamilyOwnerLName(String familyOwnerLName) {
        this.familyOwnerLName = familyOwnerLName;
    }

    public String getFamilyOwnerId() {
        return familyOwnerId;
    }

    public void setFamilyOwnerId(String familyOwnerId) {
        this.familyOwnerId = familyOwnerId;
    }

    public String getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(String familyIncome) {
        this.familyIncome = familyIncome;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public int getFamilyCount() {
        return familyCount;
    }

    public void setFamilyCount(int familyCount) {
        this.familyCount = familyCount;
    }
}
