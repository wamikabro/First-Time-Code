import javax.swing.*;
class MinuteToCentury{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int min=Integer.parseInt(m);
		double century=min/60/24/365/100;
		JOptionPane.showMessageDialog(null,"Centuries: "+century);
	}
}