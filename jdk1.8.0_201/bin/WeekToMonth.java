import javax.swing.*;
class WeekToMonth{
	public static void main(String[]args){
		String w=JOptionPane.showInputDialog("Enter Weeks: ");
		int week=Integer.parseInt(w);
		int month=week/4;
		JOptionPane.showMessageDialog(null, "Months: "+month);
	}
}