import java.util.Scanner;
class Weather{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Month number: ");
		int monthnumber=obj.nextInt();
		
		if(monthnumber==1 || monthnumber==11 || monthnumber==12){
			System.out.print("Season is Autumn");
		}
		else if(monthnumber==2 || monthnumber==3 || monthnumber==4){
			System.out.print("Season is Winter");
		}
		else if(monthnumber==5 || monthnumber==6 || monthnumber==7){
			System.out.print("Season is Spring");
		}
		else if(monthnumber==8 || monthnumber==9 || monthnumber==10){
			System.out.print("Season is Summer");
		}
		else{
			System.out.print("There is no "+monthnumber+" month");
		}
	}
}