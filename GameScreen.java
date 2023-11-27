import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;

public class GameScreen extends JFrame{

    JPanel jPanel = new JPanel();
    
    public GameScreen() {
        this.jPanel.setLayout(new BorderLayout());
        this.jPanel.add(new Button("OPPONENT HAND"), BorderLayout.NORTH);
        this.jPanel.add(new Button("PLAYER HAND"), BorderLayout.SOUTH);
        this.jPanel.add(new Button("PLAYING FIELD"), BorderLayout.CENTER);
        this.jPanel.add(new Button("PLAYER LIFEPOINT"), BorderLayout.WEST);
        this.jPanel.add(new Button("OPPONENT LIFEPOINT"), BorderLayout.EAST);

        add(jPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(960, 640);
        setLocationRelativeTo(null);
        setVisible(true);
    }



}