/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playerproject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arman
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        // Preload the list with 5 players (you can customize names and numbers)
        players.add(new Player("Player1", 1));
        players.add(new Player("Player2", 2));
        players.add(new Player("Player3", 3));
        players.add(new Player("Player4", 4));
        players.add(new Player("Player5", 5));

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Display all players");
            System.out.println("2. Display players with odd numbers");
            System.out.println("3. Display players with names starting with a specific letter");
            System.out.println("4. Add a new player");
            System.out.println("5. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    displayAllPlayers(players);
                    break;
                case 2:
                    displayPlayersWithOddNumbers(players);
                    break;
                case 3:
                    displayPlayersWithSpecificLetter(players, scanner);
                    break;
                case 4:
                    addNewPlayer(players, scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void displayAllPlayers(ArrayList<Player> players) {
        for (Player player : players) {
            System.out.println("Name: " + player.getName() + ", Number: " + player.getNumber());
        }
    }

    private static void displayPlayersWithOddNumbers(ArrayList<Player> players) {
        for (Player player : players) {
            if (player.getNumber() % 2 != 0) {
                System.out.println("Name: " + player.getName() + ", Number: " + player.getNumber());
            }
        }
    }

    private static void displayPlayersWithSpecificLetter(ArrayList<Player> players, Scanner scanner) {
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        for (Player player : players) {
            if (player.getName().toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                System.out.println("Name: " + player.getName() + ", Number: " + player.getNumber());
            }
        }
    }

    private static void addNewPlayer(ArrayList<Player> players, Scanner scanner) {
        System.out.print("Enter the player's name: ");
        String name = scanner.next();
        System.out.print("Enter the player's number: ");
        int number = scanner.nextInt();

        Player newPlayer = new Player(name, number);
        players.add(newPlayer);
        System.out.println("New player added: " + newPlayer.getName());
    }
}
