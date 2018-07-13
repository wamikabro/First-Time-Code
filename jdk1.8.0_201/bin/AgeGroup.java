import javax.swing.*;
class AgeGroup{
	public static void main(String[]args){
		String agee=JOptionPane.showInputDialog("Enter your Age: ");
		int age=Integer.parseInt(agee);
		if(age<=0){
			JOptionPane.showMessageDialog(null, "This can't be a age ");
		}
		if(age>1 && age<=14){
			JOptionPane.showMessageDialog(null, "You are a Child.");
		}
		if(age>=15 && age<=35){
			
			JOptionPane.showMessageDialog(null, "You are Young");
			
			if(age>=15 && age<=18){
				
				JOptionPane.showMessageDialog(null, "It's your age of Maturity.");
			}
		}
		if(age>35 && age<=50){
			
			JOptionPane.showMessageDialog(null, "You are Elder");
			if(age>=40){
				
				JOptionPane.showMessageDialog(null, "You are turning Old.");
			}
		}
		if(age>=51 && age<=65){
			JOptionPane.showMessageDialog(null, "You are Old");
		}
		if(age>=66){
			JOptionPane.showMessageDialog(null, "Allah Allah kar!");
		}
	}
}