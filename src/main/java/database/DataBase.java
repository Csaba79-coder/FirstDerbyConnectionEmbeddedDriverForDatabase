package database;

import database.firstconnection.Connection;
import database.util.Print;

import java.sql.DriverManager;
import java.sql.SQLException;
// import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {

    // https://db.apache.org/derby/
    // TODO make setup it is not operating at the moment!

    final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    final String URL = "jdbc:derby:sampleDB:create=true";
   /*
   final String USERNAME = ""; // it is on our pc, do not need password! it is Embedded
   final String PASSWORD = ""; // it is on our pc, do not need password! it is Embedded
    */

    public DataBase() {

        Connection connection = null; // only declaring (to reach from anywhere! else it is in try catch so we cannot reach!
        try {
            connection = (Connection) DriverManager.getConnection(URL);
            // Connection connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD); // if there is username and password!
        } catch (SQLException e) {
            new Print().Print("" + e);
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
        }

        /*
        if (connection != null) {
            try {
                Statement createStatement = connection.createStatement();
            } catch (SQLException e) {
                new Print().Print("" + e);
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        */
    }
}
