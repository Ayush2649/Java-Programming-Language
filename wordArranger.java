import java.util.*;

public class wordArranger {

    // Function to calculate the maximum number of words that can be arranged
    public static int arrangeWordsInLines(List<String> words, int maxLines, int maxCharsPerLine) {
        int currentLineLength = 0;  // current length of the line
        int currentLineCount = 1;    // starts from the first line
        int totalWordsArranged = 0;  // total number of words arranged

        for (String word : words) {
            int wordLength = word.length();

            // If the word fits in the current line
            if (currentLineLength + wordLength <= maxCharsPerLine) {
                if (currentLineLength > 0) {  // If it's not the first word, add a space
                    currentLineLength += 1;
                }
                currentLineLength += wordLength;  // Add the word to the current line
                totalWordsArranged += 1;  // Increment the number of words placed
            } else {
                // If the word doesn't fit, move to the next line
                currentLineCount += 1;
                if (currentLineCount > maxLines) {  // Stop if lines exceed maxLines
                    break;
                }
                currentLineLength = wordLength;  // Start the new line with this word
                totalWordsArranged += 1;  // Increment the number of words placed
            }
        }

        return totalWordsArranged;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of words
        int numWords = Integer.parseInt(scanner.nextLine());
        
        // Input: the list of words
        List<String> words = new ArrayList<>();
        for (int i = 0; i < numWords; i++) {
            words.add(scanner.nextLine().strip());
        }

        // Input: max lines and max characters per line
        String[] lineConstraints = scanner.nextLine().split(" ");
        int maxLines = Integer.parseInt(lineConstraints[0]);
        int maxCharsPerLine = Integer.parseInt(lineConstraints[1]);

        // Call the function to arrange words and get the result
        int result = arrangeWordsInLines(words, maxLines, maxCharsPerLine);

        // Output: Print the total number of words arranged
        System.out.println(result);

        scanner.close();
    }
}
