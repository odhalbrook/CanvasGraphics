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
    		
	        graphics.setColor(Color.red);
	        graphics.fillOval(140, 130, 100, 100);
	        
	        graphics.setColor(Color.blue);
	        graphics.drawRect(400, 500, 201, 101);
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(401, 501, 200, 100);
	        
	        graphics.setColor(Color.black);
	        graphics.drawLine(800, 0, 0, 600);
	        graphics.drawLine(0, 0, 800, 600);
	        
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
	