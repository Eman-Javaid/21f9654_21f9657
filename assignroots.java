package root;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class assignroots {
    private static Map<String, String> verseRootsMap = new HashMap<>();
    private static JTextArea verseRootsTextArea;

    public static void main(String[] args) {
        // Your verses and corresponding roots mapping
        verseRootsMap.put("ورد حمر حديقة", "اللون");
        verseRootsMap.put("فتح ألوان شرق", "اللون");
        verseRootsMap.put("عطي رائحة جميل سعد قلب حزن", "الرائحة");

        // Create a simple GUI
        JFrame frame = new JFrame("Verse Roots Assignment");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Display verses and roots in a JTextArea
        verseRootsTextArea = new JTextArea();
        verseRootsTextArea.setEditable(false);
        updateTextArea();

        JScrollPane scrollPane = new JScrollPane(verseRootsTextArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add a button to update the JTextArea
        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTextArea();
            }
        });
        mainPanel.add(updateButton, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    // Update the JTextArea with verses and roots
    private static void updateTextArea() {
        verseRootsTextArea.setText(""); // Clear the existing text

        for (Map.Entry<String, String> entry : verseRootsMap.entrySet()) {
            verseRootsTextArea.append("Verse: " + entry.getKey() + "\nRoot: " + entry.getValue() + "\n\n");
        }
    }
}
