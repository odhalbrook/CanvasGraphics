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
    			graphics.setColor(Color.BLACK);
    			graphics.fillOval(200, 200, 50, 50);
    			graphics.fillOval(450, 200, 50, 50);
    			
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
	