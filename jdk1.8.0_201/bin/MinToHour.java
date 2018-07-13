import javax.swing.*;
class MinToHour{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int min=Integer.parseInt(m);
		int hour=min/60;
		JOptionPane.showMessageDialog(null,"Minutes: "+hour);
	}
}