import java.util.Scanner;
import javax.swing.JOptionPane;
class JOATM{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		String a=JOptionPane.showInputDialog("Amount?");
		int Amount=Integer.parseInt(a);
		int hundred=(Amount%1000);
		int fifty=(hundred%100);
		int twenty=(fifty%50);
		int ten=(twenty%20);
		int five=(ten%10);
		int two=(five%5);
		int one=(two%2);
		JOptionPane.showMessageDialog(null, "Thousands > "+(Amount/1000)+"\nHundreds > "+(hundred/100)+"\nFifties > "+(fifty/50)+"\nTwenties > "+(twenty/20)+"\nTens > "+(ten/10)+"\nFive Coins > "+(five/5)+"\nTwo Coins > "+(two/2)+"\nOne Coins > "+(one/1));
	}
}