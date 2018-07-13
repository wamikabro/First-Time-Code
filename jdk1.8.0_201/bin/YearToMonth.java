import javax.swing.*;
class YearToMonth{
	public static void main(String[]args){
		String y=JOptionPane.showInputDialog("Enter Years: ");
		int year=Integer.parseInt(y);
		int month=year*12;
		JOptionPane.showMessageDialog(null, "Months: "+month);
	}
}