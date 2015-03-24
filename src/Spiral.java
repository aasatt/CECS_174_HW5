
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class Spiral {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 625);
		frame.setTitle("Spiral");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpiralComponent comp = new SpiralComponent();
		frame.add(comp);
		frame.setVisible(true);
	}
}

class SpiralComponent extends JComponent {
	/**
	 * This will draw the spiral
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g) {
		int h = 600;
		int w = 600;
		Graphics2D g2 = (Graphics2D)g;
		for (int i = 300; i > 0; i = i-25) {
			
			Line2D.Double line = new Line2D.Double(i, h-i, i, i);
			Line2D.Double line2 = new Line2D.Double(i, i, h-i, i);
			if (i!=300) {
				Line2D.Double line3 = new Line2D.Double(h-i, i, h-i, h-i-25);
				g2.draw(line3);
			}
			Line2D.Double line4 = new Line2D.Double(h-i, h-i-25, i+25, h-i-25);
			g2.draw(line);
			g2.draw(line2);
			
			g2.draw(line4);
			


		}
	}
	
	
}