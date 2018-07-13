import javax.swing.*;
class TwentyToHundred{
	public static void main(String[]args){
		String twenty=JOptionPane.showInputDialog("Enter Twenties: ");
		int twenties=Integer.parseInt(twenty);
		int hundred=twenties/5;
		JOptionPane.showMessageDialog(null, "Hundreds: "+hundred);
	}
}