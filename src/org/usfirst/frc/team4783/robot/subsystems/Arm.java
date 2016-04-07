package org.usfirst.frc.team4783.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4783.robot.RobotMap;

public class Arm extends Subsystem {
	
	private SpeedController armMotor;
	
	public Arm() {
		armMotor = new VictorSP(RobotMap.armMotor);
		armMotor.setInverted(true);
	}
	
	public void setArmSpeed(double speed) {
		armMotor.set(speed);
	}
	
	protected void initDefaultCommand() {
		armMotor.set(0);
	}
	
}