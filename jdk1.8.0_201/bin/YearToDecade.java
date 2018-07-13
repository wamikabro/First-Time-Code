import javax.swing.*;
class YearToDecade{
	public static void main(String[]args){
		String y=JOptionPane.showInputDialog("Enter Years: ");
		int year=Integer.parseInt(y);
		int decade=year/10;
		JOptionPane.showMessageDialog(null, "Decades: "+decade);
	}
}