import javax.swing.*;

@SuppressWarnings("serial")
class MyFirstFrame extends JFrame {
	MyFirstFrame() {
		this.setTitle("Minji's First Java Window");
		this.setSize(300, 200);
		this.setLocation(200, 200);	
	}
}
public class Ex1_3 {

	public static void main(String[] args) {
			JFrame frame = new MyFirstFrame();			
			
			frame.setVisible(true);

	}

}
