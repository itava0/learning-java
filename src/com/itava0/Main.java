package com.itava0;
public class Main {
    public static void main(String[] args) {
        //Methods
        char[] letters = {'A', 'B', 'A', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'A');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter) {
        int count = 0;
        for( char letter : letters) {
            if ( letter == searchLetter) {
                count++;
            }
        }
        return count;
    }
}
