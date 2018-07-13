import javax.swing.*;
class WeekToCentury{
	public static void main(String[]args){
		String w=JOptionPane.showInputDialog("Enter Weeks: ");
		int week=Integer.parseInt(w);
		double century=week/4/12/100;
		JOptionPane.showMessageDialog(null,"Centuries: "+century);
	}
}