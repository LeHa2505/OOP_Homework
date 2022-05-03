import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change?");

        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_NO_OPTION?"YES":"NO"));
    }
}
