import javax.swing.*;
class YearToCentury{
	public static void main(String[]args){
		String y=JOptionPane.showInputDialog("Enter Years: ");
		int year=Integer.parseInt(y);
		double century=year/100;
		JOptionPane.showMessageDialog(null,"Centuries: "+century);
	}
}