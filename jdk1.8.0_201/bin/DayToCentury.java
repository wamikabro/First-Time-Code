import javax.swing.*;
class DayToCentury{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Days: ");
		int day=Integer.parseInt(d);
		double century=day/30/12/100;
		JOptionPane.showMessageDialog(null,"Century: "+century);
	}
}