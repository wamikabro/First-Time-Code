import java.util.Scanner;
class MarkShet
{
	public static void main(String[]arg)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("\n\t\tMarkSheet");
		System.out.print("\nEnglish : ");
		int eng=obj.nextInt();
		System.out.print("\nSindhi : ");
		int sin=obj.nextInt();
		System.out.print("\nIslamiyat : ");
		int isl=obj.nextInt();
		System.out.print("\nComputer : ");
		int comp=obj.nextInt();
		System.out.print("\nMaths : ");
		int maths=obj.nextInt();
		int all=(eng+sin+isl+comp+maths);
		if(eng<40 || sin<40 || isl<40 || comp<40 || maths<40)
		{
			System.out.println("FAIL");
		}
		if(eng>=40 || sin>=40 || isl>=40 || comp>=40 || maths>=40)
		{
			System.out.println("PASS");
			System.out.println("\n\n\n\nEnglish : "+eng+" Marks"+"\nPercentage "+(eng*100/100)+"%");
			System.out.println("Sindhi : "+sin+" Marks"+"\nPercentage "+(sin*100/100)+"%");
			System.out.println("Islamiyat : "+isl+" Marks"+"\nPercentage "+(isl*100/100)+"%");
			System.out.println("Computer : "+comp+" Marks"+"\nPercentage "+(comp*100/100)+"%");
			System.out.println("Maths : "+maths+" Marks"+"\nPercentage "+(maths*100/100)+"%");
		}
		
		
	
	
	}
}