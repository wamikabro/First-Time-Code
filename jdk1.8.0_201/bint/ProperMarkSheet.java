import java.util.Scanner;
class ProperMarkSheet
{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("\n*****MarkSheet*****");
		System.out.print("\nWhat are Total Marks of English Language? > ");
		int et=ob.nextInt();
		System.out.print("What are Total Marks of Urdu Subject? > ");
		int ut=ob.nextInt();
		System.out.print("What are Total Marks of Islamiyat Subject? > ");
		int it=ob.nextInt();
		System.out.print("What are Total Marks of Physics Subject? > ");
		int pt=ob.nextInt();
		System.out.print("What are Total Marks of Maths Subject? > ");
		int mt=ob.nextInt();
		
		System.out.println("\nThankYou Now Tell Your Gained Marks Below");
		
		System.out.print("\nWhat are Gained Marks of English Language? > ");
		int e=ob.nextInt();
		System.out.print("What are Gained Marks of Urdu Subject? > ");
		int u=ob.nextInt();
		System.out.print("What are Gained Marks of Islamiyat Subject? > ");
		int i=ob.nextInt();
		System.out.print("What are Gained Marks of Physics Subject? > ");
		int p=ob.nextInt();
		System.out.print("What are Gained Marks of Maths Subject? > ");
		int m=ob.nextInt();
		
		int tm=(et+ut+it+pt+mt);
		int gm=(e+u+i+p+m);
		
		
		
		int pr=((gm*100)/tm);
		System.out.println("Total Percentage = "+pr+" %");
		
		if(pr>=30 && pr<=40);
		{
			System.out.println("Grade - E");
		}
		if(pr>40 && pr<80);
		{
			System.out.println("Grade - A");
		}
	}
}