import javax.swing.JOptionPane;

public class ShowConfirmDialog {

	public static void main(String[] args) {
		 
        String m = JOptionPane.showInputDialog("Anyone there?");
        System.out.println(m);
        
        System.out.println("What is your name?");
        
        String name = JOptionPane.showInputDialog("What is your name?");
        
        System.out.println("Your name is: "+name);
        
        String ageS = JOptionPane.showInputDialog("What age are you?");
        
        int age = Integer.parseInt(ageS);
        System.out.println("Your age is: "+age);
        
        String heightS = JOptionPane.showInputDialog("What height are you (in feet & inches)?");
        
        double height = Double.parseDouble(heightS);
        System.out.println("Your height is: "+height+" feet");
        
        
        

	}

}
