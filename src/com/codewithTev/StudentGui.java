package com.codewithTev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentGui {
    private JPanel StudentForm;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton SAVEButton;
    private JButton DELETEButton;


    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;



    public StudentGui() {
        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sql = "INSERT INTO details"
                            + "(regno,first_name,last_name,role,department)"
                            + "VALUES (?,?,?,?,?)";
                    con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Students", "postgres", "root");
                    pst = con.prepareStatement(sql);
                    TextComponent regno = null;
                    pst.setString(1,regno.getText());
                    TextComponent first_name = null;
                    pst.setString(2,first_name.getText());
                    TextComponent last_name = null;
                    pst.setString(3,last_name.getText());
                    TextComponent role = null;
                    pst.setString(4,role.getText());
                    TextComponent department = null;
                    pst.setString(5,department.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"inserted successfully");

                }
                catch(Exception ex) {
                    JOptionPane.showMessageDialog(null,ex);

                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main (String [] args) throws SQLException {
        ConnectDb testConnection = new ConnectDb();
        testConnection.connection();

        JFrame frame = new JFrame("StudentGui");
        frame.setContentPane(new StudentGui().StudentForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
