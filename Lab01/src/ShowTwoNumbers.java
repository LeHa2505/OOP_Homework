import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just input ";

        strNum1 = JOptionPane.showInputDialog(null, "Please enter your first number: ", "Enter the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and " ;

        strNum2 = JOptionPane.showInputDialog(null, "Please enter your second number: ", "Enter the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification);
         System.exit(0);
    }
}
