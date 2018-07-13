import javax.swing.*;
class Ages3{
	public static void main(String[]args){
		String a1=JOptionPane.showInputDialog("Enter First Age: ");
		int age1=Integer.parseInt(a1);
		
		String a2=JOptionPane.showInputDialog("Enter Second Age: ");
		int age2=Integer.parseInt(a2);
		
		String a3=JOptionPane.showInputDialog("Enter Third Age: ");
		int age3=Integer.parseInt(a3);
		
		String a4=JOptionPane.showInputDialog("Enter Fourth Age: ");
		int age4=Integer.parseInt(a4);
		
		String a5=JOptionPane.showInputDialog("Enter Fifth Age: ");
		int age5=Integer.parseInt(a5);
		
		if(age1>age2 && age1>age3 && age1>age4 && age1>age5){
			JOptionPane.showMessageDialog(null, "First Age is Greatest");
		}
		if(age2>age1 && age2>age3 && age2>age4 && age2>age5){
			JOptionPane.showMessageDialog(null, "Second Age is Greatest");
		}
		if(age3>age1 && age3>age2 && age3>age4 && age3>age5){
			JOptionPane.showMessageDialog(null, "Third Age is Greatest");
		}
		if(age4>age1 && age4>age2 && age4>age3 && age4>age5){
			JOptionPane.showMessageDialog(null, "Fourth Age is Greatest");
		}
		if(age5>age1 && age5>age2 && age5>age3 && age5>age4){
			JOptionPane.showMessageDialog(null, "Fifth Age is Greatest");
		}
		
		
		
	}
}