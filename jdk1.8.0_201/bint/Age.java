import java.util.Scanner;
class Age
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter First Age > ");
		int f=obj.nextInt();
		System.out.print("Enter Second Age > ");
		int s=obj.nextInt();
		System.out.print("Enter Third Age > ");
		int t=obj.nextInt();
		
		if(f>s && f>t)
		{
			System.out.println("First age is Greatest");
		}
		if(f<s && f<t)
		{
			System.out.println("First is Youngest");
		}
		if (s>f && s>t)
		{
			System.out.println("Second is Greatest");
		}
		if (s<f && s<t)
		{
			System.out.println("Second is Youngest");
		}
		if (t>f && t>s)
		{
			System.out.println("Third is Greatest");
		}
		if (t<f && t<s)
		{
			System.out.println("Third is Youngest");
		}
		{	
		if (f==s && s==t)
			System.out.println("\nIn a Simple Way All are Same Agers");
		}

		if (f==s && f!=t)
		{
			System.out.println("\nFrist & Second are contemporary");
		}

		if (f==t && f!=s)
		{
			System.out.println("\nFrist & Third are contemporary");
		}

		if (s==t && t!=f)
		{
			System.out.println("\nSecond & Third are contemporary");
		}
		
		
	}
}