package Game;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();

        //creating a window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D ursinhos");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack(); // to be sized to fit the preferred size

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    
    }

}
