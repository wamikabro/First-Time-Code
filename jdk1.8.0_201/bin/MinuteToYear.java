import javax.swing.*;
class MinuteToYear{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int min=Integer.parseInt(m);
		double year=min/60/24/365;
		JOptionPane.showMessageDialog(null,"Years: "+year);
	}
}