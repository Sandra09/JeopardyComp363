import javax.swing.*;
import java.awt.*;

public class finalp {
    public void finalPage(){
        JFrame finalp=new JFrame("end");
        finalp.setBounds(100,100,467,315);
        finalp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finalp.getContentPane().setLayout(null);
        finalp.setVisible(true);


        JLabel showScore = new JLabel(LLS.sortAP());
        showScore.setFont(new Font("Ariel", Font.PLAIN, 20));
        showScore.setBounds(140,20,181,74);
        showScore.setVisible(true);
        finalp.getContentPane().add(showScore);




    }



}
