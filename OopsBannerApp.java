import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – OOPS Banner Application (Use Case 8)
 *
 * This class extends UC7 by using a Map to store character patterns.
 * This allows dynamic lookup and rendering of any word, improving scalability.
 * Output remains visually identical to previous UCs.
 *
 * Author: Developer
 * Version: 8.0
 */

public class OopsBannerApp {

    // Map to store character patterns
    private static final Map<Character, String[]> characterPatterns = new HashMap<>();

    // Static block to initialize patterns
    static {
        characterPatterns.put('O', new String[] {
            "  ***** ",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            " *     *",
            "  ***** "
        });
        characterPatterns.put('P', new String[] {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        });
        characterPatterns.put('S', new String[] {
            "  *****",
            " *     ",
            " *     ",
            "  *****",
            "      *",
            "      *",
            " ***** "
        });
    }

    /**
     * Render a word using the character patterns stored in the Map.
     * @param word the word to render in banner style
     */
    public static void renderBanner(String word) {
        int rows = 7; 
        for (int i = 0; i < rows; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = characterPatterns.get(c);
                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("  "); 
                }
            }
            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {
        String message = "OOPS"; // Word render
        renderBanner(message);
    }
}
