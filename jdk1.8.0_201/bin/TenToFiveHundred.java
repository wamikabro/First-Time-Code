import javax.swing.*;
class TenToFiveHundred{
	public static void main(String[]args){
		String ten=JOptionPane.showInputDialog("Enter Tens: ");
		int tens=Integer.parseInt(ten);
		int fivehundred=tens/50;
		JOptionPane.showMessageDialog(null, "Five Hundreds: "+fivehundred);
	}
}