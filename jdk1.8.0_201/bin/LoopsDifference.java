import java.util.Scanner;
class LoopsDifference{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Ending Number: ");
		short a=obj.nextShort();
		System.out.print("1: For\n2: While\n3: Do While\n\n");
		short c=obj.nextShort();
		short b=1;
		System.out.println("\n");
		
		if(c==1){
			System.out.println("This is For Loop\n");
			for(b=1; b<=a; b++){
				System.out.println(b);
			}
		}	
		if(c==2){
			System.out.println("This is While Loop\n");
			
			while(b<=a){
				System.out.println(b++);
			}
		}	
		if(c==3){
			System.out.println("This is Do While Loop\n");
			do{
				System.out.println(b++);
			}
			while(b<=a);
		}
		
	
		
	}
}