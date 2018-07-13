import java.util.Scanner;
class CalculatorMethod{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		Calculation ob=new Calculation();
		System.out.print("Enter First Value: ");
		int c=obj.nextInt();
		System.out.print("Enter Second Value: ");
		int d=obj.nextInt();
		System.out.println("1.Plus\n2.Minus\n3.Multiply\n4.Divide");
		int chose=obj.nextInt();
		if(chose==1){
			ob.plus(c, d);
		}
		else if(chose==2){
			ob.minus(c, d);
		}
		else if(chose==3){
			ob.multiply(c, d);
		}
		else if(chose==4){
			ob.divide(c, d);
		}
		else{
			System.out.println("This Option is not available");
		}
	}
}
class Calculation{
	int a, b;
	void plus(int first, int second){
		a=first;
		b=second;
		System.out.println("Your Answer: "+(a+b));
	}
	void minus(int first, int second){
		a=first;
		b=second;
		System.out.println("Your Answer: "+(a-b));
	}
	void multiply(int first, int second){
		a=first;
		b=second;
		System.out.println("Your Answer: "+(a*b));
	}
	void divide(int first, int second){
		a=first;
		b=second;
		System.out.println("Your Answer: "+(a/b));
	}
}