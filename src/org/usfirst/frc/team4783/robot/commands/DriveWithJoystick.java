package org.usfirst.frc.team4783.robot.commands;

import org.usfirst.frc.team4783.robot.OI;
import org.usfirst.frc.team4783.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


/**
 Drive with two joysticks
 */
public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double boost = (1 - Robot.drivetrain.BASE_SPEED) * 
    			OI.joy.getRawAxis(OI.LEFT_TRIGGER_AXIS) + Robot.drivetrain.BASE_SPEED;
    	double tboost = (1 - Robot.drivetrain.TURN_SPEED) * 
    			OI.joy.getRawAxis(OI.RIGHT_TRIGGER_AXIS) + Robot.drivetrain.TURN_SPEED;
    	double speed = OI.joy.getRawAxis(OI.LEFT_Y_AXIS) * boost;
    	double turn = OI.joy.getRawAxis(OI.RIGHT_X_AXIS) * tboost;
    	
    	Robot.drivetrain.arcadeDrive(speed, turn);
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
