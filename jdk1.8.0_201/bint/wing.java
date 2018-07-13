import javax.swing.JOptionPane;
class wing
{
	public static void main(String[]args)
	{
		String a=JOptionPane.showInputDialog("1st value");
		int b=Integer.parseInt(a);
		
		String aa=JOptionPane.showInputDialog("2nd value");
		int bb=Integer.parseInt(aa);
		JOptionPane.showMessageDialog(null, "Addition = "+(b+bb));
	}
}