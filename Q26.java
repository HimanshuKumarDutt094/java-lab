import javax.swing.*;
import java.awt.BorderLayout;

class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Demo");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel northLabel = new JLabel("North");
        panel.add(northLabel, BorderLayout.NORTH);

        JLabel southLabel = new JLabel("South");
        panel.add(southLabel, BorderLayout.SOUTH);

        JLabel eastLabel = new JLabel("East");
        panel.add(eastLabel, BorderLayout.EAST);

        JLabel westLabel = new JLabel("West");
        panel.add(westLabel, BorderLayout.WEST);

        JLabel centerLabel = new JLabel("Center");
        panel.add(centerLabel, BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}