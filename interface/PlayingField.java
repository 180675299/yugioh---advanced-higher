import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PlayingField extends JPanel{
    
  public PlayingField() {
      setPreferredSize(new Dimension(1920,1080));
  }

  public void paintComponent(Graphics g) {
    int borderWidth = 1920;
    int borderHeight = 1080;
    int startX = 100;
    int startY = 100;
    Graphics2D g2 = (Graphics2D) g;
    g2.drawRect(1, 0, borderWidth-(1025),borderHeight-(308));
    int y = 25;
    int x = 25;
    for(int j = 0; j < 4; j++) {
       for (int i = 0; i < 7; i++) {
          if (j == 0 || j == 3){
            g2.setColor(Color.BLUE);
          } else {
            g2.setColor(Color.RED);
          }
          g2.drawRect(x, y, 100, 150);
          x = x + 125;
        }
        x = 25;
        y = y + 175;
      if(j == 1) {
        x = 25;
        y = y + 225;

      } 
    }
  }
}