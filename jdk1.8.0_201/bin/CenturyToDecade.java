import javax.swing.*;
class CenturyToDecade{
	public static void main(String[]args){
		String c=JOptionPane.showInputDialog("Enter Centuries: ");
		int century=Integer.parseInt(c);
		int decade=century*10;
		JOptionPane.showMessageDialog(null, "Decades: "+decade);
	}
}