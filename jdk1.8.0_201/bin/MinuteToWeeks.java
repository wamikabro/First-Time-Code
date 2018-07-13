import javax.swing.*;
class MinuteToWeek{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int min=Integer.parseInt(m);
		int week=min/60/24/7;
		JOptionPane.showMessageDialog(null,"Weeks: "+week);
	}
}