/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.nebulagaming.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aymen Dhahri
 */
public class GlobalConfig {

    private static Connection CONNECTION;

    private static GlobalConfig _instance;

    private static int SESSION = -1;

    private static final String URL = "jdbc:mysql://localhost:3306/nebulagaming";

    private static final String USER = "root";

    private static final String PASSWORD = "";

    private GlobalConfig() {

        try {
            CONNECTION = DriverManager.getConnection(URL, USER, PASSWORD);
        }

        catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public int getSession() {
      return SESSION;
    }

    public void setSession(int s) {
      SESSION = s;
    }

    public static GlobalConfig getInstance() {

        if(_instance == null)
            _instance = new GlobalConfig();
        return _instance;
    }

    public Connection getCONNECTION() {
        return CONNECTION;
    }

}
