import javax.swing.*;
class HourToCentury{
	public static void main(String[]args){
		String h=JOptionPane.showInputDialog("Enter Hours: ");
		int hour=Integer.parseInt(h);
		double century=hour/24/7/4/12/100;
		JOptionPane.showMessageDialog(null,"Centuries: "+century);
	}
}