/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author lepkom3-38
 */
public class Koneksi {
    private Statement data;
    private Connection koneksi;
    
    private final String dbHost;
    private final Integer dbPort;
    private final String dbUser;
    private final String dbPass;
    private final String db;
    
    public Koneksi(){
        dbHost = "localhost";
        dbPort = 3306;
        dbUser = "root";
        dbPass = "";
        db = "act4";
        
        this.setupConnection();
    }
    
    private void setupConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.koneksi = DriverManager.getConnection("jdbc:mysql://" + getDbHost() + ":" + getDbPort() + "/" + getDb(), getDbUser(), getDbPass());
            data = getConnection().createStatement();
            System.out.println("Koneksi berhasil");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("error : " + ex);
            System.exit(1);
        }
    }

    /**
     * @return the data
     */
    public Statement getStatement() {
        return this.data;
    }

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return this.koneksi;
    }
    
    private String getDb() {
        return this.db;
    }

    /**
     * @return the dbHost
     */
    private String getDbHost() {
        return this.dbHost;
    }

    /**
     * @return the dbPort
     */
    private Integer getDbPort() {
        return this.dbPort;
    }

    /**
     * @return the dbUser
     */
    private String getDbUser() {
        return this.dbUser;
    }

    /**
     * @return the dbPass
     */
    private String getDbPass() {
        return this.dbPass;
    }
}
