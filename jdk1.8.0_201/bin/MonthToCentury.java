import javax.swing.*;
class MonthToCentury{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Months: ");
		int month=Integer.parseInt(m);
		double century=month/12/100;
		JOptionPane.showMessageDialog(null,"Centuries: "+century);
	}
}