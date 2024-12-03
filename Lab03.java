import java.util.Scanner;
public class Lab03 {

	public static final int RP = 99;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the total number of software packages ordered: ");
		
		int quantity = key.nextInt();
		
		if(quantity < 0)
		{
			System.out.println("Invalid value for package count! Exiting the program!");
			
			System.exit(0);
		}
		
		
		else if(quantity >= 10 && quantity <= 19)
		{
			int total = RP * quantity; 
			
			System.out.println("Total Bill Amount (before discount) = $ " + total);
			
			double discount = total * 0.2; 
			
			System.out.println("Amount of discount = $ " +discount);
			
			double finalTotal = total - discount; 
			
			System.out.println("Total Bill Amount (after discount) = $ " +finalTotal);
		}
		
		
		else if(quantity >= 20 && quantity <= 49)
		{
			int total = RP * quantity; 
			
			System.out.println("Total Bill Amount (before discount) = $ " + total);
			
			double discount = total * 0.3; 
			
			System.out.println("Amount of discount = $ " +discount);
			
			double finalTotal = total - discount; 
			
			System.out.println("Total Bill Amount (after discount) = $ " +finalTotal);
		}
		
		else if(quantity >= 50 && quantity <= 99)
		{
			int total = RP * quantity; 
			
			System.out.println("Total Bill Amount (before discount) = $ " + total);
			
			double discount = total * 0.4; 
			
			System.out.println("Amount of discount = $ " +discount);
			
			double finalTotal = total - discount; 
			
			System.out.println("Total Bill Amount (after discount) = $ " +finalTotal);
		}
		
		else if(quantity >= 100)
		{
			int total = RP * quantity; 
			
			System.out.println("Total Bill Amount (before discount) = $ " + total);
			
			double discount = total * 0.5; 
			
			System.out.println("Amount of discount = $ " +discount);
			
			double finalTotal = total - discount; 
			
			System.out.println("Total Bill Amount (after discount) = $ " +finalTotal);
		}
	}

}
