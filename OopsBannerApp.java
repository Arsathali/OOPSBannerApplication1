/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This class refactors UC5 by defining static helper methods to generate
 * banner patterns for each character (O, P, S) and uses them to assemble
 * the full "OOPS" banner in a modular, reusable way.
 *
 * @author Developer
 * @version 6.0
 */

public class OopsBannerApp {

    public static void main(String[] args) {

         // Build the banner using helper methods
        String[] banner = new String[7];

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble banner line by line
        for (int i = 0; i < 7; i++) {
            banner[i] = oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i];
        }

        // Printing the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
     // Helper method for letter O
    private static String[] getOPattern() {
        return new String[] {
            "  ***** ",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            "  ***** "
        };
    }

    // Helper method for letter P
    private static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    // Helper method for letter S
    private static String[] getSPattern() {
        return new String[] {
            "  *****",
            " *     ",
            " *     ",
            "  *****",
            "      *",
            "      *",
            " ***** "
        };
    }
}
