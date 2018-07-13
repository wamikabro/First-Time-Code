import java.util.Scanner;
class CalcuReturn{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int f=obj.nextInt();
		int s=obj.nextInt();
		plus(f, s);
		
	}
	public static void plus(int first, int second){
		int total=first+second;
		System.out.print(total);
	}
}