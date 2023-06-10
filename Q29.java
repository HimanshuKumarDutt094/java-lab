 
import javax.swing.*;
import java.sql.*;

class DatabaseRetrieveDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Database Retrieve Demo");

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(20, 20, 250, 200);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydatabase", "root", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customers");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                resultArea.append(id + " " + name + " " + address + "\n");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        frame.add(resultArea);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}