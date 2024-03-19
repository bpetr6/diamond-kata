package org.example;

import java.util.ArrayList;

/**
 * Generates a diamond based on a valid starter character [A-Z].
 * The validation mentioned above is done in the main method at the moment,
 * for simplicity of the exercise, and only a happy path is considered.
 */
public class Diamond {

    private static String createFirstLine(int length) {
        int spacesAtBeginning = length - 1;
        return " ".repeat(spacesAtBeginning) + "A" + "\n";

    }

    private static String createLine(int length, int current, char c) {
        int spacesAtBeginning = length - 1 - current;
        return " ".repeat(spacesAtBeginning) + c + " ".repeat(current) + c + "\n";
    }

    public static String create(Character midpoint) {

        if(midpoint.equals('a') || midpoint.equals('A')){
            return "A\n";
        }

        ArrayList<Character> letters = new ArrayList<>();
        for (char current = 'A'; current <= midpoint; current ++){
            letters.add(current);
        }

        //TODO implement diamond
        /*
        if we visualize it as [A, B]
        1. i = 0, letters(0) = a: First line ('a') has amount of spaces at beginning equal to the distance from b to 'a', in this case 1.
        Spaces in between: 0
        2. i = 1, letters(1) = b: Spaces at beginning: 0. Then letters(1). Spaces in between: 1 (i), Then letters(1).
        .. same for all the letters, except for first and last.
        3. i = 0, letters(0) = a, same reasoning.
        We can go from letters(0) to letters(length - 1) & then print the other half except for middle part.
         */

        return createFirstLine(letters.size())
                + createLine(letters.size(), 1, letters.get(1))
                + createFirstLine(letters.size());

    }


}
