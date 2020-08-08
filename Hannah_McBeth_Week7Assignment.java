// Hannah McBeth
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Hannah_McBeth_Week7Assignment {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		// Variable declarations
		int numTeams = 0; // number of rows
		int numGames = 0; // number of columns
		int min1 = 1;
		int max1 = 9;
		int min2 = 1;
		int max2 = 9;
		int topTeam = 0;
		int topScore = 0;
		
		System.out.print("-----------------------------------------------------------------" + "\nFootball Team Randomized Season Scores" + "\n-----------------------------------------------------------------");
		System.out.println("\nEnter the number of teams: ");
		numTeams = input.nextInt();
			while (numTeams > 9 || numTeams < 1 || numTeams <= 0 )
			{
			System.out.print("Please enter a number between " + min1 + " and " + max1 + ".");
			System.out.println("\nEnter the number of teams: ");
			numTeams = input.nextInt();
			}
			
		System.out.println("Enter the number of games: ");
		numGames = input.nextInt();
			while (numGames > 9 || numGames < 1 || numGames <= 0 )
			{
			System.out.print("Please enter a number between " + min1 + " and " + max1 + ".");
			System.out.print("\nEnter the number of games: ");
			numGames = input.nextInt();
			}
		System.out.println("-----------------------------------------------------------------");
		
		int[][] x = new int[numTeams][numGames];

		for (int i = 0; i < numTeams; i++) // The outter loop processes the rows of games
		{
			for (int j = 0; j < numGames; j++) // The inner loop processes the columns of teams
			{
				x[i][j] = rand.nextInt((max2 - min2) +1) + min2; // Generates random scores between min/max in the array
			}
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\nFootball Scores Report" + "\n-----------------------------------------------------------------");
		System.out.println("Team   " + "Scores" + "           Tot" + "\tAvg");
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println();
		for (int i = 0; i < numTeams; i++)
		{
			System.out.print((i + 1) + ":     ");
			
			int rowTotal = 0;
			double rowAverage = 0;
			for (int j = 0; j < numGames; j++) 

			{
				System.out.print(x[i][j] + " ");
				rowTotal += x[i][j];
			}
			rowAverage = (rowTotal / numGames);
			if (rowTotal > topScore)
			{
				topScore = rowTotal;
				topTeam = i + 1;
			}
			System.out.print("\t" + rowTotal);
			System.out.print("\t" + rowAverage);
			System.out.println();
				

		}
		
	System.out.println("-----------------------------------------------------------------");
	System.out.println("Top Team: Team " + topTeam);

	}
	
}


