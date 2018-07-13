import javax.swing.*;
class HourToMonth{
	public static void main(String[]args){
		String h=JOptionPane.showInputDialog("Enter Hours: ");
		int hour=Integer.parseInt(h);
		double month=hour/24/7/4;
		JOptionPane.showMessageDialog(null,"Months: "+month);
	}
}