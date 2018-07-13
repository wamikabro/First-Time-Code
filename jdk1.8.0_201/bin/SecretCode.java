import java.util.Scanner;
class SecretCode{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Your Secret Code: ");
		String secret=obj.next();
		if(secret.equals("X2125") | secret.equals("QKLMN") | secret.equals("OPST2") | secret.equals("MNQR")){
			System.out.print("Welcome Sir");
		}
		}
		else if(secret!="QKLMN"|secret!="OPST2"|secret!="MNQR"){
			System.out.print("You are Outsider!");
		}
	}
}