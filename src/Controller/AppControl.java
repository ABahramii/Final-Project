package Controller;

import Model.Repsitory.Config;
import Model.Repsitory.Insert;
import Model.Service.InfCalculate;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AppControl {

    private static PreparedStatement pstmt = null;
    private static Connection conn = Config.getConnect();


    public static char checkPrice(String price){
        char result = 'c';
        if (!price.matches("[0-9]+"))
            result = 's';

        if (price.length() > 9)
            result = 'l';

        if (price.length() == 0)
            result = 'e';

        return result;
    }

    public static boolean submitPricesB(String year, String bread, String rice, String meat, String dairy, String vegetables) throws InvalidPriceException, EmptyFieldException, LongPriceException {
        if(checkPrice(bread) == 's' || checkPrice(rice) == 's' || checkPrice(meat) == 's' || checkPrice(dairy) == 's' || checkPrice(vegetables) == 's')
            throw new InvalidPriceException();

        if (bread.length() == 0 || rice.length() == 0 || meat.length() == 0 || dairy.length() == 0 || vegetables.length() == 0)
            throw new EmptyFieldException();

        if (bread.length() > 9 || rice.length() > 9 || meat.length() > 9 || dairy.length() > 9 || vegetables.length() > 9)
            throw new LongPriceException();

        try {
            InfCalculate.jjPast(year, bread, rice, meat, dairy, vegetables);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static boolean submitPricesA(String year, String bread, String rice, String meat, String dairy, String vegetables) throws InvalidPriceException, EmptyFieldException, LongPriceException {
        if(checkPrice(bread) == 's' || checkPrice(rice) == 's' || checkPrice(meat) == 's' || checkPrice(dairy) == 's' || checkPrice(vegetables) == 's')
            throw new InvalidPriceException();

        if (bread.length() == 0 || rice.length() == 0 || meat.length() == 0 || dairy.length() == 0 || vegetables.length() == 0)
            throw new EmptyFieldException();

        if (bread.length() > 9 || rice.length() > 9 || meat.length() > 9 || dairy.length() > 9 || vegetables.length() > 9)
            throw new LongPriceException();

        try {
            InfCalculate.jjPresent(year, bread, rice, meat, dairy, vegetables);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static boolean updatePricesA(String year, String bread, String rice, String meat, String dairy, String vegetables) throws InvalidPriceException, EmptyFieldException, LongPriceException {
        if(checkPrice(bread) == 's' || checkPrice(rice) == 's' || checkPrice(meat) == 's' || checkPrice(dairy) == 's' || checkPrice(vegetables) == 's')
            throw new InvalidPriceException();

        if (bread.length() == 0 || rice.length() == 0 || meat.length() == 0 || dairy.length() == 0 || vegetables.length() == 0)
            throw new EmptyFieldException();

        if (bread.length() > 9 || rice.length() > 9 || meat.length() > 9 || dairy.length() > 9 || vegetables.length() > 9)
            throw new LongPriceException();

        try {
            InfCalculate.jjUpdate(year, bread, rice, meat, dairy, vegetables);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static char checkName(String firstname){
        String specialChar = "-/?@~|.#$*%^&_+=()><!,:';";

        char result = 'c';

        if (firstname.matches(".*\\d.*") || firstname.matches(".*[" + specialChar + "]+.*"))
            result = 'l';

        if (firstname.length() == 0)
            result = 'e';

        if (firstname.length() > 41)
            result = 'o';

        return result;
    }

    public static char checkID(String nationCode){
        char result = 'c';

        if (nationCode.length() != 10)
            result = 'l';

        if (!nationCode.matches("[0-9]+"))
            result = 's';

        return result;
    }

    private static String fileExtension(String filePath) {

        if(filePath.lastIndexOf(".") != -1 && filePath.lastIndexOf(".") != 0)
            return filePath.substring(filePath.lastIndexOf(".") + 1);
        else
            return "";
    }

    private static void creatDirectory(String id) {
        String path = "C:\\Users\\Asus\\Desktop\\docs\\"+id;
        File file = new File(path);
        file.mkdir();
    }

    private static String uploadFile(String filePath, String ownerID) throws IOException, SQLException {

        String extension = fileExtension(filePath);

        Path from = Paths.get(filePath);
        Path fileName = from.getFileName();

        creatDirectory(ownerID);

        String newDes = "C:\\Users\\Asus\\Desktop\\docs\\" + ownerID + "\\" + fileName;
        System.out.println(newDes);
        Path to = Paths.get(newDes);
        Files.move(from, to);
        return newDes;
    }

    public static boolean checkRegister(String name, String id, String date, String filePath) throws EmptyFieldException, LongPriceException, RegisterException {

        if(name.length() == 0 || id.length() == 0 || date.length() == 0 || filePath.length() == 0)
            throw new EmptyFieldException();

        if (name.length() > 40 || id.length() > 15)
            throw new LongPriceException();

        if (checkName(name) == 'l')
            throw new RegisterException();

        if (checkID(id) == 'l' || checkID(id) == 's')
            throw new RegisterException();

        try {
            String newDec = uploadFile(filePath, id);
            Insert.insertDoc(name, id, date, newDec);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }


}
