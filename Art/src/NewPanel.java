import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class NewPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(0, 0, 50, 50);//line
		g.drawString("CS2334", 0, 40);//text
		g.setColor(Color.RED);//sets color
		//g.drawRect(0, 0, 20, 30);//rectangle outline
		//g.fillRect(0, 0, 20, 30);//rectangle
		g.drawArc(0, 0, 300, 300, 45, 180);//draws arc or half circle
	}
	
}
