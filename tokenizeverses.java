package root;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class tokenizeverses {
    private static String[] verses = {
            "ورد حمر حديقة",
            "فتح ألوان شرق",
            "عطي رائحة جميل سعد قلب حزن"
    };

    public static void main(String[] args) {
        // Create a simple GUI
        JFrame frame = new JFrame("Tokenize Verses");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Display verses and tokenized words in a JTextArea
        JTextArea tokenizedVersesTextArea = new JTextArea();
        tokenizedVersesTextArea.setEditable(false);
        mainPanel.add(new JScrollPane(tokenizedVersesTextArea), BorderLayout.CENTER);

        // Add a button to tokenize and update the JTextArea
        JButton tokenizeButton = new JButton("Tokenize");
        tokenizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tokenizeVerses(tokenizedVersesTextArea);
            }
        });
        mainPanel.add(tokenizeButton, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // Tokenize the verses and update the JTextArea
    private static void tokenizeVerses(JTextArea textArea) {
        textArea.setText(""); // Clear the existing text

        for (String verse : verses) {
            StringTokenizer tokenizer = new StringTokenizer(verse, " ");
            textArea.append("Verse: " + verse + "\nTokenized Words:\n");

            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                textArea.append(token + "\n");
            }

            textArea.append("\n");
        }
    }
}
