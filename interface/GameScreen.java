import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Rectangle;

public class GameScreen extends JFrame{

    Rectangle rectangle = new Rectangle(100, 200);
    public GameScreen() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout());
        panel.add(topPanel, BorderLayout.NORTH);
        
        JPanel centrePanel = new PlayingField();
        panel.add(centrePanel, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel(new FlowLayout());
        panel.add(bottomPanel, BorderLayout.SOUTH);
        
        panel.setBackground(ConstantTerms.megaTronColour);
        setContentPane(panel);
        setVisible(true);
    }

}