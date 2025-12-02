package quiz;

import java.io.*;

public class Player {
    private String name; // player name
    private int highScore; // high score

    public Player(String name) {
        this.name = name;
        this.highScore = loadHighScore(); // load from file
    }

    public String getName() {
        return name; // returns player name
    }

    public int getHighScore() {
        return highScore; // returns high score
    }

    // Update high score if player beats it
    public void updateHighScore(int score) {
        if (score > highScore) {
            highScore = score;
            saveHighScore(); // save to file
        }
    }
// file handlind
    // read the saved high score from file

    private int loadHighScore() {
        File file = new File(name + "_score.txt");

        if (!file.exists()) {
            return 0; // no = no previous score
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return Integer.parseInt(br.readLine()); // read score from file
        } catch (Exception e) {
            return 0; // if file corrupted or unreadable
        }
    }
// save current high score to file
    private void saveHighScore() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(name + "_score.txt"))) {
            pw.println(highScore);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


