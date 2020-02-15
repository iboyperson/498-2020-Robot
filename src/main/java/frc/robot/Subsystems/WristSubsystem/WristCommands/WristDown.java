package frc.robot.Subsystems.WristSubsystem.WristCommands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.Subsystems.WristSubsystem.*;
import frc.robot.Smart_Dashboard;

public class WristDown {
    
 private static double speed = Smart_Dashboard.smartWristSpeed();
 private static double time = 1.5; 
 private static Timer timer = new Timer();
 private static double timeElapsed = timer.get();
 private static double toleranceTime = 1;
 public static double kP = time - timeElapsed;
 public static double kI = 0.9;
 private static double toleranceSpeedFactor() {
     return kP * kI;
 }

    public static void down(){ 

                Wrist.m_WristTalon.set(-speed);
          
    }

     /*if (WristEncoder.getWristUp() == true || WristEncoder.getWristDown() == true) {
        end();
     }
        if (timeElapsed < time - toleranceTime) {
            Wrist.m_WristTalon.set(ControlMode.PercentOutput, -speed);
        }

        else if (timeElapsed > time - toleranceTime) {
            Wrist.m_WristTalon.set(ControlMode.PercentOutput, -speed * toleranceSpeedFactor());
        }
        else if (timeElapsed == time) {
         end();
        }
        else {
         end();
        }*/
     
    protected static void end(){
        timer.stop();
        timer.reset();
        Wrist.m_WristTalon.set(0);
    }
}