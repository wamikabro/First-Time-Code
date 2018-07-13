import javax.swing.*;
class DayToMonth{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Days: ");
		int day=Integer.parseInt(d);
		double month=day/30;
		JOptionPane.showMessageDialog(null,"Months: "+month);
	}
}