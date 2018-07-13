import javax.swing.JOptionPane;
class BirthdayWish{
	public static void main(String[]args){
		String input = JOptionPane.showInputDialog("What is the name of a Birthday person?"); //asking
		JOptionPane.showMessageDialog(null, "Happy Birthday Dear "+input); //printing
	}
}