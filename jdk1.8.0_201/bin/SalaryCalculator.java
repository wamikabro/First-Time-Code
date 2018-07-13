import java.util.Scanner;
class SalaryCalculator{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Employe's Basic Pay: ");
		double basicpay=obj.nextInt();
		double houserent=(basicpay*45)/100;
		double medicalallowance=(basicpay*15)/100;
		double bonus=(basicpay*5)/100;
		double grosspay1=basicpay+houserent+medicalallowance+bonus;
		double grosspay=houserent+medicalallowance+bonus;
		double incometax=(basicpay*5)/100;
		double zakaat=(basicpay*2.5)/100;
		double convanceallowance=(basicpay*8)/100;
		double netincome1=incometax+convanceallowance+zakaat;
		double netincome=basicpay+grosspay1-netincome1;
		System.out.print("Basic Pay: "+basicpay+"\nHouse Rent: "+houserent+"\nMedical Allowance: "+medicalallowance+"\nBonus: "+bonus+"\nGross Pay: "+grosspay+"\nIncome Tax: "+incometax+"\nZakaat: "+zakaat+"\nConvance Allowance: "+convanceallowance+"\nNet Income: "+netincome);
	}
}