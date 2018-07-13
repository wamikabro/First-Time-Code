import javax.swing.*;
class Grades{
	public static void main(String[]args){
		String percenta=JOptionPane.showInputDialog("Enter Percentage: ");
		int percentagee=Integer.parseInt(percenta);
		if(percentagee<=100 && percentagee>=90){
			JOptionPane.showMessageDialog(null, "You have got A+ Grade");
		}
		if(percentagee<90 && percentagee>=80){
			JOptionPane.showMessageDialog(null, "You have got A Grade");
		}
		if(percentagee<80 && percentagee>=70){
			JOptionPane.showMessageDialog(null, "You have got B Grade");
		}
		if(percentagee<70 && percentagee>=60){
			JOptionPane.showMessageDialog(null, "You have got C Grade");
		}
		if(percentagee<60 && percentagee>=50){
			JOptionPane.showMessageDialog(null, "You have got D Grade");
		}
		if(percentagee<50 && percentagee>=40){
			JOptionPane.showMessageDialog(null, "You have got E Grade");
		}
		if(percentagee<40){
			JOptionPane.showMessageDialog(null, "You are Fail! Best of luck for next time noob!");
		}
		
		
	}
}