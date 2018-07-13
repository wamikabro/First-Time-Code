import javax.swing.*;
class TenToFiveThousand{
	public static void main(String[]args){
		String ten=JOptionPane.showInputDialog("Enter Tens: ");
		int tens=Integer.parseInt(ten);
		int fivethousand=tens/500;
		JOptionPane.showMessageDialog(null, "Five-Thousands: "+fivethousand);
	}
}