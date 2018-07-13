import java.util.*;
import java.io.*;
class Prog
{
	public static void main(String[]arg) throws Exception
	{
		Scanner obj=new Scanner (System.in);
		DataInputStream ob=new DataInputStream (System.in);
		System.out.print("\n"+" chose one of them\n1. Calculator\n2. Exit\n> ");
		int a=obj.nextInt();
		do
		{
			switch(a)
			{
				case 1:
				char z='Y';
				while(z=='y' || z=='Y')
				{	
					System.out.println(" Welcome To Calculator ");
					System.out.println("1. Division\n2. Multiplication\n3. Addition\n4. Subtraction\n5. Reminder\n6. Percentage\n7. SquareRoot\n8. CubeRoot\n9. Other Powers");
					String c=ob.readLine();
					switch(c)
					{
						case "a":
							System.out.println("*****Division*****");
							System.out.print("First Value : ");
							float d=obj.nextFloat();
							System.out.print("Second Value : ");
							float e=obj.nextFloat();
							System.out.print("Answer : "+(d/e));
						break;
						
						case "b":
							System.out.println("*****Multiplication*****");
							System.out.print("First Value : ");
							float f=obj.nextFloat();
							System.out.print("Second Value : ");
							float g=obj.nextFloat();
							System.out.print("Answer : "+(f*g));
						
						break;
						/*
						case 3:
							System.out.println("*****Addition*****");
							System.out.print("First Value : ");
							float h=obj.nextFloat();
							System.out.print("Second Value : ");
							float i=obj.nextFloat();
							System.out.print("Answer : "+(h+i));
						break;
						
						case 4:
							System.out.println("*****Subtraction*****");
							System.out.print("First Value : ");
							float j=obj.nextFloat();
							System.out.print("Second Value : ");
							float k=obj.nextFloat();
							System.out.print("Answer : "+(j-k));
						break;
						
						case 5:
							System.out.println("*****Reminder*****");
							System.out.print("First Value : ");
							float l=obj.nextFloat();
							System.out.print("Second Value : ");
							float m=obj.nextFloat();
							System.out.print("Answer : "+(l%m));
						break;
						
						case 6:
							System.out.println("*****Percentage*****");
							System.out.print("Whole Value Value : ");
							float n=obj.nextFloat();
							System.out.print("Gotten Value : ");
							float o=obj.nextFloat();
							System.out.print("Answer : "+(o*100/n));
						break;
						
						case 7:
							System.out.println("*****SquareRoot*****");
							System.out.print("SquareRoot of : ");
							float p=obj.nextFloat();
							System.out.print("Answer : "+(p*p));
						break;
						
						case 8:
							System.out.println("*****CubeRoot*****");
							System.out.print("CubeRoot of : ");
							float q=obj.nextFloat();
							System.out.print("Answer : "+(q*q*q));
						break;
						
						case 9:
							System.out.println("*****Powers*****");
							System.out.print("Value : ");
							float r=obj.nextFloat();
							System.out.print("Power : ");
							float s=obj.nextFloat();
							//System.out.print("Answer : "+());
						break;
						*/ 
					}
				z=obj.next().charAt(0);
				}	
				break;
				
				case 2:
					System.out.println("Good-Bye");
				break;
			}
		}
		while(a!=3);
	}
}