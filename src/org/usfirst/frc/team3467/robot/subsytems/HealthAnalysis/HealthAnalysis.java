package org.usfirst.frc.team3467.robot.subsytems.HealthAnalysis;

import org.usfirst.frc.team3467.robot.subsystems.Brownout.Brownout;
import org.usfirst.frc.team3467.robot.commands.CommandBase;
import edu.wpi.first.wpilibj.PowerDistributionPanel;

public class HealthAnalysis {
<<<<<<< HEAD
private PowerDistributionPanel health = CommandBase.brownout.getPDP();

	double shooterCurrent;
	double driveCurrent;
	double intakerollerCurrent;
	double flashlightCurrent;
	double totalVoltage;
	double totalCurrent;
	double shooterTemperature;
	
	public void update(){
		shooterCurrent = health.getCurrent(0);
		driveCurrent = health.getCurrent(0);
		intakerollerCurrent = health.getCurrent(0);
		flashlightCurrent = health.getCurrent(0);
		
	}
}
=======
//private PowerDistributionPanel health = CommandBase.brownout.getpdp();
}
>>>>>>> refs/remotes/WHS-FRC-3467/master
