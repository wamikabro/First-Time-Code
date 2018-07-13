import javax.swing.*;
class ForWithoutBody{
	public static void main(String[]args){
		
		String numberr=JOptionPane.showInputDialog("Enter Starting: ");
		int numberi=Integer.parseInt(numberr);
		int number=0;
		String end=JOptionPane.showInputDialog("Enter Ending: ");
		int ending=Integer.parseInt(end);
		for(number=1 ; number<=ending; numberi += number++)
			JOptionPane.showMessageDialog(null, "Your Modified Number is: "+numberi);
	}
}