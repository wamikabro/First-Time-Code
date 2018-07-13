import javax.swing.*;
class SecToWeek{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		int sec=Integer.parseInt(s);
		int week=sec/60/60/24/7;
		JOptionPane.showMessageDialog(null,"Weeks: "+week);
	}
}