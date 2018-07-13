import javax.swing.*;
class DifferenceInEquals{
	public static void main(String[]args){
		JOptionPane.showMessageDialog(null, "Here is the example of difference between a==b and a=b");
		String a=JOptionPane.showInputDialog("Enter a");
		int a1=Integer.parseInt(a);
		JOptionPane.showMessageDialog(null, "Now "+a1+" is actually = to a\nWhen you want to use this a, which is equals to "+a1+", you will write it as a=="+a1+",\n which means 'If a is initialized, a=, and if after getting initialized, it is equals to "+a1+", a=="+a1+".'");
		JOptionPane.showMessageDialog(null, "For Example,\na=1;\n\nif(a==1){\nPrint>1}");
	}
}
