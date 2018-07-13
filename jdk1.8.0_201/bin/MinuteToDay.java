import javax.swing.*;
class MinuteToDay{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int min=Integer.parseInt(m);
		int day=min/60/24;
		JOptionPane.showMessageDialog(null,"Days: "+day);
	}
}