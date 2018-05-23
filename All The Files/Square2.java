import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Trace  two squares, twice.  
 * @author Roger
 */
public class Square2 
{
    DifferentialPilot pilot ;
    public void  drawSquare(float length)
    {
        int trip = 1;
        int currAngle = 0;
        
        if(length < 0 )
        {
            trip = -1;
            length = -length;
        }
        
        for(int i = 0; i<4 ; i++)
        {
            pilot.travel(length);
            pilot.rotate(trip * 90);                 
        }
    }
    public static void main( String[] args)
    {
        System.out.println(" Square Tracer 2");
        Button.waitForAnyPress();
        Square2 sq = new Square2();
        sq.pilot = new DifferentialPilot(5.6f, 11.5f, Motor.A, Motor.B);
        int trip = 1;
        int length = 20;
        
        // Test
        //sq.drawSquare(trip * length);
        
        for(int i = 0; i<4; i++)
        {
            sq.drawSquare(trip * length );
            
            if( i == 1)
            {
                sq.pilot.rotate( 90);
                trip = -1;
            }
        }
    }
}