import java.util.*;

class Addition
{
	public static void main(String[]args)
	{
		Timer timer=new Timer();
		Scanner obj=new Scanner (System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("a ="+a + "\nb ="+b );
		System.out.println("A+B = "+ (a+b));
		System.out.println("A+A = "+ (a+a));
		System.out.println("B+B = "+ (b+b));
	}
}