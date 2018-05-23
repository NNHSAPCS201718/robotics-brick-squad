
/**
 * Write a description of class MotorTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
public class Motor5
{
    public static void main(String[] args)
      {
           LCD.drawString("Program 3", 0, 0);
           Button.waitForAnyPress();
           
           Motor.A.setSpeed(720);
           Motor.B.setSpeed(720);
           Motor.C.setSpeed(720);
           
           Motor.A.rotate(720, true);
           Motor.B.rotate(720, true);
           Motor.C.rotate(720, true);
           
           for (int i = 0; i < 8; i ++)
           {
                Delay.msDelay(200);
               
                LCD.drawInt(Motor.A.getTachoCount(), 0,i);
                LCD.drawInt(Motor.B.getTachoCount(), 6,1);
                LCD.drawInt(Motor.C.getTachoCount(), 12,i);
            }
           
           while(Motor.A.isMoving()|| Motor.B.isMoving()||Motor.C.isMoving());
           {Button.waitForAnyPress();}
     }
}
