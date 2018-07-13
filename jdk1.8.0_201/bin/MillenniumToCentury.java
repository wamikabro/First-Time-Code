import javax.swing.*;
class MillenniumToCentury{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Millenniums: ");
		int millennium=Integer.parseInt(m);
		int century=millennium*10;
		JOptionPane.showMessageDialog(null, "Centuries: "+century);
	}
}