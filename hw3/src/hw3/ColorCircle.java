package hw3;
/**
 * Change the color of the circle according to the button clicked
 * @author Avani
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Question 3
 */
public class ColorCircle {

    public static class CircleIcon {
        /**
         * Constructs a Circle icon of a given size.
         *
         * @param aSize the size of the icon
         */

        private int size;
        public CircleIcon(int aSize) {
            size = aSize;

        }


        public int getIconWidth() {
            return size;

        }


        public int getIconHeight() {
            return size;

        }


        public void paintIcon(Component c, Graphics g, int x, int y, String color) {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D.Double circle = new Ellipse2D.Double(x, y,
                    size, size);
            if (color.equals("Red")){
                g2.setColor(Color.RED);
            }
            else if (color.equals("Blue")){
                g2.setColor(Color.BLUE);
            }
            else if (color.equals("Green")){
                g2.setColor(Color.GREEN);
            }

            g2.fill(circle);

        }
    }

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        MarsIcon circle = new MarsIcon(200,"red"); //initial color should be red

        final JLabel label = new JLabel(circle); //similar to https://www.horstmann.com/oodp3/slides/ch04/code/animation/AnimationTester.java.html
        frame.setLayout(new FlowLayout());
        frame.add(label);

        JButton red = new JButton("Red"); //button to change to red color
        JButton blue = new JButton("Blue"); //button to change to blue color
        JButton green = new JButton("Green"); //button to change to green color

//        event added to change olor to blue red or green according to button clicked.
        blue.addActionListener(event -> {circle.changeColor("blue");label.repaint();});
        red.addActionListener(event -> {circle.changeColor("red");label.repaint();});
        green.addActionListener(event -> {circle.changeColor("green");label.repaint();});

        frame.setLayout(new FlowLayout());

        frame.add(red);
        frame.add(blue);
        frame.add(green);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}