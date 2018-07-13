import javax.swing.*;
import java.util.Scanner;
class Value{
	
	
	void plus(){
	
	
		String f=JOptionPane.showInputDialog("Enter Two Values To Plus\n(Press Any Key To Continue)");
		int first=Integer.parseInt(f);
		int second=Integer.parseInt(f);
	}
	void display(){
		JOptionPane.showMessageDialog(null, "Your Answer: "+(first+second));
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		Value obj1=new Value();
		obj1.plus=
		display();
		
	}
}