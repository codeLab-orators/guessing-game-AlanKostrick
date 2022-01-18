import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        String userChoice;

        System.out.println("What is your name?");
        String nameEntered = input.nextLine();

        System.out.println("Do you want to play a guessing game? (y/n)");
        userChoice = input.nextLine();

        while (userChoice.equalsIgnoreCase("y")) {

            //game play logic
            Player player = new Player(nameEntered, false);
            Player computer = new Player("Comp", false);

            System.out.println("Let's play a guessing game against the computer.");
            System.out.println("Drawing a secret number from the pile.");
            Thread.sleep(3000);
            System.out.println("Ok...number is between 1 and 10");
            Random randomNumber = new Random();
            int secretNumber = randomNumber.nextInt(10);

            while(!player.getWinner() && !computer.getWinner()) {
                System.out.println("Guess a number");
                int guessedNumber = input.nextInt();
                player.guessNumber(guessedNumber, secretNumber);
                computer.guessNumber(randomNumber.nextInt(10), secretNumber);
            }

            if(player.getWinner()){
                System.out.println(player.getName() + " wins!");
            } else {
                System.out.println(computer.getName() + " wins!");
            }

            input.nextLine();
            System.out.println("Do you want to play again? (y/n)");
            userChoice = input.nextLine();
        }

        System.out.println("Thanks for playing, see you next time!");
    }
}
