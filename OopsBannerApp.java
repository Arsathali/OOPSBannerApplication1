/**
 * OOPSBannerApp UC7 – OOPS Banner Application (Use Case 7)
 *
 * This class refactors UC6 by introducing a CharacterPattern inner static class
 * that encapsulates each character and its banner pattern.
 * This approach improves modularity, reusability, and scalability for managing multiple characters.
 *
 * @author Developer
 * @version 7.0
 */
public class OopsBannerApp {

    // Inner static class to store character and its 7-line banner pattern
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize the character and its banner pattern
         *
         * @param character the character represented
         * @param pattern the 7-line banner pattern of the character
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for the pattern
         *
         * @return String array of the character's banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }

        /**
         * Getter for the character
         *
         * @return the character
         */
        public char getCharacter() {
            return character;
        }
    }

    /**
     * Utility method to create CharacterPattern for O
     */
    private static CharacterPattern createO() {
        return new CharacterPattern('O', new String[] {
            "  ***** ",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            "  ***** "
        });
    }

    /**
     * Utility method to create CharacterPattern for P
     */
    private static CharacterPattern createP() {
        return new CharacterPattern('P', new String[] {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        });
    }

    /**
     * Utility method to create CharacterPattern for S
     */
    private static CharacterPattern createS() {
        return new CharacterPattern('S', new String[] {
            "  *****",
            " *     ",
            " *     ",
            "  *****",
            "      *",
            "      *",
            " ***** "
        });
    }

    public static void main(String[] args) {
        // Create CharacterPattern objects
        CharacterPattern O = createO();
        CharacterPattern P = createP();
        CharacterPattern S = createS();

        // Assemble the banner using the character objects
        String[] banner = new String[7];
        for (int i = 0; i < 7; i++) {
            banner[i] = O.getPattern()[i] + "  " + O.getPattern()[i] + "  " +
                        P.getPattern()[i] + "  " + S.getPattern()[i];
        }

        // Print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
