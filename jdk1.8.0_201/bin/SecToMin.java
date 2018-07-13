import javax.swing.*;
class SecToMin{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		int sec=Integer.parseInt(s);
		int min=sec/60;
		JOptionPane.showMessageDialog(null,"Minutes: "+min);
	}
}