import java.util.Scanner;
class Methods{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		print("Tell Times: ");
		int value=obj.nextInt();
		int b;
		for(b=1; b<=value; b++){
			a();
		}
	}
	public static void print(String statement){
		System.out.print(statement);
	}	
	
	public static void a(){
		System.out.println("Hey Wamik");
	}
}