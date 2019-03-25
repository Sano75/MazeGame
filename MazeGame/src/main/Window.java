package main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3268308197906744697L;

	public Window(Game game,int width,int height,String title) {
		JFrame frame = new JFrame(title);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game); // This is interesting, extending Canvas on CardGum basically let's CardGum be considered as a component
		game.start();
	}
}
