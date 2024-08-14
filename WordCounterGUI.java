
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterGUI {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create a text area for user input
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 10, 360, 150);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        frame.add(textArea);

        // Create a button to trigger the word count
        JButton countButton = new JButton("Count Words");
        countButton.setBounds(10, 170, 150, 30);
        frame.add(countButton);

        // Create a label to display the word count
        JLabel resultLabel = new JLabel("Number of words: 0");
        resultLabel.setBounds(10, 210, 360, 30);
        frame.add(resultLabel);

        // Add an action listener to the button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the text area
                String input = textArea.getText();
                // Count the words
                int wordCount = countWords(input);
                // Update the label with the word count
                resultLabel.setText("Number of words: " + wordCount);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    /**
     * Counts the number of words in a given string.
     *
     * @param input The string to count words in
     * @return The number of words in the string
     */
    private static int countWords(String input) {
        // Trim the input to remove any leading or trailing whitespace
        String trimmedInput = input.trim();
        
        // Check if the input is empty
        if (trimmedInput.isEmpty()) {
            return 0;
        }
        
        // Split the input by whitespace characters
        String[] words = trimmedInput.split("\\s+");
        
        // The length of the array gives the number of words
        return words.length;
    }
}
