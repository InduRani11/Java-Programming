import java.awt.*;
import java.awt.event.*;

public class CalculatorApp extends Frame implements ActionListener {
    TextField textField;
    String operator;
    double num1, num2, result;

    public CalculatorApp() {
        setLayout(new BorderLayout());
        setTitle("Calculator");
        setSize(300, 400);

        textField = new TextField();
        add(textField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.matches("[0-9]")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals(".")) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + command);
            }
        } else if (command.matches("[/+\\-*=]")) {
            operator = command;
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            textField.setText(Double.toString(result));
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
