class Animal{
	void sound(){
		System.out.println("Animal has a Sound");
	}
	
}
class Cat extends Animal{
	void sound(){
		System.out.println("Meao");
	}
	public static void main(String[] args){
		Animal obj=new Cat();
		obj.sound();
	}
}