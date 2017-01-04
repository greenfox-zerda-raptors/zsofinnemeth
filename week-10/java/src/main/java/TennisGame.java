
public class TennisGame implements TennisInterface {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame (String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    public String getScore() {
        String score = "";
        if (checkIfBothScoresAreAbove3() && checkIfScoresEqual()) return "Deuce";
        if (checkIfScoresEqual()) return pointsToString(player1Score) + "-All";
        if (checkIfSomeOneIsCloseToWin()) return pointsToString(3 + getScoreDifference()) + checkWhosWinning();
        else return pointsToString(player1Score) + "-" +pointsToString(player2Score);
    }

    private int getScoreDifference() {
        if (Math.abs(player1Score-player2Score) > 2) {
            return 2;
        } else {
            return Math.abs(player1Score - player2Score);
        }
    }

    private String checkWhosWinning() {
        if (player1Score - player2Score > 0) {
            return "player1";
        } else {
            return "player2";
        }
    }

    private boolean checkIfSomeOneIsCloseToWin() {
        return player1Score >=4 || player2Score >=4;
    }

    private String pointsToString(int points) {
        String[] score = {"Love", "Fifteen", "Thirty", "Forty", "Advantage ","Win for "};
        return score[points];
    }

    private boolean checkIfScoresEqual() {
        return player1Score == player2Score;
    }

    private boolean checkIfBothScoresAreAbove3() {
        return player1Score >= 3 && player2Score >= 3;
    }
}
