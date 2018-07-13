import java.util.Scanner;
import java.util.HashMap;
class Hashmap{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		HashMap<String, String> hash=new HashMap<String, String>();
		hash.put("A","Apple\nAstronomy\nAbbrivation\nAnotation\nAbuse");
		hash.put("a","Apple\nAstronomy\nAbbrivation\nAnotation\nAbuse");
		hash.put("B","Ball\nBoul\nBanana\nBad\nBed");
		hash.put("b","Ball\nBoul\nBanana\nBad\nBed");
		hash.put("C","Cat\nCar\nCard\nCanon\nCottage");
		hash.put("c","Cat\nCar\nCard\nCanon\nCottage");
		hash.put("D","Dog\nDumb\nDoctor\nDeaf\nDoll");
		System.out.print("Enter Alphabet: ");
		String a=obj.next();
		System.out.print(hash.get(a));
	}
}
