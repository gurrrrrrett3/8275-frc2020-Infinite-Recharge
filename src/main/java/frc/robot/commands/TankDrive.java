/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

// Core.
package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TankDrive extends Command {
   
  // Variable declarations for processing.
  double LeftVertical, RightVertical;
  double powerLeft, powerRight;

  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Deadbanding function, prevents accidental movement.
  private double deadband(double value, double limit) {
    if (Math.abs(value) < limit) return 0;
    else return value;
  }
//yeet
  // Clipping function, prevents overpowering.
  private double clip(double value) {
      if (value > 0.75) return 0.75;
      else if (value < -0.75) return -0.75;
      else return value;
    }

  // Scaling function, changes "jumpiness factor".
  private double scale(double value, double mult) {
    return value*mult;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    // Obtain target values from controller.
    LeftVertical = scale(deadband(-Robot.oi.driverJoystick.getRawAxis(1), 0.125), 1);
    RightVertical = scale(deadband(-Robot.oi.driverJoystick.getRawAxis(5), 0.125), 1);

    // Set drivetrain power.
    Robot.drivetrain.setPower(clip(LeftVertical), clip(RightVertical));

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
