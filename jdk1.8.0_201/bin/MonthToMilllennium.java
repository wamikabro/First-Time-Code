import javax.swing.*;
class MonthToMillennium{
	public static void main(String[]args){
		String m=JOptionPane.showInputDialog("Enter Months: ");
		int month=Integer.parseInt(m);
		double millennium=month/12/1000;
		JOptionPane.showMessageDialog(null,"Millennium: "+millennium);
	}
}