import java.util.Scanner;
class ShortPlus{
	
	int a,b;
	
	void plus(int a, int b){
		this.a=a;
		this.b=b;
		System.out.print("Answer: "+(a+b));
	}
	public static void main(String[] args){
		ShortPlus obj=new ShortPlus();
		Scanner ob=new Scanner(System.in);
		int c=ob.nextInt();
		int d=ob.nextInt();
		obj.plus(c, d);
	}
	
}