import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class scoreT {
    public static JLabel score;

    public static int sum;
    public static  LinkedList<Integer>[] adjListArr;


    public void scoreT(){
        //score = new JLabel("Score: " + test2.sum);
        score.setFont(new Font("Ariel", Font.PLAIN, 20));
        score.setBounds(140, 20, 181, 74);
        score.setVisible(false);
        test.f.getContentPane().add(score);

        //ArrayList<Integer> list = new ArrayList<>();
    }
}
