import javax.swing.*;

public class GUIDemo {
	public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Sup Bitch");
        JOptionPane.showMessageDialog(null, "Sup Bitches", "Bitch",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sup Bitches", "Bitch",
                JOptionPane.ERROR_MESSAGE);

                //Input
                String input;

                input = JOptionPane.showInputDialog("Enter your name");
                input = JOptionPane.showInputDialog("Enter your name", "Tom");

                int option;
                String[] options = {"enter", "leave"};
                option = JOptionPane.showOptionDialog(null, "enter or leave",
        "gate", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
    }

}
