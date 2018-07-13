import java.util.Scanner;
class ABC{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Alphabet: ");
		char alphabet=obj.next().charAt(0);
		if(alphabet=='a' || alphabet=='A'){
			System.out.print("A for Apple");
		}
		else if(alphabet=='b' || alphabet=='B'){
			System.out.print("B for Ball");
		} 
		else if(alphabet=='c' || alphabet=='C'){
			System.out.print("A for Apple");
		} 
		else if(alphabet=='d' || alphabet=='D'){
			System.out.print("D for Dog");
		} 
		else if(alphabet=='f' || alphabet=='F'){
			System.out.print("F for Fish");
		} 
		else if(alphabet=='g' || alphabet=='G'){
			System.out.print("G for Girl");
		}
		else if(alphabet=='h' || alphabet=='H'){
			System.out.print("H for House");
		}
		else if(alphabet=='i' || alphabet=='I'){
			System.out.print("I for Ice-Cream");
		}
		else if(alphabet=='j' || alphabet=='J'){
			System.out.print("J for Jug");
		}
		else if(alphabet=='k' || alphabet=='K'){
			System.out.print("K for Kite");
		}
		else if(alphabet=='l' || alphabet=='L'){
			System.out.print("L for Lanp");
		}
		else if(alphabet=='m' || alphabet=='M'){
			System.out.print("M for Mango");
		}
		else if(alphabet=='N' || alphabet=='n'){
			System.out.print("N for Newton");
		}
		else if(alphabet=='O' || alphabet=='o'){
			System.out.print("O for Operating System");
		}
		else if(alphabet=='P' || alphabet=='p'){
			System.out.print("P for Papa");
		}
		if(alphabet=='Q' || alphabet=='q'){
			System.out.print("Q for Queen");
		}
		if(alphabet=='S' || alphabet=='s'){
			System.out.print("S for Sun");
		}
		if(alphabet=='t' || alphabet=='T'){
			System.out.print("T for T");
		}
		if(alphabet=='u' || alphabet=='U'){
			System.out.print("U for Umbrella");
		}
		if(alphabet=='v' || alphabet=='V'){
			System.out.print("V for Ven");
		}
		if(alphabet=='w' || alphabet=='W'){
			System.out.print("W for Window");
		}
		if(alphabet=='x' || alphabet=='X'){
			System.out.print("X for X-ray");
		}
		if(alphabet=='y' || alphabet=='Y'){
			System.out.print("Y for Yellow");
		}
		if(alphabet=='z' || alphabet=='Z'){
			System.out.print("Z for Zebra");
		}
		if(alphabet<'A' || alphabet>'Z' && alphabet<'a' || alphabet>'z'){
			System.out.print("Invalid Input");
		}
	}	
}