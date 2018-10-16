import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Solution {

	public static void frame2() {
		JFrame frame = new JFrame();
		frame.setLayout(new Graph());

	}

	public static void paint(ArrayList<Double> values, Graphics g) {

		int icon_height = 750;
		int icon_width = 750;
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.red);
		double maxValue = findMaxValueInArrayList(values);

		double barHeight = icon_height / (double) values.size();

		int i = 0;

		for (Double value : values) {
			double barLen = (icon_width * value / maxValue);
			Rectangle2D.Double rectangle = new Rectangle2D.Double(0, i++ * barHeight, barLen, barHeight);
			g2d.fill(rectangle);
		}

	}

	public static double findMaxValueInArrayList(ArrayList<Double> values) {
		Double maxValue = values.get(0);
		for (Double value : values) {
			if (maxValue < value) {
				maxValue = value;
			}
		}

		return maxValue;
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		ArrayList<Double> list = new ArrayList<>();
		list.add(0.0);
		list.add(0.0);
		list.add(0.0);
		Bar Bar = new Bar(list);
		frame.setLayout(new Graph());

		final int FIELD_WIDTH = 50;

		JTextField textField = new JTextField(FIELD_WIDTH);
		JTextField textField2 = new JTextField(FIELD_WIDTH);
		JTextField textField3 = new JTextField(FIELD_WIDTH);

		frame.add(new JLabel("Value1"));
		frame.add(textField);
		frame.add(new JLabel("Value2"));
		frame.add(textField2);
		frame.add(new JLabel("Value3"));
		frame.add(textField3);
		frame.pack();
		try {
			textField.addActionListener(event -> {
				Bar.modifyData(0, Double.parseDouble(textField.getText()));
				Bar.repaint();
			});
			textField2.addActionListener(event -> {
				Bar.modifyData(1, Double.parseDouble(textField2.getText()));
				Bar.repaint();
			});
			textField3.addActionListener(event -> {
				Bar.modifyData(2, Double.parseDouble(textField3.getText()));
				Bar.repaint();
			});
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Field is empty: " + e);
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();
		frame.setVisible(true);

	}
}
