class HalfMethod{
	HalfMethod(){
		int	a=1;
		int b=2;
		int c=a+b;
	}
	public static void main(String[] args){
		HalfMethod mangwa=new HalfMethod();
		mangwa.a();
		mangwa.b();
		mangwa.c();
		System.out.println("Answer "+c);
	}	
	

}