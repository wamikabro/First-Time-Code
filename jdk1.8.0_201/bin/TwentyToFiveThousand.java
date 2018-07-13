import javax.swing.*;
class TwentyToFiveThousand{
	public static void main(String[]args){
		String twenty=JOptionPane.showInputDialog("Enter Twenties: ");
		int twenties=Integer.parseInt(twenty);
		int fivethousand=twenties/50/5;
		JOptionPane.showMessageDialog(null, "Five-Thousands: "+fivethousand);
	}
}