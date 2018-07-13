import java.util.Scanner;
class Academy
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("*****Welcome To Academy*****");
		int aa='y';
		while(aa=='y'||aa=='Y')
		{
			System.out.println("\n1: Conversion\n2: Calculator\n3: Designs\n4: Tables");
			int a=obj.nextInt();
			if(a==1)
			{
				System.out.println("***Welcome To Conversion***");
						System.out.println("1: Time Conversion\n2: Currency Conversion");
				int b=obj.nextInt();
				if(b==1)
				{
					Scanner obj=new Scanner (System.in);
					System.out.println("Days To Hours Conversion\n");
					System.out.print("Tell Your Days  >");
					int D=obj.nextInt();
					System.out.println("Your Answer Below");
					System.out.println((D*24)+ " Hours");
					
					
					
				}
				if(b==2)
				{
					System.out.println("\n*****Currency Changer*****"); //Title
					System.out.println("\nHere We Are Giving Facility To Convert PAKISTANI Rupees Into Ten More Currencies,\nYou Can Even Change Those Currencies Into PAKISTANI Rupees."); //Little Definition
					System.out.println("\nSelect any number \n1 Pakistani Rupees into 10 more currencies.\n2 Other currency into Pakistani Rupees.");
					System.out.print("\nEnter Choice Here > ");
					float a=obj.nextFloat();
					if(a==1)
					{
						System.out.print("\nSelect any number for PKR conversion > ");
						float PKR=obj.nextFloat();
						System.out.println("\n1 PKR into Dollar($)");
						System.out.println("\n2 PKR into United Arab Emirates Dirham");
						System.out.println("\n3 PKR into Bangladeshi Taka");
						System.out.println("\n4 PKR into Indian Rupee");
						System.out.println("\n5 PKR into Maldivian Rufiyaa");
						System.out.println("\n6 PKR into Indonesian Rupiah");
						System.out.println("\n7 PKR into Malaysian Ringgit");
						System.out.println("\n8 PKR into Afghanistan Afghani");
						System.out.println("\n9 PKR into Turkish Lira");
						System.out.println("\n10 PKR into Korean Won");
			
						float b=obj.nextFloat();
						if(b==1)
						{
							System.out.println("\n"+PKR+"Rs = $"+(PKR/123.29));
						}
						
						if(b==2)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR/33.56)+" Saudi Dirham");
						}
						
						if(b==3)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR/1.45)+" Taka");
						}
						
						if(b==4)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR/1.80)+" Indian Rupee");
						}
						
						if(b==5)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR/8.01)+" Rufiyaa");
						}
						
						if(b==6)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR*0.0085)+" Rupiah");
						}

						if(b==7)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR/30.21)+" Ringgit");
						}

						if(b==8)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR/1.71)+" Afghani");
						}

						if(b==9)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR/24.24)+" Lira");
						}

						if(b==10)
						{
							System.out.println("\n"+PKR+"Rs = "+(PKR*0.11)+" Won");
						}
					}
				
					if(a==2)
					{
						System.out.println("\n1 US-Dollar into PKR");
						System.out.println("\n2 UAE-Dirham into PKR");
						System.out.println("\n3 Bangol-Taka into PKR");
						System.out.println("\n4 Indian-Rupee into PKR");
						System.out.println("\n5 Maldivian-Rufiyaa into PKR");
						System.out.println("\n6 Indonesian-Rupiah into PKR");
						System.out.println("\n7 Malaysian-Ringgit into PKR");
						System.out.println("\n8 Afghan-Afghani into PKR");
						System.out.println("\n9 Turkish-Lira into PKR");
						System.out.println("\n10 Korean-Won into PKR");
			
						float c=obj.nextFloat();
						if(c==1)
						{
							System.out.print("Enter US Dollars Here > ");
							float d=obj.nextFloat();
							System.out.println(d+" = "+(d*123.29)+" Rs");
						}
					
						if(c==2)
						{
							System.out.print("Enter UAE Dirham Here > ");
							float e=obj.nextFloat();
							System.out.println(e+" = "+(e*33.56)+" Rs");				
						}			
					
						if(c==3)
						{
							System.out.print("Enter Bangol Taka Here > ");
							float f=obj.nextFloat();
							System.out.println(f+" = "+(f*1.45)+" Rs");				
						}
					
						if(c==4)
						{
							System.out.print("Enter Indian Rupees Here > ");
							float g=obj.nextFloat();
							System.out.println(g+" = "+(g*1.80)+" Rs");				
						}
					
						if(c==5)
						{
							System.out.print("Enter Maldives Rufiyaa Here > ");
							float h=obj.nextFloat();
							System.out.println(h+" = "+(h*8.01)+" Rs");				
						}
					
						if(c==6)
						{
							System.out.print("Enter Indonesian Rupiah Here > ");
							float i=obj.nextFloat();
							System.out.println(i+" = "+(i/0.0085)+" Rs");				
						}
					
						if(c==7)
						{
							System.out.print("Enter Malaysian Ringgit Here > ");
							float j=obj.nextFloat();
							System.out.println(j+" = "+(j*30.21)+" Rs");				
						}
					
						if(c==8)
						{
							System.out.print("Enter Afghani Here > ");
							float k=obj.nextFloat();
							System.out.println(k+" = "+(k*1.71)+" Rs");				
						}
						
						if(c==9)
						{
							System.out.print("Enter Turkish Lira Here > ");
							float l=obj.nextFloat();
							System.out.println(l+" = "+(l*24.24)+" Rs");				
						}
					
						if(c==10)
						{
							System.out.print("Enter Korean Won Here > ");
							float m=obj.nextFloat();
							System.out.println(m+" = "+(m/0.11)+" Rs");				
						}			
					}
				}
			
				if(b==3)
				{
					System.out.println("***Welcome To Calculator***");
					System.out.println("1: Division\n2: Multiplication\n3: Addition\n4: Subtraction");
					int c=obj.nextInt();
				
					if(c==1)
					{
				
					}
				
					if(c==2)
					{
				
				
					}
					if(c==3)
					{
				
				
				
					}
					if(c==4)
					{
					
				
				
					}
			
				}
			
				if(b==4)
				{
				
					System.out.println("***Welcome To Designs***");
					System.out.println("1: Triangle\n2: Square");
					int d=obj.nextInt();
					if(d==1)
					{
				
				
					}
					if(d==2)
					{
				
				
					}
		
				}
			
				if(b==5)
				{
			
					System.out.println("***Welcome To Tables***");
					System.out.println("1: Normal\n2: Reverce");
					int e=obj.nextInt();
					if(e==1)
					{
				
				
					}
					if(e==2)
					{
				
				
					}
			
				}	
			
				aa=obj.next().charAt(0);
			}
		}
	}
}