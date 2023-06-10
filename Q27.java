 
import javax.swing.*;
import java.awt.*;

class RGBScrollbarDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Scrollbar Demo");

        JLabel redLabel = new JLabel("Red:");
        redLabel.setBounds(20, 20, 50, 20);
        JScrollBar redScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
        redScrollbar.setBounds(80, 20, 150, 20);

        JLabel greenLabel = new JLabel("Green:");
        greenLabel.setBounds(20, 50, 50, 20);
        JScrollBar greenScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
        greenScrollbar.setBounds(80, 50, 150, 20);

        JLabel blueLabel = new JLabel("Blue:");
        blueLabel.setBounds(20, 80, 50, 20);
        JScrollBar blueScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
        blueScrollbar.setBounds(80, 80, 150, 20);

        JPanel colorPanel = new JPanel();
        colorPanel.setBounds(80, 120, 100, 100);

        redScrollbar.addAdjustmentListener(e -> {
            colorPanel.setBackground(new Color(redScrollbar.getValue(), greenScrollbar.getValue(), blueScrollbar.getValue()));
        });
        greenScrollbar.addAdjustmentListener(e -> {
            colorPanel.setBackground(new Color(redScrollbar.getValue(), greenScrollbar.getValue(), blueScrollbar.getValue()));
        });
        blueScrollbar.addAdjustmentListener(e -> {
            colorPanel.setBackground(new Color(redScrollbar.getValue(), greenScrollbar.getValue(), blueScrollbar.getValue()));
        });

        frame.add(redLabel);
        frame.add(redScrollbar);
        frame.add(greenLabel);
        frame.add(greenScrollbar);
        frame.add(blueLabel);
        frame.add(blueScrollbar);
        frame.add(colorPanel);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}