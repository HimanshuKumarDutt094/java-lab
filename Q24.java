 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventHandlingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Demo");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton button = new JButton("Click me");
        button.setBounds(50, 50, 100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked");
            }
        });
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}