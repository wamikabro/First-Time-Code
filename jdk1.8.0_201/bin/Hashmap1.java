import java.util.Scanner;
import java.util.HashMap;
class Hashmap1{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		HashMap<String, String> hash=new HashMap<String, String>();
		hash.put("1","Hammad\nSaad\nAzhar");
		hash.put("2","Hunain\nKashif\nZameer");
		hash.put("3","Zohaib\nSaad\nUmer");
		hash.put("4","Zain\nUsman\nAbeer");
		hash.put("5","Ali\nAbuBakar\nSaud");
		
		System.out.print("Enter Marks: ");
		String a=obj.next();
		System.out.print(hash.get(a));
	}
}
