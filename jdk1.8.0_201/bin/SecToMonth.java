import javax.swing.*;
class SecToMonth{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		double sec=Integer.parseInt(s);
		double month=sec/60/60/24/7/4;
		JOptionPane.showMessageDialog(null,"Months: "+month);
	}
}