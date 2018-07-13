import javax.swing.*;
class AtoZ{
	public static void main(String[]args){
		String alpha=JOptionPane.showInputDialog("Enter Alphabet");
		if(alpha.equals('A')){
			JOptionPane.showMessageDialog(null, "Apple");
		}
	}
}