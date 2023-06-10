 
import javax.swing.*;

class CalculatorDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JTextField num1Field = new JTextField();
        num1Field.setBounds(20, 20, 150, 20);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(20, 50, 150, 20);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(20, 80, 150, 20);

        JButton addButton = new JButton("+");
        addButton.setBounds(20, 110, 50, 30);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(80, 110, 50, 30);

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(140, 110, 50, 30);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(200, 110, 50, 30);

        addButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 + num2;
            resultLabel.setText("Result: " + result);
        });

        subtractButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 - num2;
            resultLabel.setText("Result: " + result);
        });

        multiplyButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 * num2;
            resultLabel.setText("Result: " + result);
        });

        divideButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            double result = (double) num1 / num2;
            resultLabel.setText("Result: " + result);
        });

        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(resultLabel);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);

        frame.setSize(270, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}