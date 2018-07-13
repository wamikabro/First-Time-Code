import java.util.HashMap;
import java.util.Scanner;
class Hash{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		HashMap<String, String> hash=new HashMap<String, String>();
		hash.put("Hello", "Hi");
		System.out.print("Say Hello: ");
		String a=obj.next();
		System.out.print(hash.get(a));
	}
}