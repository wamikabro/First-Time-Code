import javax.swing.*;
class HourToYear{
	public static void main(String[]args){
		String h=JOptionPane.showInputDialog("Enter Hours: ");
		int hour=Integer.parseInt(h);
		double year=hour/24/7/4/12;
		JOptionPane.showMessageDialog(null,"Years: "+year);
	}
}