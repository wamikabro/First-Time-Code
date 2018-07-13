import javax.swing.*;
class JCalcuWithoutElse{
	public static void main(String[]args){
		String first=JOptionPane.showInputDialog("Enter First Value: ");
		int firstvalue=Integer.parseInt(first);
		String second=JOptionPane.showInputDialog("Enter Second Value: ");
		int secondvalue=Integer.parseInt(second);
		String opera=JOptionPane.showInputDialog("Enter Operator: ");
		char operator=opera.charAt(0);
		
		if(operator=='+'){
			JOptionPane.showMessageDialog(null, "Your Answer: "+(firstvalue+secondvalue));
		}
		else if(operator=='-'){
			JOptionPane.showMessageDialog(null, "Your Answer: "+(firstvalue-secondvalue));
		}
		else if(operator=='*' | operator=='x' | operator=='X'){
			JOptionPane.showMessageDialog(null, "Your Answer: "+(firstvalue*secondvalue));
		}
		else if(operator=='/' | operator=='\\'){
			JOptionPane.showMessageDialog(null, "Your Answer: "+(firstvalue/secondvalue));
		}
		else if(operator=='%'){
			JOptionPane.showMessageDialog(null, "Your Answer: "+(firstvalue%secondvalue));
		}
		else if(operator!='*'|operator!='x'|operator!='X'|operator!='/'|operator!='+'|operator!='-'){
			JOptionPane.showMessageDialog(null, operator+" is not operator. Kia karu "+firstvalue+" or "+secondvalue+" ka?");
		}
		
		
		
	}
}