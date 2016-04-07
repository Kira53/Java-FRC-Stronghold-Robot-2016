package org.usfirst.frc.team4783.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Arm
	public static int armMotor = 4;
	
	// Drivetrain
	public static int frontLeftMotor = 3;
	public static int rearLeftMotor = 2;
	public static int frontRightMotor = 1;
	public static int rearRightMotor = 0;
	public static int analogGyro = 1;
	
	// Shooter
	public static int leftFlywheel = 8;
	public static int rightFlywheel = 9;

	// Vision
	public static int ultrasonicAnalog = 2;
	public static int ultrasonicPing = 3;
	public static int ultrasonicEcho = 4;
	
	// Autonoumous Mode Switch
	public static int autoModeSwitch = 7;
}
