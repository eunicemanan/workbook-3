package com.pluralsight;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] favoriteQuotes = {
                "No one can make you feel inferior without your consent.",
                "For our own success to be real, it must contribute to the success of others. ",
                "A woman is like a tea bag - you can't tell how strong she is until you put her in hot water. ",
                "Let all that you do be done in love",
                "To be loved is to be seen",
                "Embrace the pain of letting go",
                "Sometimes things have to fall apart to make way for better things. - HIMYM!",
                "Some day you will be old enough to start reading fairy tales again.",
                "We come to love not by finding a perfect person, but by learning to see an imperfect peron perfectly.",
                "Love is patient, love is kind."
        };
        while (true) {
            try {
                System.out.println("Select a number between 1 - 10. RIGHT NOW.");
                int number = input.nextInt();

                if (number < 1 || number > 10) {
                    System.out.println("\nQuote " + number + ": " + favoriteQuotes[number]);
                    continue;
            }
                number --;
                 System.out.println("\nQuote " + (number+1) + ": " + favoriteQuotes[number]);
                return;
            }   catch (Exception e) {
                    System.out.println("WHAT THE FLIP. THAT ISN'T A NUMBER BETWEEN 1 - 10 >:( !!");
        }           input.nextLine();
    }
}
}