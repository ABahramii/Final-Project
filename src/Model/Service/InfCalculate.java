package Model.Service;



import Model.Repsitory.Insert;
import Model.Repsitory.Prices;
import Model.Repsitory.Select;
import Model.Repsitory.Update;

import java.sql.SQLException;
import java.text.DecimalFormat;

public class InfCalculate {
    public static float PCPI = 0;

    private static float inflationCalculate(float cpi1, float cpi2) {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return Float.parseFloat(decimalFormat.format((((cpi2 - cpi1) / cpi1) * 100)));
    }

    private static float cpiCalculate(float bread, float rice, float meat, float dairy, float vegetables) {
        final float baseCPI = 29000f;
        float sum = bread + rice + meat + dairy + vegetables;
        float cpi = sum/baseCPI;
        return cpi;
    }

    public static void jjPast(String year, String bread, String rice, String meat, String dairy, String vegetables) throws SQLException {

        float presentCpi = cpiCalculate(Float.parseFloat(bread), Float.parseFloat(rice), Float.parseFloat(meat), Float.parseFloat(dairy), Float.parseFloat(vegetables));
        PCPI = presentCpi;

        int pastYear = Integer.parseInt(year) - 1;
        float pastCpi = Select.cpiPreviousOrNext(String.valueOf(pastYear));

        float inf = 0;
        if (pastCpi != 0)
            inf = inflationCalculate(pastCpi, presentCpi);

        Insert.insertPrices(year, Integer.parseInt(bread), Integer.parseInt(rice), Integer.parseInt(meat), Integer.parseInt(dairy), Integer.parseInt(vegetables), presentCpi, inf);
    }

    public static void jjPresent(String year, String bread, String rice, String meat, String dairy, String vegetables) throws SQLException {

        Prices price = Prices.getPrices();
        float pastCpi;

        float presentCpi = cpiCalculate(Float.parseFloat(bread), Float.parseFloat(rice), Float.parseFloat(meat), Float.parseFloat(dairy), Float.parseFloat(vegetables));

        float inf = 0;

        if (price.isExist()) {
            pastCpi = price.getCpi();
            inf = inflationCalculate(pastCpi, presentCpi);
        }
        else {
            pastCpi = PCPI;
            inf = inflationCalculate(pastCpi, presentCpi);
        }

        Insert.insertPrices(year, Integer.parseInt(bread), Integer.parseInt(rice), Integer.parseInt(meat), Integer.parseInt(dairy), Integer.parseInt(vegetables), presentCpi, inf);
    }

    public static void jjUpdate(String year, String bread, String rice, String meat, String dairy, String vegetables) throws SQLException {

        float presentCpi = cpiCalculate(Float.parseFloat(bread), Float.parseFloat(rice), Float.parseFloat(meat), Float.parseFloat(dairy), Float.parseFloat(vegetables));
        PCPI = presentCpi;

        int pastYear = Integer.parseInt(year) - 1;
        float pastCpi = Select.cpiPreviousOrNext(String.valueOf(pastYear));
        float inf = 0;
        if (pastCpi != 0)
            inf = inflationCalculate(pastCpi, presentCpi);

        Update.updatePrices(year, Integer.parseInt(bread), Integer.parseInt(rice), Integer.parseInt(meat), Integer.parseInt(dairy), Integer.parseInt(vegetables), presentCpi, inf);
        updateNextInflation(year, presentCpi);
    }

    private static void updateNextInflation(String year, float presentCpi) throws SQLException {
        int nextYear = Integer.parseInt(year) + 1;
        float nextCpi = Select.cpiPreviousOrNext(String.valueOf(nextYear));
        float nextInf = 0;
        if (nextCpi != 0) {
            nextInf = inflationCalculate(presentCpi, nextCpi);
            Update.updateNextInflation(String.valueOf(nextYear), nextInf);
        }
    }

}