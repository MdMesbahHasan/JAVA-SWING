package odd_semester;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class changingicon extends JFrame{
	private static ImageIcon img;
	private Container colorr;
	changingicon(){
		initialisingcomponenets();
	}
	public void initialisingcomponenets() {
		img=new ImageIcon(getClass().getResource("logo.png"));
		this.setIconImage(img.getImage());
		colorr=this.getContentPane();
		colorr.setBackground(Color.MAGENTA);
	}
	public static void main(String [] args) {
			changingicon frame;
			frame=new changingicon();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(300, 100, 900, 600);
			JOptionPane.showMessageDialog(null, "Would you believe!","Confirmation",JOptionPane.PLAIN_MESSAGE,img);
			JOptionPane.showConfirmDialog(null, "Confirmation","Further",JOptionPane.YES_NO_CANCEL_OPTION);
		}
}
