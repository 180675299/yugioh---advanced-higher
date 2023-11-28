import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Rectangle;

public class GameScreen extends JFrame{

    JPanel jPanel = new JPanel();
    Rectangle rectangle = new Rectangle(100, 200);
    String[] chosenColour = new String[] {"white", "black", "blue"};
    
    public GameScreen() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(960, 640);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout());
        panel.add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new PlayingField();
        panel.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        panel.add(bottomPanel, BorderLayout.SOUTH);

        setContentPane(panel);
        setVisible(true);
    }

}