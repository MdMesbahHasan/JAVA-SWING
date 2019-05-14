package odd_semester;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class menue {
	public static void main(String[] args) {
		ImageIcon img=new ImageIcon("logo.png");
		int choice=JOptionPane.showConfirmDialog(null,"Do you wanna exit?","Confirmation",JOptionPane.YES_NO_OPTION);
		if(choice==JOptionPane.YES_OPTION) {
			System.out.println("You have successfully exited");
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null,"Continue to the running program","Confirmation",JOptionPane.PLAIN_MESSAGE,img);
		}
	}
}
