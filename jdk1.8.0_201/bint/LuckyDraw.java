import java.util.Scanner;
class LuckyDraw{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.println("So the LuckyDraw works like \nyou have to chose any number and we will \ncheck your luck. \n \t \t \t \tYou can chose any number from 0 to 9");
		int a=obj.nextInt();
		if(a==0)
		{
			System.out.println("On chosing 0 we want to tell you, your life is also chosing 0");
		}
		if(a==1)
		{
			System.out.println("You are the best, your future is shining, I can see.");
		}
		if(a==2)
		{
			System.out.println("You will always meet disloyals.");
		}
		if(a==3)
		{
			System.out.println("You are in love with someone, but always hiding");
		}
		if(a==4)
		{
			System.out.println("You think world is good? Grow up, stop believing blindly");
		}
		if(a==5)
		{
			System.out.println("You have got best luck ever, get todays tea from Wamik");
		}
		if(a==6)
		{
			System.out.println("Dont forget to pay 50Rs to Wamik");
		}
		if(a==7)
		{
			System.out.println("Keep Smiling and drink glass of water");
		}if(a==8)
		{
			System.out.println("Sorry You are looking ugly tonight");
		}
		if(a==9)
		{
			System.out.println("Slap yourself one time.");
		}
		
		
		
	}
}
