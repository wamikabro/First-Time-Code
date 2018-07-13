import javax.swing.JOptionPane;
import java.util.Scanner;
class ATMM{
	public static void main(String[]args){
		int a=JOptionPane.showInputDialog("Tell us the Amount");
		JOptionPane.showMessageDialog(null, "You told us the Amount "+a+"Rs");
	}
}