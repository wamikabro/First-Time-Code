import java.util.Scanner;
class PlusMethod{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int f=obj.nextInt();
		int s=obj.nextInt();
		int t=obj.nextInt();
		plus(f, s, t);
		
	}
	public static void plus(int first, int second, int third){
		int total=first+second+third;
		System.out.print(total);
	}
}