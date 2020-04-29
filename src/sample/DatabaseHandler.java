package sample;

import sample.Configs;
import  java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.SQLException;
import  java.sql.ResultSet;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;

       // public ResultSet getUser(User user)
       // {
       //     ResultSet resSet = null;


       // }
    }
}
