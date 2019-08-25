/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team5987.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team5987.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem
{
    private final VictorSP motor = new VictorSP(RobotMap.driveMotorChannel);
    private final Encoder encoder = new Encoder(RobotMap.driveEncoderChannelA, RobotMap.driveEncoderChannelB);
    public void initDefaultCommand() 
    {
        // TODO: Set the default command for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
    public DriveSubsystem(){
        motor.setInverted(RobotMap.driveMotorInverted);
        encoder.setDistancePerPulse(RobotMap.driveDistancePerPulse);
    }


    public void setSpeed(double speed){
        motor.setSpeed(speed);
    }

    public double getSpeed(){
        return encoder.getRate();
    }

    public double getDistance(){
        return encoder.getDistance();
    }



}
