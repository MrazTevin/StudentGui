package com.codewithTev;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class StudentGui {
    private JPanel StudentForm;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton SAVEButton;
    private JButton DELETEButton;



    public StudentGui() {
        SAVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InsertData newData = new InsertData();
                newData.insertDetails();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main (String [] args) throws SQLException {
        ConnectDb testConnection = new ConnectDb();
        testConnection.connection();
    }
}
