class Head{
	public static void main(String[] args){
		Three ob=new Three();
		ob.oneone();
		ob.twotwo();
		ob.threethree();
		
	}
}
class One{
	void oneone(){
		System.out.println("Parent Class");
	}
}
class Two extends One{
	void twotwo(){
		System.out.println("Child Class");
	}
}
class Three extends Two{
	void threethree(){
		System.out.println("GrandChild Class");	
	}
}