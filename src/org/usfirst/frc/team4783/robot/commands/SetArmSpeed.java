package org.usfirst.frc.team4783.robot.commands;

import org.usfirst.frc.team4783.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


/**
 Controls arm in autonomous mode
 */
public class SetArmSpeed extends Command {
	
	private double speed;
	private double duration;

    public SetArmSpeed(double speed, double duration) {
    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(duration);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.arm.setArmSpeed(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
