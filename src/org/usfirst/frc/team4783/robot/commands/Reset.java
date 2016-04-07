package org.usfirst.frc.team4783.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Reset extends CommandGroup {
    
    public  Reset() {
    	addParallel(new SetFlywheels(0));
    	addParallel(new SetArmSpeed(0, 0));
    	addParallel(new DriveStraight(0, 0));
    }
}
