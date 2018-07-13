import javax.swing.*;
class TenToThousand{
	public static void main(String[]args){
		String ten=JOptionPane.showInputDialog("Enter Tens: ");
		int tens=Integer.parseInt(ten);
		int thousand=tens/100;
		JOptionPane.showMessageDialog(null, "Thousands: "+thousand);
	}
}