package org.usfirst.frc.team3467.robot.subsystems.Shooter.commands;

import org.usfirst.frc.team3467.robot.commands.CommandBase;


/**
 *
 */
public class ShooterLatch extends CommandBase {

    public ShooterLatch() {
        requires(pultaCat);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	pultaCat.cataLatch();    // Close the pneumatic latch ...
    	pultaCat.initPIDMode();  // and use PID...
    	pultaCat.latch();		 // to drive the reset arm to the latch point
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (pultaCat.checkBrownOut()) {
    		end();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (pultaCat.onTarget() || pultaCat.checkLatchLimit());
    }

    // Called once after isFinished returns true
    protected void end() {
    	pultaCat.cataStop();
    	if (pultaCat.checkBrownOut()) {
    		System.out.println("Shooter Brownout");
    	}
    	else {
    		System.out.println("Shooter Latched");
    	}
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
