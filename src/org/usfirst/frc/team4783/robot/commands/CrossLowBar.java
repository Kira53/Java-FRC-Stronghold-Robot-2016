package org.usfirst.frc.team4783.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CrossLowBar extends CommandGroup {
    
    public  CrossLowBar() {
    	addSequential(new SetArmSpeed(0.5, 0.15));
    	addSequential(new DriveStraight(-0.7, 3));
    }
}