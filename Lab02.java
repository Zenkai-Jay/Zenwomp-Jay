import java.util.Scanner;
public class Lab02 {

	public static final double a = 9.8;
	
	public static void main(String[] args) {
		//Jesurun Marshall
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A: ");
		
		double u = key.nextDouble(); 
		
		System.out.println("How much time (in seconds) does the ball take to reach point B? ");
		
		double t = key.nextDouble();
		
		double v = u+(a*t);
		
		double s = (u * t) + (0.5 * a * Math.pow(t,  2));
		
		System.out.println("Final Velocity of the ball: " + v);
		
		System.out.println("Distance traveled by the ball (S): " + s);
		
		
		

	}

}
