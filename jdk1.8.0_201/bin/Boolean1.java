import javax.swing.JOptionPane;
class Boolean1{
	public static void main(String[]args){
		boolean b=10>5 && 10>30 && 10>60;
		JOptionPane.showMessageDialog(null, b);
		boolean c=10>5 || 10<6;
		JOptionPane.showMessageDialog(null, c);
		boolean d=10!=8;
		JOptionPane.showMessageDialog(null, d);
	}
}

