package org.usfirst.frc.team4783.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4783.robot.RobotMap;

public class Vision extends Subsystem {
	
	private Ultrasonic ultra;
	private AnalogInput analog;
	
	public Vision() {
		ultra = new Ultrasonic(RobotMap.ultrasonicPing,RobotMap.ultrasonicEcho);
		analog = new AnalogInput(RobotMap.ultrasonicAnalog);
		
		ultra.setAutomaticMode(true);
		CameraServer.getInstance().setQuality(50);
		CameraServer.getInstance().startAutomaticCapture("cam");
	}
	
	public double GetDistance() {
		return ultra.getRangeInches();
	}

	public double GetAverageVoltage() {
		return analog.getAverageVoltage();
	}
	protected void initDefaultCommand() {
	}
	
}