class Al{
	public static void main(String[]args){
		int[] array={1,3,4,5,2,6,8,7};
		int temp;
		boolean sorted=false;
		while(!sorted){
			sorted=true;
			for(int i=0; i<array.length-1; i++){
				if(array[i]>array[i+1]){
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					sorted=false;
				}
			}
		}
		for(int k:array){
			System.out.print(k);
		}
	}
}