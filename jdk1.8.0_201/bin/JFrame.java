import javax.swing.*;
import java.awt.*;
class JFramess{
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	
	public JFramess(){
		
		
		gui();
		
		
	}
	
	public void gui(){
		
		f=new JFrame("Creativity");
		
		
	}
	
	public static void main(String[]args){
		JFrame f=new JFrame("The Frame");
		
		f.setSize(300, 325);
		f.setLocation(150, 50);
		f.setVisible(true);
	}
}