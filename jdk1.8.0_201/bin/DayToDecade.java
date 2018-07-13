import javax.swing.*;
class DayToDecade{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Days: ");
		int day=Integer.parseInt(d);
		double decade=day/30/12/10;
		JOptionPane.showMessageDialog(null,"Decades: "+decade);
	}
}