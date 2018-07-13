import javax.swing.*;
class TenToHundred{
	public static void main(String[]args){
		String ten=JOptionPane.showInputDialog("Enter Tens: ");
		int tens=Integer.parseInt(ten);
		int hundred=tens/10;
		JOptionPane.showMessageDialog(null, "Hundreds: "+hundred);
	}
}