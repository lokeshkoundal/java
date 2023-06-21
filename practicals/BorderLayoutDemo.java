import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    public BorderLayoutDemo() {
        setTitle("BorderLayout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create panels for each region
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        // Set background colors for panels
        northPanel.setBackground(Color.RED);
        southPanel.setBackground(Color.GREEN);
        eastPanel.setBackground(Color.BLUE);
        westPanel.setBackground(Color.YELLOW);
        centerPanel.setBackground(Color.ORANGE);

        // Add labels to panels
        northPanel.add(new JLabel("North"));
        southPanel.add(new JLabel("South"));
        eastPanel.add(new JLabel("East"));
        westPanel.add(new JLabel("West"));
        centerPanel.add(new JLabel("Center"));

        // Add panels to frame
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BorderLayoutDemo demo = new BorderLayoutDemo();
            demo.setVisible(true);
        });
    }
}
