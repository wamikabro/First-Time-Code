import javax.swing.*;
class MarkSheet{
	public static void main(String[]args){
		String j=JOptionPane.showInputDialog("Enter Java Marks: ");
		int java=Integer.parseInt(j);
		String h=JOptionPane.showInputDialog("Enter HTML Marks: ");
		int html=Integer.parseInt(h);
		String c=JOptionPane.showInputDialog("Enter CSS Marks: ");
		int css=Integer.parseInt(c);
		String ph=JOptionPane.showInputDialog("Enter PHP Marks: ");
		int php=Integer.parseInt(ph);
		String py=JOptionPane.showInputDialog("Enter Python Marks: ");
		int python=Integer.parseInt(py);
		int obtained=java+html+css+php+python;
		double percentage=obtained*100/500;
		JOptionPane.showMessageDialog(null, "*****MarkSheet*****\nJava: "+java+"/100\nHTML: "+html+"/100\nCSS: "+css+"/100\nPHP: "+php+"/100\nPython: "+python+"/100\nObtained: "+obtained+" out of 500\nPercentage: "+percentage+"%");
		
	}
}