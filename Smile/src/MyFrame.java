import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyPanel2 panel;
	
	public MyFrame(String title) {
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new MyPanel2();
		this.add(panel);
		this.setVisible(true);
	}
	
	public static void main(String[] args) throws InterruptedException{
		MyFrame frame = new MyFrame("MyFrame");
		
		while(true) {
			final int dist = 200;
			final int hei = 100;
			for(int i = 0; i<dist; i+=2) {
				frame.panel.setPos(i,hei);
				Thread.sleep(10);
			}
			
			for(int x=dist; x>0; x-=2) {
				frame.panel.setPos(x,hei);
				Thread.sleep(10);
			}
		}
	}
}
