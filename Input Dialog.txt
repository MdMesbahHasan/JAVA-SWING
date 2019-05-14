package odd_semester;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class test1 {
    	public static void main(String[] args) {
    		ImageIcon img=new ImageIcon("logo.png");
    		String f_name=JOptionPane.showInputDialog(null,"Enter your first name :","FIRST NAME",JOptionPane.QUESTION_MESSAGE);
    		String l_name=JOptionPane.showInputDialog(null,"Enter your last name: ","Last Name",JOptionPane.QUESTION_MESSAGE);
    		String name=f_name+" "+l_name;
    		JOptionPane.showMessageDialog(null, "Your full name is: "+name,"Description",JOptionPane.PLAIN_MESSAGE,img);
    		JOptionPane.showMessageDialog(null,"First name is: "+f_name);
    		JOptionPane.showMessageDialog(null,"Last name is: "+l_name);
    		JOptionPane.showConfirmDialog(null,"Do you wanna quit?","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
    	}
}

