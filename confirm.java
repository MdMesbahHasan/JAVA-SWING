package odd_semester;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class confirm {

	public static void main(String[] args) {
		ImageIcon img=new ImageIcon("logo.png");
		int choice=JOptionPane.showConfirmDialog(null, "Do you wanna quit this program?","Your choice",JOptionPane.YES_NO_OPTION);
		if(choice==JOptionPane.YES_OPTION) {
			System.out.println("You exited");
			System.exit(0);
			
		}else {
			JOptionPane.showMessageDialog(null,"Continue to this program","confirmation",JOptionPane.PLAIN_MESSAGE,img);
		}
	}

}
