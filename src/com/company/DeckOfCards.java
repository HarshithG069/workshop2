package com.company;

public class DeckOfCards {
    public static void main(String[] args) {

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cards = new String[52];
        int initial = 0, end = 12, k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = initial; j <= end; j++) {
                cards[j] = suit[i] + " " + rank[k];
                k++;

            }
            k = 0;
            initial = end + 1;
            end += 13;
        }


    }
}