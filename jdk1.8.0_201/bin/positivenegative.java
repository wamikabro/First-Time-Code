import javax.swing.*;
class positivenegative{
	public static void main(String[]args){
		String num=JOptionPane.showInputDialog("Enter Number: ");
		int number=Integer.parseInt(num);
		if(number>0){
			JOptionPane.showMessageDialog(null, "Your number is Positive");
		}
		else{
			JOptionPane.showMessageDialog(null, "Your number is Negative");
		}
	}
}
