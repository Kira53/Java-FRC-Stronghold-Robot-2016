package org.usfirst.frc.team4783.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4783.robot.OI;
import org.usfirst.frc.team4783.robot.RobotMap;

public class DriveTrain extends Subsystem {
	AnalogGyro gyro;
	RobotDrive drive;
	VictorSP frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor;
    
    public final double BASE_SPEED = 0.65;
    public final double TURN_SPEED = 0.80;
	
	public DriveTrain() {
		frontLeftMotor = new VictorSP(RobotMap.frontLeftMotor);
		rearLeftMotor = new VictorSP(RobotMap.rearLeftMotor);
		frontRightMotor = new VictorSP(RobotMap.frontRightMotor);
		rearRightMotor = new VictorSP(RobotMap.rearRightMotor);
		
		gyro = new AnalogGyro(RobotMap.analogGyro);
		gyro.setSensitivity(0.00666);
		gyro.calibrate();
	}
	
	public void arcadeDrive(double speed, double turn) {
		drive.arcadeDrive(OI.joy.getRawAxis(OI.LEFT_Y_AXIS),
				OI.joy.getRawAxis(OI.RIGHT_X_AXIS), true);
	}
	
	public void tankDrive(float leftValue, float rightValue) {
		drive.tankDrive(OI.joy.getRawAxis(OI.LEFT_Y_AXIS),
				OI.joy.getRawAxis(OI.RIGHT_Y_AXIS), true);
	}
	
	public double getHeading() {
		return gyro.getAngle();
	}
	
	protected void initDefaultCommand() {
	}
	
}