 
import javax.swing.*;
import java.awt.*;

public class SwingControlsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Controls Demo");

        JLabel label = new JLabel("Label:");
        label.setBounds(20, 20, 50, 20);
        JTextField textField = new JTextField();
        textField.setBounds(80, 20, 150, 20);

        JCheckBox checkBox = new JCheckBox("Checkbox");
        checkBox.setBounds(20, 50, 150, 20);
        JRadioButton radioButton1 = new JRadioButton("Radio button 1");
        JRadioButton radioButton2 = new JRadioButton("Radio button 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioButton1.setBounds(20, 80, 120, 20);
        radioButton2.setBounds(140, 80, 120, 20);

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        comboBox.setBounds(20, 110, 150, 20);

        JSlider slider = new JSlider(0, 100, 50);
        slider.setBounds(20, 140, 200, 40);

        JButton button = new JButton("Button");
        button.setBounds(80, 200, 100, 30);

        frame.add(label);
        frame.add(textField);
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(comboBox);
        frame.add(slider);
        frame.add(button);

        frame.setSize(250, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}