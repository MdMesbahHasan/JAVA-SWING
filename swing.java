package odd_semester;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class swing {
	public static void main(String[] args) {
		ImageIcon img1=new ImageIcon("logo.png");
		JOptionPane.showMessageDialog(null, "First project","Which One",JOptionPane.PLAIN_MESSAGE,img1);
		JOptionPane.showMessageDialog(null, "Second project","Question",JOptionPane.PLAIN_MESSAGE,img1);
	}
}
