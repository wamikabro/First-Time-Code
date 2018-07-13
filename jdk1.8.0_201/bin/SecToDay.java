import javax.swing.*;
class SecToDay{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		int sec=Integer.parseInt(s);
		int day=sec/60/60/24;
		JOptionPane.showMessageDialog(null,"Days: "+day);
	}
}