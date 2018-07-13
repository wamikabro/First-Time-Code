import javax.swing.*;
class MonthToDecade{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Months: ");
		int month=Integer.parseInt(m);
		double decade=month/12/10;
		JOptionPane.showMessageDialog(null,"Decades: "+decade);
	}
}