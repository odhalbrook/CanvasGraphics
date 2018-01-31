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
			        frame.setSize(1000, 1000);
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
		    			System.out.println("What Color do you want it to be");
		    			System.out.println("1.Red");
		    			System.out.println("2.Blue");
		    			int squareColor = userInput.nextInt();
		    			if (squareColor == 1)
		    				{
				    			graphics.setColor(Color.red);
		    				}
		    			else
		    				{
				    			graphics.setColor(Color.blue);
		    				}
		    			graphics.fillRect(10, 10, squareSize, squareSize);
		    			
		    			for(int r = 0; r < 255; r++)
		    				{
		    					for(int g = 0; g < 255; g++)
		    						{
		    							for(int b = 0; b < 255; b++)
		    								{
		    									int z = (int) (Math.random( ) * 254);
		    					    			int y = (int) (Math.random( ) * 254);
		    					    			int x = (int) (Math.random( ) * 254);
									    		graphics.setColor(new Color (z,y,x));
									    		graphics.fillRect(600, 600, 100, 100);
									    		delay();
		    								}
		    						}
		    				}
		    			
		    			
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
