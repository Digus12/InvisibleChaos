import java.awt.*; 
import java.awt.event.*;
import java.awt.Graphics;

public class Invisible extends Frame
{

	public Invisible()
	{
		setSize(500,500);
		addWindowListener(new WindowAdapter()
		{ public void windowCLosing(windowEvent event) {System.exit(0); }});}
		
		public void paint(Graphics g)
		{
			double u =0.9,v=0.75;
			int T=3000; 
			double u1,v1; 	
	for(int t=0;t<T;t++){u1=u; v1 =v; u= -v1+2.0*u1-u1*u1*u1; v=u1;
		int mx =(int) Math.floor(100.0*u+300.0+0.5);
		int ny= (int) Math.floor(100.0*v+220.0+0.5);
			g.drawLine(mx,ny,mx,ny);
	}
		}
		public static void main(String[] args) 
		{Frame f= new Invisible(); f.setVisible(true);}
}
				
