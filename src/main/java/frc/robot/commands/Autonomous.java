/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

////////////////////////////////////////////////////////////////////////
////////////////////// FOR NOW, THIS DOES NOTHING //////////////////////
////////////////////////////////////////////////////////////////////////

// Core
package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;

public class Autonomous extends Command {

  public Autonomous() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
  
}


//Plan:
//
//Prefer to be in front of goals
//
//Move until in front of goal
//lift intake
//Drop balls
//turn 115 degrees to the left
//move to top corer of sector
//trun 65 degrees to the left
//stop at edge of sector
//end auto
