package Model.Repsitory;

public class Prices {
    private boolean exist;
    private float cpi;
    private float inf;
    private String bread;
    private String rice;
    private String meat;
    private String dairy;
    private String vegetables;

    private static Prices prices;

    public static Prices getPrices() {
        if (prices == null)
            prices = new Prices();
        return prices;
    }

    public boolean isExist() {

        return exist;
    }

    public void setExist(boolean exist) {

        this.exist = exist;
    }

    public float getCpi() {

        return cpi;
    }

    public void setCpi(float cpi) {

        this.cpi = cpi;
    }

    public float getInf() {

        return inf;
    }

    public void setInf(float inf) {

        this.inf = inf;
    }

    public String getBread() {

        return bread;
    }

    public void setBread(int bread) {

        this.bread = String.valueOf(bread);
    }

    public String getRice() {

        return rice;
    }

    public void setRice(int rice) {

        this.rice = String.valueOf(rice);
    }

    public String getMeat() {

        return meat;
    }

    public void setMeat(int meat) {

        this.meat = String.valueOf(meat);
    }

    public String getDairy() {
        return dairy;
    }

    public void setDairy(int dairy) {
        this.dairy = String.valueOf(dairy);

    }

    public String getVegetables() {

        return vegetables;
    }

    public void setVegetables(int vegetables) {

        this.vegetables = String.valueOf(vegetables);
    }
}