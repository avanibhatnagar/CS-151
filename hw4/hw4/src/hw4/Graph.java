import java.awt.*;

/**
 * Graph class that has the layout
 */
public class Graph implements LayoutManager {
	public Dimension preferredLayoutSize(Container parent) {
		Component[] components = parent.getComponents();
		left = 0;
		right = 0;
		height = 0;
		for (int i = 0; i < components.length; i += 2) {
			Component compLeft = components[i];
			Component compRight = components[i + 1];

			Dimension dimenLeft = compLeft.getPreferredSize();
			Dimension dimenRight = compRight.getPreferredSize();
			left = Math.max(left, dimenLeft.width);
			right = Math.max(right, dimenRight.width);
			height = height + Math.max(dimenLeft.height, dimenRight.height);
		}
		return new Dimension(left + dist + right, height);
	}

	public Dimension minimumLayoutSize(Container parent) {
		return preferredLayoutSize(parent);
	}

	public void layoutContainer(Container parent) {
		preferredLayoutSize(parent);

		Component[] components = parent.getComponents();

		Insets insets = parent.getInsets();
		int xcenter = insets.left + left;
		int y = insets.top;

		for (int i = 0; i < components.length; i += 2) {
			Component compLeft = components[i];
			Component compRight = components[i + 1];

			Dimension dimenLeft = compLeft.getPreferredSize();
			Dimension dimenRight = compRight.getPreferredSize();

			int height = Math.max(dimenLeft.height, dimenRight.height);

			compLeft.setBounds(xcenter - dimenLeft.width, y + (height - dimenLeft.height) / 2, dimenLeft.width, dimenLeft.height);

			compRight.setBounds(xcenter + dist, y + (height - dimenRight.height) / 2, dimenRight.width, dimenRight.height);
			y += height;
		}
	}

	public void addLayoutComponent(String name, Component comp) {
	}

	public void removeLayoutComponent(Component comp) {
	}

	private int left;
	private int right;
	private int height;
	private static final int dist = 5;
}
