import java.util.Scanner;
class WhileFor{
	public static void main(String...args){
		Scanner ob=new Scanner(System.in);
		int a,b;
		int c=1;
		int d=1;
		for(a=1; a<=10; a++){
			for(b=1; b<=a; b++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		while(c<=10){
			while(d<=c){
				c++;
				d++;
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
	}
}