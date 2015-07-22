package com.capgemini.gol;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DemoShapes {
	public static final Color DEFAULT_COLOR = Color.white;

	public DemoShapes() {
		final List<ShapeItem> shapes = new ArrayList<ShapeItem>();
		int sizeX = 1980;
		int sizeY = 1100;
		int s = 10;
		for (int i = 0; i < sizeX; i += s) {
			for (int j = 0; j < sizeY; j += s) {
				shapes.add(new ShapeItem(new Rectangle2D.Double(i, j, s, s), DEFAULT_COLOR));
			}
		}

		Random r = new Random();
		for (ShapeItem shapeItem : shapes) {
			shapeItem.setColor(new Color(r.nextFloat(), r.nextFloat(), r.nextFloat()));
		}

		JFrame frame = new JFrame("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ShapesPanel panel = new ShapesPanel(shapes);
		JButton b = new JButton("SSS");
		frame.add(panel);

		frame.setSize(sizeX, sizeY);
		frame.setLocationByPlatform(true);
		frame.pack();
		frame.setVisible(true);

	}

	class ShapeItem {
		private Shape shape;
		private Color color;

		public ShapeItem(Shape shape, Color color) {
			super();
			this.shape = shape;
			this.color = color;
		}

		public Shape getShape() {
			return shape;
		}

		public void setShape(Shape shape) {
			this.shape = shape;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
	}

	class ShapesPanel extends JPanel {
		private List<ShapeItem> shapes;
		private Random rand = new Random();

		public ShapesPanel(List<ShapeItem> shapesList) {
			this.shapes = shapesList;

			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {

					Color color = getRandomColor();
					for (int i = 0; i < shapes.size(); i++) {
						if (shapes.get(i).getShape().contains(e.getPoint())) {
							shapes.get(i).setColor(Color.black);
						}
					}
					repaint();
				}

			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2 = (Graphics2D) g.create();

			for (ShapeItem item : shapes) {
				g2.setColor(item.getColor());
				g2.fill(item.getShape());
			}

			g2.dispose();
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(300, 300);
		}

		public Color getRandomColor() {
			return new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DemoShapes();
			}
		});
	}
}