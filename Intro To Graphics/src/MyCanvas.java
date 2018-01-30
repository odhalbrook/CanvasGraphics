import java.awt.*;
import javax.swing.*;
 
public class MyCanvas extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        MyCanvas canvas = new MyCanvas();
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
    		
    			graphics.setColor(Color.yellow);
    			graphics.fillOval(50, 50, 600, 600);
    			
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
							    		graphics.fillRect(200, 200, 50, 50);
							    		graphics.fillRect(450, 200, 50, 50);
							    		graphics.fillArc(200, 250, 300, 350, 400, 450);
							    		delay();
    								}
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
	