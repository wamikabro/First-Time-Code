import javax.swing.*;
class HourToWeek{
	public static void main(String[]args){
		String h=JOptionPane.showInputDialog("Enter Hours: ");
		int hour=Integer.parseInt(h);
		double week=hour/24/7;
		JOptionPane.showMessageDialog(null,"Weeks: "+week);
	}
}