package com.pluralsight;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            //create a BufferedReader
            BufferedReader br1 = new BufferedReader(new FileReader("goldilocks.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("hansel_and_gretel.txt"));
            BufferedReader br3 = new BufferedReader(new FileReader("mary_had_a_little_lamb.txt"));

            System.out.println("\n+----------------------------------------+");
            System.out.println("|           bedtime stories              |");
            System.out.println("+----------------------------------------+");
            System.out.println("|  [1] Goldilocks                        |");
            System.out.println("|  [2] Hansel and Gretel                 |");
            System.out.println("|  [3] Mary had a little lamb            |");
            System.out.println("+----------------------------------------+");

            int selection = Console.promptForInt("Select a story to read (1-3): ");

            String input;

            switch (selection) {
                case 1 -> {
                    for (int lineNumber = 1; (input = br1.readLine()) != null; lineNumber++) {
                        System.out.printf("\n%d. %s", lineNumber, input);
                    }
                }
                case 2 -> {
                    for (int lineNumber = 1; (input = br2.readLine()) != null; lineNumber++) {
                        System.out.printf("\n%d. %s", lineNumber, input);
                    }
                }
                case 3 -> {
                    for (int lineNumber = 1; (input = br3.readLine()) != null; lineNumber++) {
                        System.out.printf("\n%d. %s", lineNumber, input);
                    }
                }
                default -> System.out.println("Please select a valid number.");
            }

            br1.close();
            br2.close();
            br3.close();
        } catch (IOException e) {
            //display en error
            e.printStackTrace();
        }
    }
}
