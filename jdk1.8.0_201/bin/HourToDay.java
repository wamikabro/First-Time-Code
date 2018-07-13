import javax.swing.*;
class HourToDay{
	public static void main(String[]args){
		String h=JOptionPane.showInputDialog("Enter Hour: ");
		int hour=Integer.parseInt(h);
		int day=hour/24;
		JOptionPane.showMessageDialog(null,"Days: "+day);
	}
}