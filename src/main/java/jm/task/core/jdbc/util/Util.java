package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

  /*  ==== original JDBC =====
      public static Connection getMySQLConnection() throws SQLException,
      ClassNotFoundException {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String hostName = "localhost";
      String dbName = "new_schema_test";
      String userName = "Yanewuser";
      String password = "Yanewuser!";

      String connectionURL = "jdbc:mysql://localhost:3306/new_schema_test";

      Connection connection = DriverManager.getConnection(connectionURL, userName, password);
      return connection;
      ======= end original =========
      */
   /*
    ==========  test ==========
    private static Connection connection = null;
    private static final String hostName = "localhost";
    private static final  String dbName = "new_schema_test";
    private static final String userName = "Yanewuser";
    private static final String password = "Yanewuser!";
    private static final String connectionURL = "jdbc:mysql://localhost:3306/new_schema_test";

    public static Connection getMySQLConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(connectionURL, userName, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    ===== end test =======*/
  private static SessionFactory sessionFactory = null;
  public static SessionFactory getConnection() {

      try {
          sessionFactory = new Configuration()
                  .addAnnotatedClass(User.class)
                  .buildSessionFactory();
      } catch (HibernateException e) {
          e.printStackTrace();
      }
      return sessionFactory;
  }
}
