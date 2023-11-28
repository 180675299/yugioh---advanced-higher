import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PlayingField extends JPanel{
    
    public PlayingField() {
        setPreferredSize(new Dimension(960,640));
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(75, 75, 810, 420);
        int y = 0;
        for (int i = 0; i < 10; i++) {
          for (int x = 75; x < 810; x += 50) {
            g2.drawRect(x, y, 50, 100);
          }
          y = y + 50;
        }
    }
    
}
