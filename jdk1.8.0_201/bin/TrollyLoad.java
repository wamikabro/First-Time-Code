import javax.swing.*;
class TrollyLoad{
	public static void main(String[]args){
		String t=JOptionPane.showInputDialog("Enter Trollies: ");
		int trolly=Integer.parseInt(t);
		int rent=trolly*800;
		int driver=150*trolly;
		int tax=(rent/10)*trolly;
		int diesel=210*trolly;
		int loss=driver+tax+diesel;
		int profit=rent-loss;
		int total=loss+profit;
		JOptionPane.showMessageDialog(null,"Trollies: "+trolly+"\nTrolly Rent: "+rent+"\nDriver Charges: "+driver+"\nTax: "+tax+"\nDiesel: "+diesel+"\nTotal: "+total+"\nInterest: "+loss+"\nProfit: "+profit);
	}
}