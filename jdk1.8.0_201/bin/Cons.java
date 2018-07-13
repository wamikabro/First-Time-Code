import java.util.Scanner;
class Cons{
	static Scanner obj=new Scanner(System.in);
	int a;
	Cons(){
		a=obj.nextInt();
		System.out.print("You Gave Value: "+a+"\n");
	}
	public static void main(String[] args){
		System.out.print("How Many Times We Should Run This? :");
		int b;
		int run=obj.nextInt();
		for(b=1; b<=run; b++){
			Cons ob=new Cons();
		}
		
	}
}