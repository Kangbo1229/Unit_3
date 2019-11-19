import java.util.Scanner;

public class RockPaperScissors {
    public static String getUserChoice() {
        Scanner scan = new Scanner(System.in);
        String person = scan.nextLine();
        return person;
    }
    public static String getComputerChoice() {
        int computer = (int)(Math.random()*3)+1;
        if (computer ==1) {
            return "rock";
        }
        if (computer ==2) {
            return "paper";
        }
        else {
            return "Scissors";
        }
    }
    public static String whowins(String computer, String person){
        if (computer.equals("rock")&&person.equals("rock")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"You tied!";
        }
        else if (computer.equals("rock")&&person.equals("paper")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"You win!";
        }
        else if (computer.equals("rock")&&person.equals("scissors")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"The computer wins!";
        }
        else if (computer.equals("paper")&&person.equals("rock")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"The computer wins!";
        }
        else if (computer.equals("paper")&&person.equals("paper")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"You tied!";
        }
        else if (computer.equals("paper")&&person.equals("scissors")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"You win!";
        }
        else if (computer.equals("scissors")&&person.equals("rock")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"You win!";
        }
        else if (computer.equals("scissors")&&person.equals("paper")) {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"The computer wins!";
        }
        else {
            return "You chose "+person+".\nThe computer chose "+computer+".\n"+"You tied!";
        }
    }
    public static void main(String[] args) {
        System.out.println("Please choose either rock, paper, or scissors.");
        String person = getUserChoice();
        String computer = getComputerChoice();
        System.out.println(whowins(computer, person));

    }
}
