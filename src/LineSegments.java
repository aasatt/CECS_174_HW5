import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class LineSegments {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setTitle("f(x) = 0.00005x^3 Ð 0.03x^2 + 4x + 200");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CurveComponent comp = new CurveComponent();
		frame.add(comp);
		frame.setVisible(true);
	}
}

class CurveComponent extends JComponent {
	/**
	 * This will draw the curve
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		double d = -(0-400)/100;
		for (int x = 0; x <= 400; x = (x+4)) {
			Line2D.Double line = new Line2D.Double(x, 400-this.fx(x), x+d, 400-this.fx(x+d));
			g2.draw(line);
			System.out.println(x+"  "+fx(x));
		}
	}
	public double fx(double x) {
		return ((0.00005*(x*x*x)) - (0.03*(x*x)) + (4*x) + 200);
	}
	
	
}