package Model.Repsitory;
import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;

public class Select {
    private static Statement stmt = null;
    private static PreparedStatement pstmt = null;
    private static Connection conn = Config.getConnect();

    public static boolean checkPresentYear(String year) throws SQLException {
        String sql = "select bread from inflation where year = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, year);
        int i = pstmt.executeUpdate();

        if (i != 0)
            return true;
        else
            return false;
    }

    public static boolean checkPastYear(String year) throws SQLException {
        String sql = "select bread, rice, meat, dairy, vegetables, cpi, inf from inflation where year = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, year);
        int i = pstmt.executeUpdate();

        Prices price = Prices.getPrices();
        if (i != 0){
            price.setExist(true);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                price.setBread(rs.getInt("bread"));
                price.setRice(rs.getInt("rice"));
                price.setMeat(rs.getInt("meat"));
                price.setDairy(rs.getInt("dairy"));
                price.setVegetables(rs.getInt("vegetables"));
                price.setCpi(rs.getFloat("cpi"));
                price.setInf(rs.getFloat("inf"));
            }
            rs.close();
            pstmt.close();
            return true;
        }
        else {
            price.setExist(false);
            return false;
        }
    }

    public static float cpiPreviousOrNext(String year) throws SQLException {

        String sql = "select cpi from inflation where year = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, year);
        int i = pstmt.executeUpdate();
        float cpi = 0f;
        if (i != 0) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                cpi = rs.getFloat("cpi");
            }
            rs.close();
            pstmt.close();
        }

        return cpi;
    }

}
