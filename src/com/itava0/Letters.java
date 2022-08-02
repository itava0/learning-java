package com.itava0;

public class Letters {
    //Methods
    char[] letters = {'A', 'B', 'A', 'C', 'D', 'D', 'D'};
    int count = countOccurrences(letters, 'A');
    public int countOccurrences(char [] letters, char searchLetter) {
        int count = 0;
        for( char letter : letters) {
            if ( letter == searchLetter) {
                count++;
            }
        }
        return count;
    }
}
