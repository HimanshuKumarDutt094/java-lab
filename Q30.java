 
import javax.swing.*;
import java.sql.*;

class DatabaseInsertDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Database Insert Demo");

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 50, 20);
        JTextField nameField = new JTextField();
        nameField.setBounds(80, 20, 150, 20);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 50, 50, 20);
        JTextField addressField = new JTextField();
        addressField.setBounds(80, 50, 150, 20);

        JButton addButton = new JButton("Add");
        addButton.setBounds(80, 90, 100, 30);

        addButton.addActionListener(e -> {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydatabase", "root", "password");
                PreparedStatement stmt = con.prepareStatement("insert into customers(name,address) values(?,?)");
                stmt.setString(1, nameField.getText());
                stmt.setString(2, addressField.getText());
                int result = stmt.executeUpdate();
                JOptionPane.showMessageDialog(frame, "Data inserted successfully");
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(addButton);

        frame.setSize(250, 150);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}