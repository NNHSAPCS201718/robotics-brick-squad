
/**
 * Write a description of class MotorTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
public class MotorTest2
{
    public static void main(String[] args)
      {
       
       LCD.drawString("Program 2", 0, 0);
       Button.waitForAnyPress();
       
       Motor.A.setSpeed(2);
       
       while(Motor.A.getTachoCount() < 1440)
       {Motor.A.forward();}
       Delay.msDelay(2000);
       LCD.drawString(1440 + "",0,1);
       LCD.drawString("" + Motor.A.getTachoCount(),0,2);
       
       while(Motor.A.getTachoCount() > 0)
       {Motor.A.backward();}
       Motor.A.stop();
       LCD.drawString("" + Motor.A.getTachoCount(),0,3);
       
       Button.waitForAnyPress();
     }
}
