package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
// реализуйте настройку соеденения с БД
// Connect to MySQL
  //  public static Connection getMySQLConnection() throws SQLException,
  //          ClassNotFoundException {
  //      String hostName = "localhost";
  //      String dbName = "new_schema_test";
  //      String userName = "Yanewuser";
  //      String password = "Yanewuser!";

  //      return getMySQLConnection(hostName, dbName, userName, password);
  //  }

    public static Connection getMySQLConnection() throws SQLException,
       ClassNotFoundException {
       Class.forName("com.mysql.cj.jdbc.Driver");
      String hostName = "localhost";
      String dbName = "new_schema_test";
      String userName = "Yanewuser";
      String password = "Yanewuser!";

      //String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        String connectionURL = "jdbc:mysql://localhost:3306/new_schema_test";

      Connection connection = DriverManager.getConnection(connectionURL, userName, password);
      return connection;
    }
}
