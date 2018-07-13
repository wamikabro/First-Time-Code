import javax.swing.*;
class FeetToInch{
	public static void main(String[]args){
		String f=JOptionPane.showInputDialog("Enter Feet: ");
		int feet=Integer.parseInt(f);
		int inch=feet*12;
		JOptionPane.showMessageDialog(null,"Inch: "+inch);
	}
}