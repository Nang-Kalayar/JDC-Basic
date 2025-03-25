import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = false;

		while(!bool){
			//Generate Ramdom Number

			int random = ThreadLocalRandom.current().nextInt(1,5);
			System.out.println("Random number: " + random);
			// User Input Number
			System.out.println("Enter a number to guess :");

			int input =sc.nextInt();

			//compare (random number == inout number)

			if(random == input)
				bool = true;
			//Output You win or lose
			String message = bool ? "You Win" : "You Lose";
			System.out.println(message);
		}
	}
}