import javax.swing.*;
class DecadeToCentury{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Decades: ");
		int decade=Integer.parseInt(d);
		int century=decade/10;
		JOptionPane.showMessageDialog(null, "Centuries: "+century);
	}
}