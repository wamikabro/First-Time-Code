import javax.swing.*;
class Boolean{
	public static void main(String[]args){
		String hid=JOptionPane.showInputDialog("There are 24 hours in a day : ");
		Boolean hoursinaday=Integer.parseInt(hid);
		if(hoursinaday==true){
			JOptionPane.showMessageDialog(null,"Good");
		}
		else{
			JOptionPane.showInputDialog("Wrong");
		}
		
	}
}
