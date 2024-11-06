import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public int tileSize = 65;

    int cols = 8;
    int rows = 8;

    public Board(){
        this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize));
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r<rows;r++)
            for (int c = 0; c<cols;c++) {
                g2d.setColor((c+r) %2==0 ? new Color(5, 147, 103) : new Color(130, 202, 200));
                g2d.fillRect(c*tileSize,r*tileSize, tileSize,tileSize);
            }
    }
}
