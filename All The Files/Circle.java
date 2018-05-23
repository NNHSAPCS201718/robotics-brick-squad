import lejos.nxt.*;
import lejos.util.*;

/**
 * Trace  two squares, twice.  
 * @author Roger
 */
public class Circle
{
    public static void main( String[] args)
    {
        UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S1);

        while (!Button.ENTER.isDown()) {
          LCD.clear();
          LCD.drawString(sonic.getVendorID(), 0, 0);
          LCD.drawString(sonic.getProductID(), 0, 1);
          LCD.drawString(sonic.getVersion(), 0, 2);
          LCD.drawInt(sonic.getDistance(), 0, 3);
          Delay.msDelay(2000);
        }
    }
}   