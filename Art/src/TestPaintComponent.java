import javax.swing.JFrame;

public class TestPaintComponent extends JFrame{

	
	public TestPaintComponent() {
		add(new NewPanel());
	}
	
	public static void main(String[] args) {
		TestPaintComponent frame = new TestPaintComponent();
		frame.setTitle("Windows 11++");//name of window
		frame.setSize(500, 500);//size of window
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //need this or else window will not close
		frame.setVisible(true);//have to make to window visible
	}

}
