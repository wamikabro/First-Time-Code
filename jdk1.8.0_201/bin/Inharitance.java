class Inharitance{
	public static void main(String[] args){
		Eagle obj=new Eagle();
		obj.similarity();
		obj.urdueagle();
		
		
	}
}
class Birds{
	public static void similarity(){
		System.out.print("Like All Birds This Bird Has Also Two Wings.");
	}
}
class Eagle extends Birds{
	public static void urdueagle(){
		
		System.out.print(" Eagle is called Shaheen in Urdu language");
	}
}