import javax.swing.*;
class MinuteToMonth{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int min=Integer.parseInt(m);
		int month=min/60/24/30;
		JOptionPane.showMessageDialog(null,"Months: "+month);
	}
}