package add;
	import javax.swing.*;

	public class addpoem {
	    public static void main(String[] args) {
	        // Your Arabic poem text
	        String poem = "وردة حمراء في الحديقة\nتفتحت بألوان مشرقة\nتعطي رائحة جميلة\nتسعد القلب الحزين";

	        // Create a simple GUI
	        JFrame frame = new JFrame("Poem GUI");
	        JTextArea poemTextArea = new JTextArea(poem);
	        poemTextArea.setEditable(false);
	        JScrollPane scrollPane = new JScrollPane(poemTextArea);
	        frame.getContentPane().add(scrollPane);

	        // Set frame properties
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

