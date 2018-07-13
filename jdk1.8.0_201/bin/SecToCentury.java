import javax.swing.*;
class SecToCentury{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		double sec=Integer.parseInt(s);
		double century=sec/60/60/24/7/4/12/10/10;
		JOptionPane.showMessageDialog(null,"Centuries: "+century);
	}
}