import javax.swing.*;
class Ages2{
	public static void main(String[]args){
		String a1=JOptionPane.showInputDialog("Enter First Age: ");
		int age1=Integer.parseInt(a1);
		
		String a2=JOptionPane.showInputDialog("Enter Second Age: ");
		int age2=Integer.parseInt(a2);
		
		String a3=JOptionPane.showInputDialog("Enter Third Age: ");
		int age3=Integer.parseInt(a3);
		
		if(age1>age2 && age1>age3){
			JOptionPane.showMessageDialog(null, "First Age is Greatest");
		}
		if(age2>age1 && age2>age3){
			JOptionPane.showMessageDialog(null, "Second Age is Greatest");
		}
		if(age3>age1 && age3>age2){
			JOptionPane.showMessageDialog(null, "Third Age is Greatest");
		}
		
	}
}