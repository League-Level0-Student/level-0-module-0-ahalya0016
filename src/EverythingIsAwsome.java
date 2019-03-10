import javax.swing.JOptionPane;

public class EverythingIsAwsome {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your favorite thing?");
		JOptionPane.showMessageDialog(null, input + " is awesome!");
	}
}
