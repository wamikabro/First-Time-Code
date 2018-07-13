import java.util.Scanner;
class Science
{
	public static void main(String[]arg)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Branches of Science");
		System.out.println("Press 1 for Physical Science\nPress 2 for Biological Science");
		int b=obj.nextInt();
		
		if(b==1)
		{
			System.out.println("Press any number for respecive ..");
			System.out.println("1 for Physics");
			System.out.println("2 for Chemistry");
			System.out.println("3 for Maths");
			int bb=obj.nextInt();
			if(bb==1)
			{
				System.out.println("Physics is the branch of science that deals with\nthat deals with the nature and properties of Matter");
			}
			if(bb==2)
			{
				System.out.println("Chemistry is the branch of science that deals with\nproperties, composition and structure of matter");
			}
			if(bb==3)
			{
				System.out.println("Maths is the branch of science that deals with\ncalculations");
			}
		}
		if(b==2)
		{
			System.out.println("Press 1 for Biology");
			System.out.println("Press 2 for Zoology");
			int bb=obj.nextInt();
			if(bb==1)
			{
				System.out.println("Biology is the branch of science that deals with the study of living thing");
			}
			if(bb==2)
			{
				System.out.println("Zoology is the branch of science that deals with the study of living metwabolism of animals");
			}
		}
		
	}
}