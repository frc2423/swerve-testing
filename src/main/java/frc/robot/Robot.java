// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {

  private final XboxController m_driverController = new XboxController(0);

  @Override
  public void robotInit() {
  //  m_rightMotor.setInverted(1);
  }

  @Override
  public void robotPeriodic() {

  }

  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {

  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    var left = -m_driverController.getLeftX();
    var right = m_driverController.getRightX();
    System.out.println(right);
    System.out.println(left);
   // double squarecont = squareControllerValues(left, right);
  //  m_RobotDrive.arcadeDrive(left, right);
  }
}
