import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;

public class Toolbar extends JPanel {
 private JLabel scores;
     JLabel scoreField;
    public Toolbar(){
        scores = new JLabel("Scores: ");
        scoreField = new JLabel("0");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(scores);
        add(scoreField);
    }

}
