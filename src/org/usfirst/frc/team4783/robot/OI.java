package org.usfirst.frc.team4783.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4783.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick joy;
	
	// Axes
	public static int LEFT_Y_AXIS = 1;
	public static int LEFT_X_AXIS = 0;
	public static int RIGHT_X_AXIS = 4;
	public static int RIGHT_Y_AXIS = 5;
	public static int LEFT_TRIGGER_AXIS = 2;
	public static int RIGHT_TRIGGER_AXIS = 3;

	// Buttons
	public static int LEFT_BUMPER_BUTTON = 5;
	public static int RIGHT_BUMPER_BUTTON = 6;
	public static int X_BUTTON = 3;
	public static int A_BUTTON = 1;
	public static int B_BUTTON = 2;
	public static int Y_BUTTON = 4;
	public static int SELECT_BUTTON = 7;
	public static int START_BUTTON = 8;
	public static int LEFT_STICK_BUTTON = 9;
	public static int RIGHT_STICK_BUTTON = 10;

	public OI() {
		Joystick joy = new Joystick(1);
		
//		JoystickButton sl2 = new JoystickButton(joy, LEFT_TRIGGER_AXIS);
//		JoystickButton sr2 = new JoystickButton(joy, RIGHT_TRIGGER_AXIS);
//		JoystickButton sl1 = new JoystickButton(joy, LEFT_BUMPER_BUTTON);
//		JoystickButton sr1 = new JoystickButton(joy, RIGHT_BUMPER_BUTTON);
		JoystickButton sx = new JoystickButton(joy, X_BUTTON);
//		JoystickButton sa = new JoystickButton(joy, A_BUTTON);
		JoystickButton sb = new JoystickButton(joy, B_BUTTON);
//		JoystickButton sy = new JoystickButton(joy, Y_BUTTON);
		
	
		// Commands
		// Ramp's angle is controlled from within command AimRampWithJoystick
		// DriveTrain is controlled from within command DriveWithJoystick
		
		sb.whileHeld(new SetFlywheels(Robot.shooter.SHOOT_SPEED)); // Speeds up flywheels to shoot
		sb.whenReleased(new SetFlywheels(Robot.shooter.RESET_SPEED)); // and resets when released
		
		sx.whileHeld(new SetFlywheels(Robot.shooter.PULL_SPEED)); // Speeds up flywheels to pull in boulder
		sx.whenReleased(new SetFlywheels(Robot.shooter.RESET_SPEED)); // and resets when released
	}
}

