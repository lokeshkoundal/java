import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class RGBColorDisplay extends JFrame implements AdjustmentListener {

    private JScrollBar redScrollbar;
    private JScrollBar greenScrollbar;
    private JScrollBar blueScrollbar;
    private JPanel colorPanel;

    public RGBColorDisplay() {
        setTitle("RGB Color Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create scroll bars
        redScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        greenScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);
        blueScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 255);

        // Create color panel
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(300, 300));

        // Add scroll bars and color panel to frame
        add(redScrollbar, BorderLayout.NORTH);
        add(greenScrollbar, BorderLayout.CENTER);
        add(blueScrollbar, BorderLayout.SOUTH);
        add(colorPanel, BorderLayout.CENTER);

        // Add adjustment listeners to scroll bars
        redScrollbar.addAdjustmentListener(this);
        greenScrollbar.addAdjustmentListener(this);
        blueScrollbar.addAdjustmentListener(this);

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int red = redScrollbar.getValue();
        int green = greenScrollbar.getValue();
        int blue = blueScrollbar.getValue();

        Color color = new Color(red, green, blue);
        colorPanel.setBackground(color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RGBColorDisplay demo = new RGBColorDisplay();
            demo.setVisible(true);
        });
    }
}
