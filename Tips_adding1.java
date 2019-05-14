package odd_semester;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tips_adding1 extends JFrame{

	private Container c;
	private JLabel user,user1;
	private Font f;
	Tips_adding1(){
		initialization();
	}
	public void initialization(){
		f=new Font("Arial",Font.BOLD,27);
		c=this.getContentPane();
		c.setBackground(Color.CYAN);
		c.setLayout(null);	
		user=new JLabel();
		user.setText("Enter your username: ");
		user.setBounds(10,1,300,30);
		user.setFont(f);
		user.setForeground(Color.BLUE);
		user.setOpaque(true);
		user.setBackground(Color.YELLOW);
		//user.setToolTipText("Your username");
		c.add(user);
		user1=new JLabel();
		user1.setText("Enter your password: ");
		user1.setBounds(200,70,300,29);
		user1.setFont(f);
		user1.setForeground(Color.BLUE);
		user1.setOpaque(true);
		user1.setBackground(Color.GREEN);
		user1.setToolTipText("Your password");
		c.add(user1);		
		
	}
	public static void main(String[] args) {
		label frame=new label();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(450,200,500,300);
	}

}
