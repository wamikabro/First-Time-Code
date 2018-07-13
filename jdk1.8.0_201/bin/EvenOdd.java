import javax.swing.*;
class EvenOdd{
	public static void main(String[]args){
		String numm=JOptionPane.showInputDialog("Enter Number: ");
		int numberr=Integer.parseInt(numm);
		int numb=numberr%2;
		if(numb==0){
			JOptionPane.showMessageDialog(null, "Your number is Even number");
		}
		else{
			JOptionPane.showMessageDialog(null, "Your number is Odd number");
		}
	}
}