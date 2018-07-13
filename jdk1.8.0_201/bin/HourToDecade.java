import javax.swing.*;
class HourToDecade{
	public static void main(String[]args){
		String h=JOptionPane.showInputDialog("Enter Hours: ");
		int hour=Integer.parseInt(h);
		double decade=hour/24/7/4/12/10;
		JOptionPane.showMessageDialog(null,"Decades: "+decade);
	}
}