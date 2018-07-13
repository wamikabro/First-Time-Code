import java.util.Scanner;
class ATM{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Rupees: ");
		int rupees=obj.nextInt();
		int fivethousand=rupees/5000; //five thousand
		int rupees1=rupees%5000;
		int thousand=rupees1/1000; //thousand
		int rupees2=rupees1%1000;
		int fivehundred=rupees2/500; //five hundred
		int rupees3=rupees2%500;
		int hundred=rupees3/100; //hundred
		int rupees4=rupees3%100;
		int fifty=rupees4/50; //fifty
		int rupees5=rupees4%50;
		int twenty=rupees5/20; //twenty
		int rupees6=rupees5%20;
		int ten=rupees6/10; //ten
		int rupees7=rupees%10;
		int five=rupees7/5; //five
		int rupees8=rupees7%5;
		int two=rupees8/2; //two
		int rupees9=rupees8%2; //one
		System.out.print("Five Thousands: "+fivethousand+"\nThousands: "+thousand+"\nFive Hundreds: "+fivehundred+"\nHundreds: "+hundred+"\nFifties: "+fifty+"\nTwenties: "+twenty+"\nTens: "+ten+"\nFives: "+five+"\nDuos: "+two+"Ones: "+rupees9); 
	}
}