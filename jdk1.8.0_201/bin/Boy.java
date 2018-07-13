class Human{
	static void walk(){
		System.out.println("Human Walks");
	}
}
public class Boy extends Human{
	static void walk(){
		System.out.println("Boy Walks");
	}
	static void call(){
		walk();
	}
	public static void main(String[] args){
		call();
	}
}	