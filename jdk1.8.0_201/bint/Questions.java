import java.util.Scanner;
import java.io.*;
class Questions
{
	public static void main(String [] args) throws Exception
	{
		Scanner obj=new Scanner (System.in);
		DataInputStream ob=new DataInputStream(System.in);
		System.out.println("1. Start\n0. Exit");
		int w=obj.nextInt();
		do
		{
			
			switch(w)
			{
			

				case 1 :
				char a='Y';
				while(a=='y' || a=='Y')
				{
				
					System.out.print("Enter Your Name Here : ");
					String name=ob.readLine();
					System.out.print("\nRound 1:\n\nWhats after alphabet 'A'? : ");
					String b=ob.readLine();
				
					switch(b)
					{
						case "B" :
						System.out.println("Aww Good Job "+name+"\n" );
						break;
						case "b" :
						System.out.println("Aww Good Job "+name+"\n");
						break;
						default :
						System.out.println("O no "+name+" its actually B, You Lost on 1st Round.");
						System.out.println("Wanna Know The Reason? : ");
						String reason=ob.readLine();
							switch(reason)
							{
								case "Yes" :
								System.out.println("According to the sequence of English alphabets its B after A");
								break;
							
								case "yes" :
								System.out.println("According to the sequence of English alphabets its B after A");
								break;
							
								case "y" :
								System.out.println("According to the sequence of English alphabets its B after A");
								break;
							
								case "Y" :
								System.out.println("According to the sequence of English alphabets its B after A");
								break;
								
								case "Yea" :
								System.out.println("According to the sequence of English alphabets its B after A");
								break;
								
								case "Yeah" :
								System.out.println("According to the sequence of English alphabets its B after A");
								break;
							
								case "yeah" :
								System.out.println("According to the sequence of English alphabets its B after A");
								break;
							
								default :
								System.out.println("Okay GoAhead");
								break;
							}	
							
						break;
					}	
					System.out.println("Whats after number '27' in backword? : \n");
					String c=ob.readLine();
				
					switch(c)
					{
						case "26" :
						System.out.println("Aww Good Job "+name );
						break;
						default :
						System.out.println("O no "+name+" its actually 26.\n Wanna Know The Reason? : ");
						break;
					}	
					
					System.out.println("Wanna Try Again? 1. Yes or 2. No");
				
					a=obj.next().charAt(0);	
				}	
				break;
			
				case 0 :
				System.out.println("As Your Wish -__-");
				break;
			}	
		}
		while(w!=0);
	}
}