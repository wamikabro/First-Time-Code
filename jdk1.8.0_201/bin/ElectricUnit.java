import javax.swing.*;
class ElectricUnit{
	public static void main(String[]args){
		String u=JOptionPane.showInputDialog("Enter Units: ");
		int unit=Integer.parseInt(u);
		if(unit<=100 && unit>=1){
			
			int first=unit*2;
			JOptionPane.showMessageDialog(null, "Rupees: "+first);
		}
		if(unit>100 && unit<=200){
			
			int first=100*2;
			int second=(unit-100)*4;
			int overall=first+second;
			JOptionPane.showMessageDialog(null, "Rupees: "+overall);
		}
		if(unit>200 && unit<=300){
			
			int first=100*2;
			int second=100*4;
			int third=(unit-200)*6;
			int overall=first+second+third;
			JOptionPane.showMessageDialog(null, "Rupees: "+overall);
		}
		if(unit>300 && unit<=400){
			
			int first=100*2;
			int second=100*4;
			int third=100*6;
			int fourth=(unit-300)*8;
			int overall=first+second+third+fourth;
			JOptionPane.showMessageDialog(null, "Rupees: "+overall);
		}
		if(unit>400){
			
			int first=100*2;
			int second=100*4;
			int third=100*6;
			int fourth=100*8;
			int fifth=(unit-400)*10;
			int overall=first+second+third+fourth+fifth;
			JOptionPane.showMessageDialog(null, "Rupees: "+overall);
		}
	}
}