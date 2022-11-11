/**
 * Test-case for a solution class not in any package
 */
public class RockPaperLizardSpock {
    /**
     * Return the player who won the game. [7 Kyu]
     * @param player1 player one's input.
     * @param player2 player two's input.
     * @return winner of the game.
     */
    public static String rpsls(String player1, String player2){
        if(player1.equals(player2)) return "Draw!";
        if(player1.equals("scissors") && (player2.equals("paper") || player2.equals("lizard"))) return "Player 1 Won!";
        if(player1.equals("paper") && (player2.equals("rock") || player2.equals("spock"))) return "Player 1 Won!";
        if(player1.equals("rock") && (player2.equals("lizard") || player2.equals("scissors"))) return "Player 1 Won!";
        if(player1.equals("lizard") && (player2.equals("spock") || player2.equals("paper"))) return "Player 1 Won!";
        if(player1.equals("spock") && (player2.equals("scissors") || player2.equals("rock"))) return "Player 1 Won!";
        return "Player 2 Won!";
    }
}
