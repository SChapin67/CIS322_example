import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Exploration Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // add the game to the frame
            // pack the frame
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
