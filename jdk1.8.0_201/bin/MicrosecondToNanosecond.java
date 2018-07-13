import javax.swing.*;
class MicrosecondToNanosecond{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Microseconds: ");
		int microsecond=Integer.parseInt(m);
		int nanosecond=microsecond*10;
		JOptionPane.showMessageDialog(null, "Nanoseconds: "+nanosecond);
	}
}