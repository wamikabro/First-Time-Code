import javax.swing.*;
class MonthToYear{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Months: ");
		int month=Integer.parseInt(m);
		int year=month/365;
		JOptionPane.showMessageDialog(null, "Years: "+year);
	}
}