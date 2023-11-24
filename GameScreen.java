import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen {

    JFrame jFrame = new JFrame();
    JPanel jPanel = new JPanel();

    public GameScreen() {
        this.jFrame.setSize(960, 640);
        this.jFrame.setLocationRelativeTo(null);
        this.jFrame.setVisible(true);
    }



}