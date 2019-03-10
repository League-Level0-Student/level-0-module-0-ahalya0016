import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, input + " is also my favorite color!");

		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(100);
		r2d2.turn(120);
		r2d2.move(200);
		r2d2.turn(120);
		r2d2.move(200);
		r2d2.turn(120);
		r2d2.move(200);
		r2d2.hide();

	}
}
