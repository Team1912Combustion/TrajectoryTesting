// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeOut extends CommandBase {
  private Intake m_intake;

  public IntakeOut(Intake intake) {
    m_intake = intake;
    addRequirements(m_intake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_intake.intakeOut();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}