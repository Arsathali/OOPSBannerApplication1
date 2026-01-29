/**
 * OOPSBannerApp UC5 – OOPS Banner Application (Use Case 5)
 *
 * This class extends UC4 by using inline array initialization with String.join()
 * to print the "OOPS" banner in a more concise and readable way.
 * It eliminates the need for separate statements to populate the array.
 *
 * @author Developer
 * @version 5.0
 */

public class OopsBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join() for each banner line
        String[] banner = {
            String.join("", "  *****    *****   *****   *****"),
            String.join("", " *     *  *     *  *     * *     "),
            String.join("", " *     *  *     *  *     * *     "),
            String.join("", " *     *  *     *  *****   ***** "),
            String.join("", " *     *  *     *  *           * "),
            String.join("", " *     *  *     *  *           * "),
            String.join("", "  *****    *****   *       ***** ")
        };

        // Use enhanced for loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }

    }
}
