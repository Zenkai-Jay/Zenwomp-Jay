import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
	
		//Jesurun Marshall 
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many books did you purchase at BN booksellers this month?");
		int booksPurchased = key.nextInt();
		
		//Checking to see if the entered value is negative 
		if(booksPurchased < 0)
		{
			System.out.println("Invaild value entered! Exiting the program!");
		}
		else
		{
			int points = 0;
		}
		int pointsEarned;
		switch (booksPurchased)
		{
		case 0:
			pointsEarned = 0;
			
			System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
			break;
			
		case 1:
			pointsEarned = 5;
			break;
			
		case 2:
			pointsEarned = 15;
			break;
			
		case 3:
			pointsEarned = 30;
			break;
			
		default:
			pointsEarned = 60;
			break;
		}
		
		if(booksPurchased >= 1)
		{
			System.out.println("Congratulations!!!! You have earned "+pointsEarned+" points!");
			
			System.out.println("You may redeem thse points on your next book purchased!");		
		}
		
	}

}
