import java.awt.*;
import javax.swing.*;
 
public class CheckerBoard extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
    			CheckerBoard canvas = new CheckerBoard();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		
	        for (int u = 10; u < 400; u = u + 100)
	        	{
	        		for (int s = 10; s < 400; s = s + 100)
	        			{
	        				graphics.setColor(Color.red);
	        				graphics.fillRect(u, s, 50, 50);
	        				
	        				graphics.setColor(Color.black);
	        				graphics.fillRect(u + 50, s, 50, 50);
	        				
	        				graphics.setColor(Color.black);
	        				graphics.fillRect(u, s + 50, 50, 50);
	        				
	        				graphics.setColor(Color.red);
	        				graphics.fillRect(u + 50, s + 50, 50, 50);
	        			}
	        	}
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} 
    	        catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
	