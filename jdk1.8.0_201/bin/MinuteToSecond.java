import javax.swing.*;
class MinuteToSecond{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Minutes: ");
		int minute=Integer.parseInt(m);
		int second=minute*60;
		JOptionPane.showMessageDialog(null, "Seconds: "+second);
	}
}