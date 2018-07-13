import javax.swing.*;
class CenturyToMillennium{
	public static void main(String[]args){
		String c=JOptionPane.showInputDialog("Enter Centuries: ");
		int century=Integer.parseInt(c);
		int millennium=century/10;
		JOptionPane.showMessageDialog(null, "Millenniums: "+millennium);
	}
}