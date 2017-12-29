package org.usfirst.frc172.NorthernForce.subsystems;

import org.usfirst.frc172.NorthernForce.RobotMap;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

public class UltrasonicSensor extends Subsystem 
{
	Ultrasonic ultrasonicSensor = RobotMap.ultrasonicSensor;

	@Override
	protected void initDefaultCommand() 
	{
	}

	public int getRange()
	{
		
		return 0;
	}
	
	public void standby()
	{
		
		
	}
		
	
}