import javax.swing.*;
class DayToHour{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Days: ");
		int day=Integer.parseInt(d);
		int hour=day*24;
		JOptionPane.showMessageDialog(null, "Hours: "+hour);
	}
}