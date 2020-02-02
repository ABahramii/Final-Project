package Model.Service;

import java.text.DecimalFormat;

public class UnempolymentRate {
    public static Float Calculate(float unemployed,float employed){
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Float rate=Float.parseFloat(decimalFormat.format(unemployed/employed));
        return rate*100;
    }
}
