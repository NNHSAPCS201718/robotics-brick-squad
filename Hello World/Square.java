import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Robot that stops if it hits something before it completes its travel.
 */
public class Square 
{
  DifferentialPilot pilot;
  //TouchSensor bump = new TouchSensor(SensorPort.S3);
  public void go(double length) 
  {
    for (int i = 0; i < 4; i++)
    {
        pilot.travel(length);
        pilot.rotateRight();
    }
  }

  public static void main(String[] args) 
  {
    Square traveler = new Square();
    traveler.pilot = new DifferentialPilot(2.25f, 5.5f, Motor.A, Motor.C);
    traveler.go(20);
  }
}