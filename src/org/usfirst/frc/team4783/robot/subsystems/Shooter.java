package org.usfirst.frc.team4783.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4783.robot.RobotMap;

public class Shooter extends Subsystem {
	
	private SpeedController leftFlywheel;
	private SpeedController rightFlywheel;
    
    public final double SHOOT_SPEED = 0.5;
    public final double PULL_SPEED = -0.2;
    public final double RESET_SPEED = 0.0;
	
	public Shooter() {
		leftFlywheel = new VictorSP(RobotMap.leftFlywheel);
		rightFlywheel = new VictorSP(RobotMap.rightFlywheel);
		
		leftFlywheel.setInverted(false);
		rightFlywheel.setInverted(true);
	}
	
	public void setFlywheelSpeed(double speed) {
		leftFlywheel.set(speed);
		rightFlywheel.set(speed);
	}

	protected void initDefaultCommand() {
		leftFlywheel.set(0);
		rightFlywheel.set(0);
	}
	
}