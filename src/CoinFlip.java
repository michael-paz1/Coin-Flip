import java.util.Scanner;

public class CoinFlip
	{

		public static void main(String[] args)
			{
				System.out.println("Flip your coin to test your luck.");
				System.out.println("If you land on heads 3 times in a row, you win!");
				System.out.println("You only have 10 tries");
				System.out.println("What is your name?");
				Scanner userName = new Scanner(System.in);
				String name = userName.nextLine();
				System.out.println("Hello " + name);
				System.out.println("Press Enter to flip the coin");
				Scanner flip = new Scanner(System.in);
				int correctGuess = 0;
				int turnCounter = 0;
				while(turnCounter < 10)
					{
						for(int i = 1; i<= 10; i++)
							{
									{
									int randomNumber = (int)(Math.random() * 2) + 1  ;
									if(randomNumber == 1 && !(turnCounter ==10 ))
										{
											System.out.println("You flipped a heads");
											System.out.println("Press Enter to flip again");
											Scanner hit = new Scanner(System.in);
											correctGuess++;
											turnCounter++;
											break;
										}
									else if(randomNumber == 2 && !(turnCounter ==10 ))
										{
											System.out.println("You flipped a tails");
											System.out.println("Press Enter to flip again");
											Scanner hit = new Scanner(System.in);
											correctGuess = 0;
											turnCounter++;
											break;
										}
									else if(correctGuess == 3)
										{
											System.out.println("Congrats you won!");
											break;
										}
									else if(turnCounter == 10)
										{
											System.out.println("Sorry you Lose");
											break;
										}
									}
							}
					}
			}

	}
