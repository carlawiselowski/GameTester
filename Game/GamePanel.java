package Game;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel{
    
    //screen setting
    int originalPixelSize = 16; // 16x16 tile
    int scale = 3;

    int pixelSize = originalPixelSize * scale; // 48x48 tile
    int maxScreenColun = 16; // tiles horizontally
    int maxSreenRow = 12; // tiles vertically
    int screenWidth = pixelSize * maxScreenColun; // 768 pixals
    int screenHeight = pixelSize * maxSreenRow; // 576 pixels

    //metodo construtor
    public GamePanel() {
        
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //drawing will be done in an offscreen 
                                            //(better rendering performance)
    }

}
