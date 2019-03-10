import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();

		r2d2.penDown();
		r2d2.setSpeed(100);
		r2d2.turn(20);
		r2d2.move(200);
		r2d2.turn(140);
		r2d2.move(200);
		r2d2.penUp();
		r2d2.turn(180);
		r2d2.move(100);
		r2d2.turn(290);
		r2d2.penDown();
		r2d2.move(68);
		r2d2.hide();

	}
}
