package javaJFrame;



import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateForm extends JFrame implements ActionListener {
    
    JLabel rollLabel, nameLabel, genderLabel, hobbyLabel;
    JTextField rollField, nameField;
    JComboBox<String> genderCombo;
    JCheckBox hobby1, hobby2, hobby3;
    JButton updateButton, cancelButton;

    DBConnection dbc = new DBConnection();
    PreparedStatement pstmt;

    public UpdateForm(int rollNo, String fullName, String gender, String hobbies) {
        // Labels
        rollLabel = new JLabel("Roll No: ");
        nameLabel = new JLabel("Full Name: ");
        genderLabel = new JLabel("Gender: ");
        hobbyLabel = new JLabel("Hobby: ");

        // Text Fields
        rollField = new JTextField(String.valueOf(rollNo), 20);
        rollField.setEditable(false); // Prevent changing roll number

        nameField = new JTextField(fullName, 20);

        // Combo Box for Gender
        genderCombo = new JComboBox<>();
        genderCombo.addItem("Male");
        genderCombo.addItem("Female");
        genderCombo.setSelectedItem(gender);

        // Checkboxes for Hobbies
        hobby1 = new JCheckBox("Reading");
        hobby2 = new JCheckBox("Writing");
        hobby3 = new JCheckBox("Coding");

        // Pre-select hobbies based on the input
        if (hobbies.contains("Reading")) hobby1.setSelected(true);
        if (hobbies.contains("Writing")) hobby2.setSelected(true);
        if (hobbies.contains("Coding")) hobby3.setSelected(true);

        // Buttons
        updateButton = new JButton("Update");
        cancelButton = new JButton("Cancel");

        // Set layout and add components
        setLayout(null);

        add(rollLabel);
        rollLabel.setBounds(30, 20, 100, 25);
        add(rollField);
        rollField.setBounds(120, 20, 200, 25);

        add(nameLabel);
        nameLabel.setBounds(30, 60, 100, 25);
        add(nameField);
        nameField.setBounds(120, 60, 200, 25);

        add(genderLabel);
        genderLabel.setBounds(30, 100, 100, 25);
        add(genderCombo);
        genderCombo.setBounds(120, 100, 200, 25);

        add(hobbyLabel);
        hobbyLabel.setBounds(30, 140, 100, 25);
        add(hobby1);
        hobby1.setBounds(120, 140, 80, 25);
        add(hobby2);
        hobby2.setBounds(200, 140, 80, 25);
        add(hobby3);
        hobby3.setBounds(280, 140, 80, 25);

        add(updateButton);
        updateButton.setBounds(120, 200, 100, 30);
        add(cancelButton);
        cancelButton.setBounds(230, 200, 100, 30);

        // Add action listeners
        updateButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Frame properties
        setVisible(true);
        setSize(400, 300);
        setTitle("Update Form");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updateButton) {
            try {
                // Get updated values
                String updatedName = nameField.getText();
                String updatedGender = genderCombo.getSelectedItem().toString();

                StringBuilder updatedHobbies = new StringBuilder();
                if (hobby1.isSelected()) updatedHobbies.append("Reading ");
                if (hobby2.isSelected()) updatedHobbies.append("Writing ");
                if (hobby3.isSelected()) updatedHobbies.append("Coding ");

                // Prepare SQL update query
                pstmt = dbc.conn.prepareStatement(
                    "UPDATE studentdetail SET fullname = ?, gender = ?, hobby = ? WHERE rollno = ?"
                );
                pstmt.setString(1, updatedName);
                pstmt.setString(2, updatedGender);
                pstmt.setString(3, updatedHobbies.toString().trim());
                pstmt.setInt(4, Integer.parseInt(rollField.getText()));

                // Execute update
                int result = pstmt.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Record updated successfully!");
                    this.dispose(); // Close the update form
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update the record.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == cancelButton) {
            this.dispose(); // Close the form without saving
        }
    }
}
