
/**
 * Write a description of class MotorTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
public class MotorTest
{
    public static void main(String[] args)
      {
       LCD.drawString("Program 1", 0, 0);
       Button.waitForAnyPress();
       LCD.clear();
       Motor.A.forward();
       Motor.B.forward();
       LCD.drawString("FORWARD",0,0);
       Button.waitForAnyPress();
       LCD.drawString("BACKWARD",0,0);
       Motor.A.backward();
       Motor.B.backward();
       Button.waitForAnyPress();
       Motor.A.stop(); 
       Motor.B.stop();
     }
}
