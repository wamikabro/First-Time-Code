import javax.swing.*;
class MonthToWeek{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Months: ");
		int month=Integer.parseInt(m);
		int week=month*4;
		JOptionPane.showMessageDialog(null, "Weeks: "+week);
	}
}