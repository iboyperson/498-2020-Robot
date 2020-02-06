package frc.robot;
import frc.robot.Subsystems.*;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Autonomous.*;
public class RobotContainer {
 public static void RobotPeriodic() {
    Smart_Dashboard.Smart_Dashboard_Periodic();
 }
 public static void RobotInit() {
    Smart_Dashboard.Smart_Dashboard_RobotInit();
    DriveSubsystem.driveInit();
 }
 public static void TeleOpInit() {

 }
 public static void TeleOp(){
    Smart_Dashboard.Smart_Dashboard_TeleOp();
    DriveSubsystem.driveTeleOp();
    WristSubsystem.WristTeleOp();
    Limelight.Update_Limelight_Tracking();
    Limelight.Limelight_Tracking();
 }
 public static void AutoInit() {
    Smart_Dashboard.Smart_Dashboard_AutoInit();
    Autonomous.Auto();
 }
 public static void Auto(){
    Scheduler.getInstance().run();
 }
}