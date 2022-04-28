package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Util.getMySQLConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ping", "Pong", (byte) 40);
        userDao.saveUser("Prig", "Skok", (byte) 41);
        userDao.saveUser("Chili", "Villi", (byte) 42);
        userDao.saveUser("Shaltay", "Baltay", (byte) 43);

       userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
       userDao.dropUsersTable();
    }
}
