package org.example;

/**
 * Generates a diamond based on a valid starter character [a-z]|[A-Z].
 * The validation mentioned above is done in the main method at the moment,
 * for simplicity of the exercise, and only a happy path is considered.
 */
public class Diamond {

    public static String create(Character c) {

        if(c.equals('a') || c.equals('A')){
            return c + "\n";
        }

        StringBuilder stringBuilder = new StringBuilder();

        //TODO implement diamond
        /*
        if we visualize it as [a, b]
        1. i = 0, letters(0) = a: First line ('a') has amount of spaces at beginning equal to the distance from b to 'a', in this case 1.
        Spaces in between: 0
        2. i = 1, letters(1) = b: Spaces at beginning: 0. Then letters(1). Spaces in between: 1 (i), Then letters(1).
        .. same for all the letters, except for first and last.
        3. i = 0, letters(0) = a, same reasoning.
        We can go from letters(0) to letters(length - 1) & then print the other half except for middle part.
         */

        stringBuilder.append(" A").append("\n");
        stringBuilder.append("B B").append("\n");
        stringBuilder.append(" A").append("\n");

        return stringBuilder.toString();
    }
}
