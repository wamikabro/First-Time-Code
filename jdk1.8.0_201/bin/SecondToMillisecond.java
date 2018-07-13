import javax.swing.*;
class SecondToMillisecond{
	public static void main(String[]args){
		String s=JOptionPane.showInputDialog("Enter Seconds: ");
		int second=Integer.parseInt(s);
		int millisecond=second*1000;
		JOptionPane.showMessageDialog(null, "Milliseconds: "+millisecond);
	}
}