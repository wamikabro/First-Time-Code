import javax.swing.*;
class TwentyToFivehundred{
	public static void main(String[]args){
		String twenty=JOptionPane.showInputDialog("Enter Twenties: ");
		int twenties=Integer.parseInt(twenty);
		int fivehundred=twenties/25;
		JOptionPane.showMessageDialog(null, "Five-Hundreds: "+fivehundred);
	}
}