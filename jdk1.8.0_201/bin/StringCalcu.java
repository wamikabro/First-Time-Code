import javax.swing.*;
class StringCalcu{
	public static void main(String[]args){
		String fv=JOptionPane.showInputDialog("Enter First Value: ");
		int firstvalue=Integer.parseInt(fv);
		String sv=JOptionPane.showInputDialog("Enter First Value: ");
		int secondvalue=Integer.parseInt(sv);
		String operator=JOptionPane.showInputDialog("Enter Operator: ");
		if(operator.equals("+")){
			JOptionPane.showMessageDialog(null, firstvalue+"+"+secondvalue+"= "+(firstvalue+secondvalue));
		}
		if(operator.equals("-")){
			JOptionPane.showMessageDialog(null, firstvalue+"-"+secondvalue+"= "+(firstvalue-secondvalue));
		}
		if(operator.equals("/")){
			JOptionPane.showMessageDialog(null, firstvalue+"/"+secondvalue+"= "+(firstvalue/secondvalue));
		}
		if(operator.equals("*") || operator.equals("x") || operator.equals("X")){
			JOptionPane.showMessageDialog(null, firstvalue+"x"+secondvalue+"= "+(firstvalue*secondvalue));
		}
		if(operator.equals("%")){
			JOptionPane.showMessageDialog(null, firstvalue+" reminder "+secondvalue+"= "+(firstvalue%secondvalue));
		}
		
	}
}