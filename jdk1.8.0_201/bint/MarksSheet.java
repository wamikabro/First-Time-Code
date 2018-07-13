import java.util.Scanner;
class MarksSheet
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("\n*****MarkSheet*****");
		int total=500;
		int subtotal=100;
		System.out.println("\nEnglish : ");
		int eng=obj.nextInt();
		System.out.println("Sindhi : ");
		int sin=obj.nextInt();
		System.out.println("Islamiyat : ");
		int isl=obj.nextInt();
		System.out.println("Urdu : ");
		int urdu=obj.nextInt();
		System.out.println("Maths : ");
		int maths=obj.nextInt();
		}
	}
}