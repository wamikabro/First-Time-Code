import javax.swing.*;
class JIfElse{
	public static void main(String[]args){
		String c=JOptionPane.showInputDialog("Select any\n1:Currency Distributor\n2:MarkSheet\n3:Trolly Load\n4:Salary Calculator");
		int choose=Integer.parseInt(c);
		if (choose==1)
		{
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
			JOptionPane.showMessageDialog(null, "***** Currency Distributor *****\nFive Thousands: "+fivethousand+"\nThousands: "+thousand+"\nFive Hundreds: "+fivehundred+"\nHundreds: "+hundred+"\nFifties: "+fifty+"\nTwenties: "+twenty+"\nTens: "+ten+"\nFive"+five+"\nDuos: "+two+"\nOnes: "+rupees9);
		}
		else if(choose==2)
		{
			String j=JOptionPane.showInputDialog("***** MarkSheet *****\nEnter Java Marks: ");
			int java=Integer.parseInt(j);
			String h=JOptionPane.showInputDialog("***** MarkSheet *****\nEnter HTML Marks: ");
			int html=Integer.parseInt(h);
			String cc=JOptionPane.showInputDialog("***** MarkSheet *****\nEnter CSS Marks: ");
			int css=Integer.parseInt(cc);
			String ph=JOptionPane.showInputDialog("***** MarkSheet *****\nEnter PHP Marks: ");
			int php=Integer.parseInt(ph);
			String py=JOptionPane.showInputDialog("***** MarkSheet *****\nEnter Python Marks: ");
			int python=Integer.parseInt(py);
			int obtained=java+html+css+php+python;
			double percentage=obtained*100/500;
			JOptionPane.showMessageDialog(null, "*****MarkSheet*****\nJava: "+java+"/100\nHTML: "+html+"/100\nCSS: "+css+"/100\nPHP: "+php+"/100\nPython: "+python+"/100\nObtained: "+obtained+" out of 500\nPercentage: "+percentage+"%");
		}
		else if(choose==3)
		{
			String t=JOptionPane.showInputDialog("***** Trolly Load *****\nEnter Trollies: ");
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
		else if(choose==4)
		{
			String b=JOptionPane.showInputDialog("Enter BasicPay: ");
			double basicpay=Integer.parseInt(b);
			double houserent=(basicpay*45)/100;
			double medicalallowance=(basicpay*15)/100;
			double bonus=(basicpay*5)/100;
			double grosspay=basicpay+houserent+medicalallowance+bonus;
			double grosspay1=houserent+medicalallowance+bonus;
			double incometax=(basicpay*5)/100;
			double zakaat=(basicpay*2.5)/100;
			double convanceallowance=(basicpay*8)/100;
			double netincome1=incometax+convanceallowance+zakaat;
			double netincome=basicpay+grosspay1-netincome1;
			JOptionPane.showMessageDialog(null, "Basic Pay: "+basicpay+"\nHouse Rent: "+houserent+"\nMedical Allowance: "+medicalallowance+"\nBonus: "+bonus+"\nGross Pay: "+grosspay+"\nIncome Tax: "+incometax+"\nZakaat: "+zakaat+"\nConvance Allowance: "+convanceallowance+"\nNet Income: "+netincome);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The program you searched for isn't in search list.");
		}
	}
}