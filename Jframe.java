package odd_semester;

import javax.swing.JFrame;

public class Jframe extends JFrame{
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,300);
		//frame.setLocationRelativeTo(null);
		//frame.setLocation(700,250);
		frame.setBounds(500, 100, 400, 600);
		frame.setTitle("Frame work");
		frame.setResizable(false);
	}

}
