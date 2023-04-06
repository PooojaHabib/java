import java.applet.Applet;
import java.awt.*;

public class Graphicsdemo extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("Welcome",50,50);
		g.drawLine(30,80,50,60);
		g.drawRect(70,60,100,70);
		g.fillRect(70,80,30,30);
		g.drawOval(79,70,57,100);
		g.setColor(Color.green);
		g.fillOval(160,600,89,88);
		g.drawArc(83,76,90,56,89,88);
		g.fillArc(899,877,118,710,88,9);

	}

}
 