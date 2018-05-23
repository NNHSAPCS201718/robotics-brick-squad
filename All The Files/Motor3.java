
/**
 * Write a description of class MotorTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
public class Motor3
{
    public static void main(String[] args)
      {
           LCD.drawString("Program 3", 0, 0);
           
           Button.waitForAnyPress();
           
           Motor.A.setSpeed(720);
           Motor.A.rotate(1440);
           LCD.clear();
           LCD.drawInt(Motor.A.getTachoCount(),0,0);
           
           Motor.A.rotateTo(0);
           LCD.drawInt(Motor.A.getTachoCount(),0,1);
           
           Button.waitForAnyPress();
     }
}
