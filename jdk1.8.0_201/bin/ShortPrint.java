import java.util.Scanner;
class ShortPrint{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		p("Enter First Value: ");
		int f=obj.nextInt();
		p("Enter Second Value");
		int s=obj.nextInt();
		int t=f+s;
		p("Your Answer: "+t);
	}
	static void p(String Statement){
		System.out.print(Statement);
	}
	static void pl(String Statement){
		System.out.println(Statement);
	}
	
}