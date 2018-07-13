import javax.swing.*;
class WeekToDecade{
	public static void main(String[]args){
		String w=JOptionPane.showInputDialog("Enter Weeks: ");
		int week=Integer.parseInt(w);
		double decade=week/4/12/10;
		JOptionPane.showMessageDialog(null,"Decades: "+decade);
	}
}