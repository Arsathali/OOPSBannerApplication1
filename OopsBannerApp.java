/**
 * OOPSBannerApp UC4 – OOPS Banner Application (Use Case 4)
 *
 * This class extends UC3 by using a String array and loop to print the "OOPS" banner.
 * It improves code modularity, reusability, and maintainability by avoiding multiple
 * individual print statements.
 *
 * @author Developer
 * @version 4.0
 */

public class OopsBannerApp {

    public static void main(String[] args) {
        // Create an array to store all lines of the "OOPS" banner
        String[] banner = new String[7];

        banner[0] = String.join("", "  *****    *****   *****   *****");
        banner[1] = String.join("", " *     *  *     *  *     * *     ");
        banner[2] = String.join("", " *     *  *     *  *     * *     ");
        banner[3] = String.join("", " *     *  *     *  *****   ***** ");
        banner[4] = String.join("", " *     *  *     *  *           * ");
        banner[5] = String.join("", " *     *  *     *  *           * ");
        banner[6] = String.join("", "  *****    *****   *       ***** ");

        // Use a for-each loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
