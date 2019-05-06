package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        displayHighScorePosition("John", calculateHighScorePosition(1500));
        displayHighScorePosition("Mich", calculateHighScorePosition(900));
        displayHighScorePosition("Alda", calculateHighScorePosition(700));
        displayHighScorePosition("Joe", calculateHighScorePosition(50));
        displayHighScorePosition("Ana", calculateHighScorePosition(150));
    }
    private static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    private static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500){
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
