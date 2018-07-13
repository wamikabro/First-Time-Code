import java.util.Scanner;
class ElectricUnitScanner{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Units: ");
		int unit=obj.nextInt();
		
		if(unit<=100 && unit>=1){
			
			int first=unit*2;
			System.out.print("Rupees: "+first);
		}
		if(unit>100 && unit<=200){
			
			int first=100*2;
			int second=(unit-100)*4;
			int overall=first+second;
			System.out.print("Rupees: "+overall);
		}
		if(unit>200 && unit<=300){
			
			int first=100*2;
			int second=100*4;
			int third=(unit-200)*6;
			int overall=first+second+third;
			System.out.print("Rupees: "+overall);
		}
		if(unit>300 && unit<=400){
			
			int first=100*2;
			int second=100*4;
			int third=100*6;
			int fourth=(unit-300)*8;
			int overall=first+second+third+fourth;
			System.out.print("Rupees: "+overall);
		}
		if(unit>400){
			
			int first=100*2;
			int second=100*4;
			int third=100*6;
			int fourth=100*8;
			int fifth=(unit-400)*10;
			int overall=first+second+third+fourth+fifth;
			System.out.print("Rupees: "+overall);
		}
	}
}