package hw3;

import javax.swing.*;
import java.awt.*;

/**
 * @author Avani
 * Question 4
 */

public class CarZoom {
    private static final int ICON_WIDTH = 1650;
    private static final int ICON_HEIGHT = 950;
    private static final int CAR_WIDTH = 70;

    public static void main(String args[]) {
        JFrame frame = new JFrame();

        final MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);

        ShapeIcon icon = new ShapeIcon(shape,
                ICON_WIDTH, ICON_HEIGHT);

        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JButton zoomIn = new JButton("Zoom In"); //button to zoom in
        JButton zoomOut = new JButton("Zoom Out"); //button to zoom out
        
        frame.add(zoomIn);
        frame.add(zoomOut);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        zoomIn.addActionListener(event -> {((CarShape) shape).increaseWidth();label.repaint();});
        zoomOut.addActionListener(event -> {((CarShape) shape).decreaseWidth();label.repaint();});

    }
}