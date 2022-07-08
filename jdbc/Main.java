package com.sush.jdbc;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
//        Creating the DataBase
/*        boolean isDatabaseCreated = JDBC.createDatabase("sushant");
        if(isDatabaseCreated)
            System.out.println("DataBase successfully created");
        else
            System.err.println("Failed to create database");*/

//        Dropping the DataBase
        boolean isDatabaseDropped = JDBC.dropDatabase("sushant");
        if(isDatabaseDropped)
            System.out.println("DataBase successfully dropped");
        else
            System.err.print("failed to drop database");

//        Creating table
/*        boolean isTableCreated = JDBC.createTable("sushant", """
                CREATE TABLE Persons (PersonID int,\s
                LastName varchar(255),\s
                FirstName varchar(255),\s
                Address varchar(255),\s
                City varchar(255)""");
        if(isTableCreated)
            System.out.println("Table successfully created");
        else
            System.err.println("Failed to create table");*/

//        Dropping table
/*        boolean isTableDropped = JDBC.dropTable("sushant", "persons");
        if(isTableDropped)
            System.out.println("Table successfully dropped");
        else
            System.err.println("Failed to drop table");*/
    }
}
