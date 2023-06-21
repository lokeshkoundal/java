import javax.swing.*;
import java.awt.*;

public class SwingControls extends JFrame {

    public SwingControls() {
        setTitle("Swing Controls Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your name:");
        add(label);
 
        JTextField textField = new JTextField(15);
        add(textField);

        JButton button = new JButton("Submit");
        add(button);
        
        JCheckBox checkBox = new JCheckBox("I agree to the terms and conditions");
        add(checkBox);
        
        String[] colors = {"Red", "Green", "Blue"};
        JComboBox<String> comboBox = new JComboBox<>(colors);
        add(comboBox);
        
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        
        button.addActionListener(e -> {
            String name = textField.getText();
            String selectedColor = comboBox.getSelectedItem().toString();
            String message = "Hello, " + name + "!\nYou selected " + selectedColor + ".";
            textArea.append(message);
        });

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingControls demo = new SwingControls();
            demo.setVisible(true);
        });
    }
}
