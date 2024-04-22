import java.util.Scanner;
import java.util.Random;

public class Hangman {
    private static final String[] WORDS = {"jabłko", "programowanie", "komputer", "konsola", "programista"};
    private String word;
    private StringBuilder hiddenWord;
    private int attemptsLeft;
    private Scanner scanner;

    public Hangman() {
        scanner = new Scanner(System.in);
        Random random = new Random();
        word = WORDS[random.nextInt(WORDS.length)];
        hiddenWord = new StringBuilder(word.length());
        for (int i = 0; i < word.length(); i++) {
            hiddenWord.append('_');
        }
        attemptsLeft = 7;
    }

    public void play() {
        System.out.println("Witaj w grze w wisielca!");
        while (attemptsLeft > 0 && hiddenWord.indexOf("_") != -1) {
            displayHangman();
            System.out.println("Zgadnij literę: ");
            char letter = scanner.next().charAt(0);
            if (guess(letter)) {
                System.out.println("Dobrze! Zgadłeś literę.");
            } else {
                attemptsLeft--;
                System.out.println("Niepoprawna litera! Pozostało prób: " + attemptsLeft);
            }
            System.out.println("Aktualne słowo: " + hiddenWord.toString());
        }
        if (hiddenWord.indexOf("_") == -1) {
            System.out.println("Gratulacje! Odgadłeś słowo: " + word);
        } else {
            System.out.println("Koniec gry! Nie udało się odgadnąć słowa. Poprawne słowo to: " + word);
        }
    }

    private void displayHangman() {
        int remainingAttempts = attemptsLeft;
        String[] hangman = {
                " ________      ",
                "|        |     ",
                "|        " + (remainingAttempts < 7 ? "O" : ""),
                "|       " + (remainingAttempts < 6 ? "/" : "") + (remainingAttempts < 5 ? "|" : "") + (remainingAttempts < 4 ? "\\" : ""),
                "|       " + (remainingAttempts < 3 ? "/" : " ") + " " + (remainingAttempts < 2 ? "\\" : ""),
                "|              ",
                "|______        ",
        };
        for (String line : hangman) {
            System.out.println(line);
        }
    }

    private boolean guess(char letter) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                hiddenWord.setCharAt(i, letter);
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.play();
    }
}
