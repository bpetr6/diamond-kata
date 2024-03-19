package org.example;

import java.util.ArrayList;

/**
 * Generates a diamond based on a valid starter character [A-Z].
 * The validation mentioned above is done in the main method at the moment,
 * for simplicity of the exercise, and only a happy path is considered.
 */
public class Diamond {

    public static String create(Character c) {

        Character midpoint = Character.toUpperCase(c);

        if(midpoint.equals('A')){
            return "A\n";
        }

        ArrayList<Character> letters = new ArrayList<>();
        for (char current = 'B'; current <= midpoint; current ++){
            letters.add(current);
        }

        /*
        if we visualize it as [A, B]
        1. i = 0, letters(0) = a: First line ('a') has amount of spaces at beginning equal to the distance from b to 'a', in this case 1.
        Spaces in between: 0
        2. i = 1, letters(1) = b: Spaces at beginning: 0. Then letters(1). Spaces in between: 1 (2 * i - 1), Then letters(1).
        .. same for all the letters, except for first and last.
        3. i = 0, letters(0) = a, same reasoning.
        We can go from start to half & then print the other half except for middle part.
         */

        int lettersSize = letters.size() + 1;

        ArrayList<String> firstHalf = new ArrayList<>();
        firstHalf.add(createFirstLine(lettersSize));
        letters.forEach(letter -> firstHalf.add(createLine(lettersSize, letter)));

        return concatenateHalves(firstHalf);
    }


    private static String createFirstLine(int length) {
        int spacesAtBeginning = length - 1;
        return " ".repeat(spacesAtBeginning) + "A" + "\n";

    }

    private static String createLine(int length, char letter) {
        int current = letter - 'A';
        int spacesAtBeginning = length - 1 - current;
        int midSpaces = 2 * (current) - 1;
        return " ".repeat(spacesAtBeginning) + letter + " ".repeat(midSpaces) + letter + "\n";
    }

    private static String concatenateHalves(ArrayList<String> firstHalf) {
        StringBuilder diamond = new StringBuilder();

        for(String line: firstHalf) {
            diamond.append(line);
        }

        for (int i = firstHalf.size() - 2; i >= 0; i--) {
            diamond.append(firstHalf.get(i));
        }

        return diamond.toString();
    }
}
