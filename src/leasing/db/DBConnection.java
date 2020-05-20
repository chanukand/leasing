
package leasing.db;

import java.sql.*;

/**
 *
 * @author ~CND~
 */
public class DBConnection {

    private static DBConnection db;
    private Connection con;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //con = DriverManager.getConnection("jdbc:mysql://204.93.168.209:3306/chanukan_microfinance?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "chanukand", "nokia5130");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dadspos", "root", "");
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (db == null) {
            db = new DBConnection();
        }
        return db;
    }

    public Connection getConnection() {
        return con;
    }
}
