package com.codewithTev;

import java.sql.*;
import java.util.Properties;

public class ConnectDb {

        public void connection () {
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/Students", "postgres", "root")) {

                if (conn != null) {
                    System.out.println("Connected to the database!");
                } else {
                    System.out.println("Failed to make connection!");
                }

            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }




}


