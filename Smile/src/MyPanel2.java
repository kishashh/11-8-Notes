
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel2 extends JPanel{
	private int x;
	private int y;
	private ImageIcon icon = new ImageIcon("smiley.png");
	
	public MyPanel2() {
		super();
		x=100;
		y=200;
	}
	
	public void setPos(int x, int y) {
		this.x =x;
		this.y =y;
		this.repaint();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		icon.paintIcon(this, g, x, y);
	}
}
