import javax.swing.*;
class JATM{
	public static void main(String[]args){
		String rupee=JOptionPane.showInputDialog("\n***** Currency Distributor *****\nEnter Rupees: ");
		int rupees=Integer.parseInt(rupee);
		int fivethousand=rupees/5000; 
		int rupees1=rupees%5000;
		int thousand=rupees1/1000;
		int rupees2=rupees1%1000;
		int fivehundred=rupees2/500; 
		int rupees3=rupees2%500;
		int hundred=rupees3/100;
		int rupees4=rupees3%100;
		int fifty=rupees4/50; 
		int rupees5=rupees4%50;
		int twenty=rupees5/20; 
		int rupees6=rupees5%20;
		int ten=rupees6/10; 
		int rupees7=rupees6%10;
		int five=rupees7/5; 
		int rupees8=rupees7%5;
		int two=rupees8/2; 
		int rupees9=rupees8%2; 
		JOptionPane.showMessageDialog(null, "*****Currency Distributor*****\nFive Thousands: "+fivethousand+"\nThousands: "+thousand+"\nFive Hundreds: "+fivehundred+"\nHundreds: "+hundred+"\nFifties: "+fifty+"\nTwenties: "+twenty+"\nTens: "+ten+"\nFive"+five+"\nDuos: "+two+"\nOnes: "+rupees9);
	}
}