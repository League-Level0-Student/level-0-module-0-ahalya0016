import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you went to England last summer, " + input + "! Muahahaha!");
	}
}
