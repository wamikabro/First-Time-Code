import javax.swing.*;
class DayToYear{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Days: ");
		int day=Integer.parseInt(d);
		double year=day/30/12;
		JOptionPane.showMessageDialog(null,"Years: "+year);
	}
}