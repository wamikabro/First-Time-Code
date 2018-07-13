import javax.swing.*;
class UnitConverter{
	public static void main(String[]args){
		String un=JOptionPane.showInputDialog("***** Unit Converter *****\n1: Length\n2: Weight");
		int unit=Integer.parseInt(un);
		if(unit==1)
		{
			String inft=JOptionPane.showInputDialog("***** Length Converter *****\n1: Inch to Feet\n2: Feet to Inch");
			int inftt=Integer.parseInt(inft);
			if(inftt==1)
			{
				String itf=JOptionPane.showInputDialog("***** Inches To Feet *****\nInches: ");
				int inchtofeet=Integer.parseInt(itf);
				JOptionPane.showMessageDialog(null, "Feet: "+(inchtofeet/12)+"\nInches: "+(inchtofeet%12));
			}
			else if(inftt==2)
			{
				String fti=JOptionPane.showInputDialog("***** Feet To Inches *****\nInches: ");
				int feettoinch=Integer.parseInt(fti);
				JOptionPane.showMessageDialog(null, "Feet: "+(feettoinch*12));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "The option you choosen isn't in the list.");
			}
		}
		else if(unit==2)
		{
			String kgg=JOptionPane.showInputDialog("***** Weight Converter *****\n1: Kg to G\n2: G to Kg");
			int kggg=Integer.parseInt(kgg);
			if(kggg==1)
			{
				String kgtog=JOptionPane.showInputDialog("***** Kg to G *****\nEnter Kilograms: : ");
				int kgtog1=Integer.parseInt(kgtog);
				JOptionPane.showMessageDialog(null, "Grams: "+(kgtog1*1000));
				
			}
			else if(kggg==2)
			{
				String gtokg=JOptionPane.showInputDialog("***** G to Kg *****\nEnter Grams: ");
				int gtokg1=Integer.parseInt(gtokg);
				JOptionPane.showMessageDialog(null, "Kilograms: "+(gtokg1/1000)+"\nGrams: "+(gtokg1%1000));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "The option you choosen isn't in the list.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The option you choosed isn't in the list.");
		}
		
		
	}
}