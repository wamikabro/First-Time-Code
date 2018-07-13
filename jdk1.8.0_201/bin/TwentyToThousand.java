import javax.swing.*;
class TwentyToThousand{
	public static void main(String[]args){
		String twenty=JOptionPane.showInputDialog("Enter Twenties: ");
		int twenties=Integer.parseInt(twenty);
		int thousand=twenties/50;
		JOptionPane.showMessageDialog(null, "Thousands: "+thousand);
	}
}