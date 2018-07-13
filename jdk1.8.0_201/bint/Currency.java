import java.util.Scanner;
class Currency
{
	public static void main(String[]arg)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("*****CurrencyTeller*****");
		
		System.out.println("\nEnter Your Rs Here > ");
		int rs=obj.nextInt();
		
		int fth=(rs/5000); //Five Thousands
		int rss=(rs%5000);
		System.out.println("\nFive Thousands = "+ fth);
		
		int th=(rss/1000);//Thousands
		int rsss=(rss%1000);
		System.out.println("Thousands = "+ th);
		
		int fh=(rsss/500);//Five Hundreds
		int rssss=(rsss%500);
		System.out.println("Five Hundreds = "+ fh);
		
		int h=(rssss/100);//Hundreds
		int rsssss=(rssss%100);
		System.out.println("Hundreds = "+ h);
		
		int f=(rsssss/50);//Fifties
		int rssssss=(rsssss%50);
		System.out.println("Fifties = "+ f);
		
		int t=(rssssss/20);//Twenties
		int rsssssss=(rssssss%20);
		System.out.println("Twenties = "+ t);
		
		int tn=(rsssssss/10);//Tens
		int rssssssss=(rsssssss%10);
		System.out.println("Tens = "+ tn);
		
		int fc=(rssssssss/5);
		int cc=(rssssssss%5);
		System.out.println("Coins Of Five = "+ fc);
		
		int tc=(cc/2);
		int tcc=(cc%2);
		System.out.println("Coins Of Two = "+ tc);
		
		int oc=(tcc/1);
		System.out.println("Coins Of One = "+ oc);
		System.out.println("\nThankYouForComing");
	}
}