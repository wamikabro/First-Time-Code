import javax.swing.*;
class MinuteToDecade{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int min=Integer.parseInt(m);
		double decade=min/60/24/365/10;
		JOptionPane.showMessageDialog(null,"Decades: "+decade);
	}
}