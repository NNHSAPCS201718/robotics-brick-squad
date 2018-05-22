
/**
 * Write a description of class MotorTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import lejos.nxt.*;
import lejos.util.Delay;
public class Motor4
{
    public static void main(String[] args)
      {
           LCD.drawString("Program 3", 0, 0);
           Button.waitForAnyPress();
           
          while (Button.readButtons()>0)
          {LCD.clear();
           Motor.A.rotateTo(1440, true);
          }
            
          while(Motor.A.isMoving())
          {
             Delay.msDelay(200);
             LCD.drawInt(Motor.A.getTachoCount(),0,0);
              if(Button.readButtons()>0)
                {Motor.A.stop();}
           }
           
           LCD.drawInt(Motor.A.getTachoCount(),0,1);
           
           Button.waitForAnyPress();
     }
}
