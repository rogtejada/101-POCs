package com.rogtejada.javaee.poc.db;

import com.rogtejada.javaee.poc.exception.DbException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Postgres {

    public static Connection getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/db","ilegra", "ilegra");
        }catch (Exception e) {
            throw new DbException("Could not connect to Database");
        }
    }
}
