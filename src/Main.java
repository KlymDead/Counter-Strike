import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first team name!");
        String counterTerrorist = scanner.next();
        System.out.println("Enter frags of five players!");
        int player1 = scanner.nextInt();
        int player2 = scanner.nextInt();
        int player3 = scanner.nextInt();
        int player4 = scanner.nextInt();
        int player5 = scanner.nextInt();
        int sumFrags = player1 + player2 + player3 + player4 + player5;
        int averageStrength = sumFrags/5;
        System.out.println(averageStrength);

        System.out.println("Enter second team name!");
        String terrorist = scanner.next();
        System.out.println("Enter frags of five players!");
        int player6 = scanner.nextInt();
        int player7 = scanner.nextInt();
        int player8 = scanner.nextInt();
        int player9 = scanner.nextInt();
        int player10 = scanner.nextInt();
        int sumFrags2 = player6 + player7 + player8 + player9 + player10;
        int averageStrength2 = sumFrags2/5;
        System.out.println(averageStrength2);

        if (averageStrength > averageStrength2) {
            System.out.println("Winner is  " + counterTerrorist + "! They have " + averageStrength + " points!");
        }
        else  if (averageStrength < averageStrength2) {
            System.out.println("Winner is  " + terrorist + "! They have " + averageStrength2 + " points!");
        }
        else{
            System.out.println("We have a draw!");
        }

    }
}