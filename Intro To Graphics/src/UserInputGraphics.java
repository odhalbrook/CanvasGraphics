		import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
		 
		public class UserInputGraphics extends Canvas
		{
			private static final long	serialVersionUID	= 1L;
		 
		    	public static void main(String[] args) 
		    		{
		    			UserInputGraphics canvas = new UserInputGraphics();
			        JFrame frame = new JFrame();
			        frame.setSize(800, 600);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
		    		}
		 
		    	public void paint(Graphics graphics) 
		    		{
		    			Scanner userInput = new Scanner(System.in);
		    			System.out.println("How Big do you want your square to be?");
		    			int squareSize = userInput.nextInt();
		    			graphics.setColor(Color.blue);
		    			graphics.fillRect(10, 10, squareSize, squareSize);
		    			
		    			
		    		}
		    	
		    		public void delay()
		    			{
		    	        try
		    					{
		    					Thread.sleep(500);
		    					} 
		    	        catch (InterruptedException e)
		    					{
		    					e.printStackTrace();
		    					}
		    			}
		    	}
