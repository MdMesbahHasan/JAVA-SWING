package odd_semester;
import javax.swing.JFrame;

public class test2 extends JFrame{
		test2(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(400,100,900,300);
			setTitle("Pop Up Menue");
		}
	public static void main(String[] args) {
		test2 frame;
		frame=new test2();
		frame.setVisible(true);
	}

}
