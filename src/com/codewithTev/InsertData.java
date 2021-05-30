package com.codewithTev;

import javax.swing.*;
import java.sql.*;

import static javax.swing.JOptionPane.*;

public class InsertData {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void insertDetails() {
        try {
            String sql = "INSERT INTO details" +
                    "(regno, first_name, last_name, role, department)" +
                    "VALUES(?,?,?,?,?) ";
            con = DriverManager.getConnection("jdbc:mysql://localhost/details","root","root");
            pst = con.prepareStatement(sql);
            pst.setString(1,regno.getText());
            pst.setString(2,first_name.getText());
            pst.setString (3,lastname.getText());
            pst.setString(4,role.getText());
            pst.setString(5,department.getText());
            pst.executeUpdate();
            showMessageDialog(null, "Data inserted successfully");
        }
        catch (Exception ex) {
            showMessageDialog(null, ex );
        }
    }

}
