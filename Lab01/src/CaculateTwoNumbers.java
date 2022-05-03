import javax.swing.JOptionPane;
import java.lang.Math;

public class CaculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Input the first number");
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Input the first number");
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = Math.abs(num1-num2);
        double product = num1*num2;
        double quotient = num1/num2;

        JOptionPane.showMessageDialog(null, "Sum: " + sum + "\n" + "Difference: " + difference + "\n" + "Product: " + product + "\n" + "Quotient: " + quotient );
    }
}
