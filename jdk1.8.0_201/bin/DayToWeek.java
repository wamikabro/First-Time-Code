import javax.swing.*;
class DayToWeek{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Days: ");
		int day=Integer.parseInt(d);
		int week=day/7;
		JOptionPane.showMessageDialog(null, "Weeks: "+week);
	}
}