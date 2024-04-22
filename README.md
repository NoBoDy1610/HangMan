# Hangman Game

A simple console-based Hangman game implemented in Java.

## Description

Hangman is a word guessing game where the player tries to guess a hidden word by suggesting letters within a certain number of guesses.

## Features

- Randomly selects a word from a predefined list.
- Allows the player to guess letters until they either guess the word correctly or run out of attempts.
- Displays a simple ASCII art representation of the Hangman.
- Informs the player about the outcome of each guess.

## How to Play

1. Clone the repository to your local machine.
2. Compile the Java source file (`Hangman.java`) using a Java compiler.
3. Run the compiled Java program.
4. Follow the on-screen instructions to play the game.
5. Guess letters to try and reveal the hidden word before running out of attempts.

## Requirements

- Java Development Kit (JDK) installed on your machine.

## Sample Usage

$ javac Hangman.java
$ java Hangman
Welcome to the Hangman game!
Guess a letter: a
Incorrect guess! Attempts left: 6
Current word: ____

| |
|
|
|
|
|______
Guess a letter: e
Correct! You guessed a letter.
Current word: e__
...

## Known Issues

- None at the moment.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, feel free to fork the repository and submit a pull request.

## Author

Nikodem Czubak

## License

This project is licensed under the [MIT License](LICENSE).
