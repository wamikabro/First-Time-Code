import javax.swing.*;
class SecToHour{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		int sec=Integer.parseInt(s);
		int hour=sec/60/60;
		JOptionPane.showMessageDialog(null,"Hours: "+hour);
	}
}