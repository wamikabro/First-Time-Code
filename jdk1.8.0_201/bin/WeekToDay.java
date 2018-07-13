import javax.swing.*;
class WeekToDay{
	public static void main(String[]args){
		String w=JOptionPane.showInputDialog("Enter Weeks: ");
		int week=Integer.parseInt(w);
		int day=week*7;
		JOptionPane.showMessageDialog(null, "Days: "+day);
	}
}