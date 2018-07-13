import java.util.Scanner;
class TablesWhile
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='Y')
		{
			System.out.print("Enter Any Table > ");
			int b=obj.nextInt();
			
			for(int a=1; a<=10; a++)
			{
				System.out.println(b+"X"+a+" = "+a*b);
			}
			System.out.println("Want To Try Again? Yes?");
			ch=obj.next().charAt(0);
		}	
	}
}