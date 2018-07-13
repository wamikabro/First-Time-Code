import javax.swing.JOptionPane;
class TrollyLoadx
{
	public static void main(String[]arg)
	{
		int z=1;
		do
		{
		int a=Integer.parseInt(JOptionPane.showInputDialog("*****TrollyLoad*****\n\nEnter Value of Trollies : "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Enter Per Trolly Rent : "));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Enter Per Trolly Diesel Bill : "));
		int d=Integer.parseInt(JOptionPane.showInputDialog("Enter Trolly Driver Pay : "));
		int e=Integer.parseInt(JOptionPane.showInputDialog("Enter Tax Per Trolly : "));
		int g=(b*a);
		int f=(c+d+e)*a;
		JOptionPane.showMessageDialog(null, "Trollies : "+(a)+"\nTrolly Rent : "+(b)+"\nDiesel Bill = "+(c)+"\nDriver Pay = "+(d)+"\nTaxation = "+(e)+"\nTotal = "+ g+"\nExpenditure : "+ f);
		
		if((g-f)>=0)
		{
			JOptionPane.showMessageDialog(null, "Profit is "+(g-f));

		}
		if((g-f)<0)
		{
			JOptionPane.showMessageDialog(null, "Loss is "+(g-f));

		}
		}while(z!=0);
		
	}
}