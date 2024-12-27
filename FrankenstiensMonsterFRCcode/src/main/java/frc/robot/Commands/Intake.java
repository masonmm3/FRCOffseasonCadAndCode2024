// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Indexer.Indexer;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class Intake extends Command {
  private Indexer index;
  /** Creates a new Intake. */
  public Intake(Indexer index) {
    this.index = index;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    index.IntakeAndIndex(true);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    index.IntakeAndIndex(true);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    index.IntakeAndIndex(false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return index.gamePieceInShooter();
  }
}