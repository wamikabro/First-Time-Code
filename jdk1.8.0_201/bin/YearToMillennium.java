import javax.swing.*;
class YearToMillennium{
	public static void main(String[]args){
		String y=JOptionPane.showInputDialog("Enter Years: ");
		int year=Integer.parseInt(y);
		double millennium=year/100/10;
		JOptionPane.showMessageDialog(null,"Millennium: "+millennium);
	}
}