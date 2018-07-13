import javax.swing.*;
class MillisecondToMicrosecond{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Milliseconds: ");
		int millisecond=Integer.parseInt(m);
		int microsecond=millisecond*1000;
		JOptionPane.showMessageDialog(null, "Microsecond: "+microsecond);
	}
}