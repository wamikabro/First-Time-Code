import javax.swing.*;
class JWeather{
	public static void main(String[]args){
		String monthnum=JOptionPane.showInputDialog("Enter Month number: ");
		int monthnumber=Integer.parseInt(monthnum);
		
		if(monthnumber==1 || monthnumber==11 || monthnumber==12){
			JOptionPane.showMessageDialog(null, "Season is Autumn");
		}
		else if(monthnumber==2 || monthnumber==3 || monthnumber==4){
			JOptionPane.showMessageDialog(null, "Season is Winter");
		}
		else if(monthnumber==5 || monthnumber==6 || monthnumber==7){
			JOptionPane.showMessageDialog(null, "Season is Spring");
		}
		else if(monthnumber==8 || monthnumber==9 || monthnumber==10){
			JOptionPane.showMessageDialog(null, "Season is Summer");
		}
		else{
			JOptionPane.showMessageDialog(null, "There is no "+monthnumber+" Month");
		}
	}
}