import javax.swing.*;
class HourToMinute{
	public static void main(String[]args){
		String h=JOptionPane.showInputDialog("Enter Hours: ");
		int hour=Integer.parseInt(h);
		int minute=hour*60;
		JOptionPane.showMessageDialog(null, "Minutes: "+minute);
	}
}