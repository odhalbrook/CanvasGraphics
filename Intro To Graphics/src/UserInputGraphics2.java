import java.awt.*;
import javax.swing.*;
 
public class UserInputGraphics2 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
    			UserInputGraphics2 canvas = new UserInputGraphics2();
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
    			boolean bouncing = true;
    			
    			while (bouncing)
    				{
    					int randomNum = (int) (Math.random( ) * 1000);
		    			for (int i = 0; i < randomNum; i++)
		    	        	{
		    		        graphics.setColor(Color.green);
		    		        graphics.fillRect(i, i, 20, 20);
		    		        
		    		        delay();
		    		        
		    		        graphics.setColor(Color.white);
		    		        graphics.fillRect(i, i, 20, 20);
		    	        	}
		
		    			for (int i = randomNum; i > 1; i--)
		    	        	{
		    		        graphics.setColor(Color.green);
		    		        graphics.fillRect(i, i, 20, 20);
		    		        
		    		        delay();
		    		        
		    		        graphics.setColor(Color.white);
		    		        graphics.fillRect(i, i, 20, 20);
		    	        	}
    				}
	        	}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(3);
    					} 
    	        catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
	
		
	}
