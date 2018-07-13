import javax.swing.*;
class TenToTwenty{
	public static void main(String[]args){
		String ten=JOptionPane.showInputDialog("Enter Tens: ");
		int tens=Integer.parseInt(ten);
		int twenty=tens/2;
		JOptionPane.showMessageDialog(null, "Twenties: "+twenty);
	}
}