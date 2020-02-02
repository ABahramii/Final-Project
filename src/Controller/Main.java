package Controller;

import Model.Repsitory.ConetToDb;
import View.LoginFrame;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConetToDb.connect();
        new LoginFrame().setVisible(true);


    }

}
