package Demo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowMessage {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "I am a lovely message", "Message", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "I am a scarey error message", "Run for your lives!!!!", JOptionPane.ERROR_MESSAGE);
		
		 ImageIcon icon = new ImageIcon("src/images/monkey64.jfif");
	        JOptionPane.showMessageDialog(null, "I like monkeys!!!!.", 
	                "We can add our own images in a Customised Dialog", JOptionPane.INFORMATION_MESSAGE, icon);

	}

}