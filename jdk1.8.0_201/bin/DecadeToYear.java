import javax.swing.*;
class DecadeToYear{
	public static void main(String[]args){
		String d=JOptionPane.showInputDialog("Enter Decades: ");
		int decade=Integer.parseInt(d);
		int year=decade*10;
		JOptionPane.showMessageDialog(null, "Years: "+year);
	}
}