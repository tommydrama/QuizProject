package model;

import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);

    String name;
    int score;
    String answer;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAnswer() {
        return answer;
    }
}
