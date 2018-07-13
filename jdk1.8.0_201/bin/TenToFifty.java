import javax.swing.*;
class TenToFifty{
	public static void main(String[]args){
		String ten=JOptionPane.showInputDialog("Enter Tens: ");
		int tens=Integer.parseInt(ten);
		int fifty=tens/5;
		JOptionPane.showMessageDialog(null, "Fifties: "+fifty);
	}
}