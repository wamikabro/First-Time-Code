class Stars{
	public static void main(String[]args){
		int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z; //declaring all variables
		for(a=1; a<=10; a++) //first line loop
		{
			for(b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			for(c=9; c>=a; c--)
			{
				System.out.print(" ");
			}
			for(d=9; d>=a; d--)
			{
				System.out.print(" ");
			}
			for(e=1; e<=a; e++)
			{
				System.out.print("*");
			}
			for(f=9; f>=a; f--)
			{
				System.out.print("*");
			}
			for(g=2; g<=a; g++)
			{
				System.out.print(" ");
			}
			for(h=2; h<=a; h++)
			{
				System.out.print(" ");
			}
			for(i=10; i>=a; i--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		} //first line loop end
		
		for(j=1; j<=10; j++) //second loop
		{
			for(k=1; k<=19; k++)
			{
				System.out.print("*");
			}
			for(l=1; l<=j; l++)
			{
				System.out.print("*");
			}
			for(m=9; m>=j; m--)
			{
				System.out.print(" ");
			}
			for(n=9; n>=j; n--)
			{
				System.out.print(" ");
			}
			for(o=1; o<=j; o++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
			
		} //second loop end
		
	} //method end
	
} //class end
