package Game;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel{
    
    //screen setting
    int originalPixelSize = 16; // 16x16 tile
    int scale = 3;
    int raius = 300;

    int pixelSize = originalPixelSize * scale; // 48x48 tile
    int maxScreenColun = 16; // tiles horizontally
    int maxScreenRow = 12; // tiles vertically
    int screenWidth = pixelSize * maxScreenColun; // 768 pixals
    int screenHeight = pixelSize * maxScreenRow; // 576 pixels

    //metodo construtor
    public GamePanel() {
        
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //drawing will be done in an offscreen 
                                            //(better rendering performance)
        }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.setColor(new Color(160,82,45)); //brown - sienna 
        g.setColor(Color.blue);
        g.fillRect(0, 0, screenWidth, screenHeight/2);
        //x = 768/2 - 150 | y= 576/2 - 150 | diametro = 300
        g.setColor(Color.yellow);
        g.fillOval(230, 140, 300, 300);


    }

}
