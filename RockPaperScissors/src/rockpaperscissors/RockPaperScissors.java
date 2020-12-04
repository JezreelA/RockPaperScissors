package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        mainMenu();

    }

    public static int getRdm() {
        Random rdm = new Random();
        int move = rdm.nextInt(3);
        return move;
    }

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int compScore=0;
            int userScore=0;
                    

            System.out.print("What is your move?\nTo make a move, enter rock, paper, or scissors. To quit the game, enter quit.\n");
            String userMove = input.nextLine();

            if (userMove.equals("quit")) {
                break;
            }

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {

                System.out.println("INVALID MOVE");

            } else {
                int randomNum = getRdm();

                String compMove = "";
                switch (randomNum) {
                    case 0:
                        compMove = "rock";
                        break;
                    case 1:
                        compMove = "paper";
                        break;
                    default:
                        compMove = "scissors";
                        break;
                }
                System.out.println("The computer has chosen " + compMove);
                if (userMove.equals(compMove)) {
                    System.out.println("It's a tie!");
                    userScore++; compScore++;
                    System.out.println("you are on " + userScore + " points");
                    System.out.println("the computer is on " + compScore + " points");
                } else if (userMove.equals("rock") && compMove.equals("scissors") || userMove.equals("scissors") && compMove.equals("paper") || userMove.equals("paper") && compMove.equals("rock")) {
                    System.out.println("You won!");
                    userScore++;
                    System.out.println("you are on " + userScore + " points");
                    System.out.println("the computer is on " + compScore + " points");
                } else {
                    System.out.println("You lost!");
                    compScore++;
                    System.out.println("you are on " + userScore + " points");
                    System.out.println("the computer is on " + compScore + " points");
                }

            }

        }
    }

}
