package com.teksystem;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees");

            while (resultSet.next()){
                System.out.println(resultSet.getString("firstName"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
