class Constructor{
	String name;
	int value;
	Constructor(){
	this.name="Hi";
	this.value=1;
	}
	public static void main(String[] args){
		Constructor call=new Constructor();
		System.out.print(call.name+" "+call.value);
	}
}