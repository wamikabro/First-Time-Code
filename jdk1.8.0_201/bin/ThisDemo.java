class ThisDemo{
	int a;
	int b;
	public void set(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void show(){
		System.out.println("Value of A = "+a);
		System.out.println("Value of B = "+b);
	}
	public static void main(String[] ar){
		ThisDemo obj=new ThisDemo();
		obj.set(11, 20);
		obj.show();
	}
}