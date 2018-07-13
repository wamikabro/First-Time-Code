import java.io.*;
import java.util.*;
class Definitions
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner (System.in);
		char a='Y';
		while(a=='Y' || a=='y')
		{
			System.out.println("\t\tBranches of Science");
			System.out.println("\n1. Ecology \n2. Ocianography\n3. Geology\n4. Meterology \n5. Zoology\n6. Human Biology\n7. Botany");
			int b=obj.nextInt();
			switch(b)
			{
				
				case 1:
				System.out.println("*****Ecology*****");
				System.out.println("Ecology is the branch of Biology science that deals with the relations of organisms to one another and to their physical surroundings. ");
				break;
				case 2:
				System.out.println("*****Ocianography*****");
				System.out.println("Ocianography is the branch of Science that deals with the physical and biological properties and phenomena of the sea.");
				break;
				case 3:
				System.out.println("*****Geology*****");
				System.out.println("The science which deals with the physical structure and substance of the earth, their history, and the processes which act on them.");
				break;
				case 4:
				System.out.println("*****Meterology*****");
				System.out.println("Meterology is the branch of science concerned with the processes and phenomena of the atmosphere, especially2 as a means of forecasting the weather,");
				break;
				case 5:
				System.out.println("*****Zoology*****");
				System.out.println("Zoology is the study of the behaviourm stucture, physiology, classification, and distribution of animals in a scintific way.");
				break;
				case 6:
				System.out.println("*****Human-Biology*****");
				System.out.println("This is the branch of science where we study about the physiology, behaviour, and other qualities of a human.");
				break;
				case 7:
				System.out.println("*****Botany*****");
				System.out.println("The scientific study of the physiology, structure, genetics, ecology, distribution, classification, and economic importance of plants.");
				break;
			}
			a=obj.next().charAt(0);
		}
		
	}
}