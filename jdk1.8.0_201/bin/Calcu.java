import javax.swing.*;
class Calcu{
	public static void main(String[]args){
		String ca=JOptionPane.showInputDialog("***** Calculator *****\n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Reminder");
		int calculator=Integer.parseInt(ca);
		if(calculator==1)
		{
			String ad=JOptionPane.showInputDialog("***** Addition *****\nFirst Value: ");
			int add1=Integer.parseInt(ad);
			String add=JOptionPane.showInputDialog("***** Addition *****\nSecond Value: ");
			int	add2=Integer.parseInt(add);
			JOptionPane.showMessageDialog(null, "***** Addition *****\n"+add1+"+"+add2+"="+(add1+add2));
		}
		else if(calculator==2)
		{
			String ad=JOptionPane.showInputDialog("***** Subtraction *****\nFirst Value: ");
			int add1=Integer.parseInt(ad);
			String add=JOptionPane.showInputDialog("***** Subtraction *****\nSecond Value: ");
			int	add2=Integer.parseInt(add);
			JOptionPane.showMessageDialog(null, "***** Subtraction *****\n"+add1+"-"+add2+"="+(add1-add2));			
		}
		else if(calculator==3)
		{
			String ad=JOptionPane.showInputDialog("***** Multiplication *****\nFirst Value: ");
			int add1=Integer.parseInt(ad);
			String add=JOptionPane.showInputDialog("***** Multiplication *****\nSecond Value: ");
			int	add2=Integer.parseInt(add);
			JOptionPane.showMessageDialog(null, "***** Multiplication *****\n"+add1+"*"+add2+"="+(add1*add2));			
		}
		else if(calculator==4)
		{
			String ad=JOptionPane.showInputDialog("***** Division *****\nFirst Value: ");
			int add1=Integer.parseInt(ad);
			String add=JOptionPane.showInputDialog("***** Division *****\nSecond Value: ");
			int	add2=Integer.parseInt(add);
			JOptionPane.showMessageDialog(null, "***** Division *****\n"+add1+"/"+add2+"="+(add1/add2));			
		}
		else if(calculator==5)
		{
			String ad=JOptionPane.showInputDialog("***** Reminder *****\nFirst Value: ");
			int add1=Integer.parseInt(ad);
			String add=JOptionPane.showInputDialog("***** Reminder *****\nSecond Value: ");
			int	add2=Integer.parseInt(add);
			JOptionPane.showMessageDialog(null, "***** Reminder *****\n"+add1+"%"+add2+"="+(add1%add2));			
		}
		else
		{
			JOptionPane.showMessageDialog(null,"The option you choosed isn't in the list.");
		}
		
	}
}