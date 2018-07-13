import javax.swing.*;
class WeekToYear{
	public static void main(String[]args){
		String w=JOptionPane.showInputDialog("Enter Weeks: ");
		int week=Integer.parseInt(w);
		double year=week/4/12;
		JOptionPane.showMessageDialog(null,"Years: "+year);
	}
}