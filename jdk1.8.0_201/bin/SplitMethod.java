class SplitMethod{
	public static void main(String[]args){
		String str="Hello World";
		String[] splitstr=str.split(" ");
		for(String a:splitstr){
			System.out.println(a);
		}
	}
}