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
                    StudentInfo si = new StudentInfo();
                    si.setRegno(Integer.parseInt(textField1.getText()));
                    si.setFirst_name(textField2.getText());
                    si.setLast_name(textField3.getText());
                    si.setRole(textField4.getText());
                    si.setRole(textField5.getText());
                    pst.setInt(1,si.getRegno());
                    pst.setString(2,si.getFirst_name());
                    pst.setString(3,si.getDepartment());
                    pst.setString(4,si.getRole());
                    pst.setString(5,si.getDepartment());
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
