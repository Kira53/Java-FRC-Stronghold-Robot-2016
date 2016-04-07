package org.usfirst.frc.team4783.robot.commands;

import org.usfirst.frc.team4783.robot.OI;
import org.usfirst.frc.team4783.robot.Robot;
import java.lang.Math;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ControlArmWithJoystick extends Command {

    public ControlArmWithJoystick() {
        requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (OI.joy.getRawButton(OI.RIGHT_BUMPER_BUTTON)) {
    		double speed = -Math.pow(OI.joy.getRawAxis(OI.RIGHT_Y_AXIS), 3);
    		Robot.arm.setArmSpeed(speed);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
