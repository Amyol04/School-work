import javax.swing.JOptionPane;

public class help {
    public static void main(String[] args) {
        // Input prompts
        String inputPrompt1 = "Enter the starting number:";
        String inputPrompt2 = "Enter the ending number:";

        try {
            // Input dialog to get user input as strings
            String startInput = JOptionPane.showInputDialog(null, inputPrompt1);
            String endInput = JOptionPane.showInputDialog(null, inputPrompt2);

            // Parse user inputs to integers
            int startNumber = Integer.parseInt(startInput);
            int endNumber = Integer.parseInt(endInput);

            // Validate that startNumber is less than or equal to endNumber
            if (startNumber > endNumber) {
                JOptionPane.showMessageDialog(null, "Start number must be less than or equal to end number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                double sum = 0;

                // Calculate the sum of odd numbers between startNumber and endNumber
                for (int i = startNumber; i <= endNumber; i++) {
                    if (i % 2 != 0) { // Check if the number is odd
                        sum += i;
                    }
                }

                // Display the result
                JOptionPane.showMessageDialog(null, "Sum of odd numbers between " + startNumber + " and " + endNumber + " = " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
