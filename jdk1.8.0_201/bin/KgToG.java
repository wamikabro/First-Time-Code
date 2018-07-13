import javax.swing.*;
class KgToG{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Kilo: ");
		int kilo=Integer.parseInt(s);
		int gram=kilo*1000;
		JOptionPane.showMessageDialog(null,"Gram: "+gram);
		
	}
}