package main;


import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.*;

public class Laser {
	
	public Laser() {
		 new DrawThings();	
	}
	
	
	@SuppressWarnings("serial")
	private class DrawThings extends JComponent{
		public void paint(Graphics g) {
			Graphics2D gra2 = (Graphics2D)g;			
			
			
			gra2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
						
			Shape drawLine = new Line2D.Float(20, 90, 55, 55);
			Shape drawLine2 = new Line2D.Float(50, 5, 100, 250);
			Shape drawLine3 = new Line2D.Float(100, 120, 250, 250);
			Shape drawLine4 = new Line2D.Float(400, 250, 120, 400);
			Shape drawLine5 = new Line2D.Float(400, 5, 400, 250);
			Shape drawLine6 = new Line2D.Float(450, 300, 200, 450);	
			
			
			gra2.setPaint(Color.RED);
			gra2.draw(drawLine);
			gra2.draw(drawLine2);
			gra2.draw(drawLine5);
			
				
			
			gra2.setPaint(Color.BLUE);
			gra2.draw(drawLine3);
			gra2.draw(drawLine4);
			gra2.draw(drawLine6);
			}
			
			
		}
	}


