package org.usfirst.frc.team4783.robot.commands;

import org.usfirst.frc.team4783.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DriveStraight extends Command {
	
	private double speed;
	private double duration;
	private double heading;

    public DriveStraight(double speed, double duration) {
    	requires(Robot.drivetrain);
    	heading = Robot.drivetrain.getHeading();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(duration);
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double currentheading =	heading;
    	Robot.drivetrain.arcadeDrive(speed, (heading - currentheading) * 0.08);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
