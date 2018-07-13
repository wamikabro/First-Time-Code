import javax.swing.*;
class SecToYear{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		double sec=Integer.parseInt(s);
		double year=sec/60/60/24/7/4/12;
		JOptionPane.showMessageDialog(null,"Years: "+year);
	}
}