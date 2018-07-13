import javax.swing.*;
class SecToDecade{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		double sec=Integer.parseInt(s);
		double decade=sec/60/60/24/7/4/12/10;
		JOptionPane.showMessageDialog(null,"Decades: "+decade);
	}
}