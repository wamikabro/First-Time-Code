import java.util.Scanner;
class TimeConversion{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Second: ");
		int sec=obj.nextInt();
		int minute=sec/60;
		int second=sec%60;
		System.out.print("Minutes: "+minute+"\nSeconds: "+second);
	}
}