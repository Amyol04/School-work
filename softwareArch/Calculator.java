import javax.swing.*;
public class calculator {
    public static void main(String[] args){

    String input , output;
    double n1,n2,sum;

    input = JOptionPane.showInputDialog("Enter a number");
    n1 = Double.parseDouble(input);


    input = JOptionPane.showInputDialog("Enter second number");
    n2 = Double.parseDouble(input);

    sum = n1 + n2;

    output = String.format("%f + %f is %.4f", n1, n2 , sum);

    JOptionPane.showMessageDialog(null, output);

    } // end of main
} // end of class
