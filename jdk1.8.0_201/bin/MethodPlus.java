import java.util.Scanner;
class MethodPlus{
	Scanner obj=new Scanner(System.in);
	public void first(){
		System.out.print("Enter Frist Value: ");
		int f=obj.nextInt();
	}
	public void second(){
		System.out.print("Enter Second Value: ");
		int s=obj.nextInt();
	}
	public void total(){
		System.out.print("Your Answer: "+(f+s));
	}
	public static void main(String[] args){
		MethodPlus ob=new MethodPlus();
		ob.first();
		ob.second();
		ob.total();
	}
	
	
	
}