import java.util.Scanner;
class ForRowColumn{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		int a,b,aa,bb;
		System.out.print("Enter Rows: ");
		aa=obj.nextInt();
		System.out.print("Enter Column: ");
		bb=obj.nextInt();
		for(a=1; a<=bb; a++){
			for(b=1; b<=aa; b++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
}