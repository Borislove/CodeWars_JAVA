/*"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"*/

public class RockPaperScissors {

    public static String rps(String p1, String p2) {

        String player1 = "Player 1 won!";
        String player2 = "Player 2 won!";

        if (p1.equals(p2))
            return "Draw!";

        if (p1.equals("paper") && p2.equals("rock")
                || p1.equals("rock") && p2.equals("scissors")
                || p1.equals("scissors") && p2.equals("paper")) {
            return player1;
        } else {
            return player2;
        }
    }


    public static void main(String[] args) {

        String strPaper = "paper";
        String strRock = "rock";
        String strScissors = "scissors";

        System.out.println(rps("paper", "paper"));
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps(strPaper, strRock));


        System.out.println("player 1 = " + strRock);
        System.out.println(rps(strRock, strScissors));
        System.out.println(rps(strRock, strPaper));
        System.out.println(rps(strRock, strScissors));
        System.out.println(rps(strRock, strRock));
    }
}
