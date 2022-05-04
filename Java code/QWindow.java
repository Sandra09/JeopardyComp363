import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class QWindow {

    public static void main(String[] args) {

    }

    private JLabel label;

    public void sport5(int points){
        test.score.setVisible(true);

        JFrame f=new JFrame("Question");
        f.setBounds(100,100,467,315);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(null);
        f.setVisible(true);

        JLabel l = new JLabel(sprtsHash.sportH(points));
        l.setFont(new Font("Ariel", Font.PLAIN, 10));
        l.setBounds(140,50,300,74);
        f.getContentPane().add(l);

        JLabel h = new JLabel("Correct!");
        h.setFont(new Font("Ariel", Font.PLAIN, 20));
        h.setBounds(140,20,181,74);
        h.setVisible(false);
        f.getContentPane().add(h);

        JLabel wrong = new JLabel("Wrong:(");
        wrong.setFont(new Font("Ariel", Font.PLAIN, 20));
        wrong.setBounds(140,20,181,74);
        wrong.setVisible(false);
        f.getContentPane().add(wrong);

        label = new JLabel("Score: " + scoreT.sum);
        label.setFont(new Font("Ariel", Font.PLAIN, 15));
        label.setBounds(260,-20,181,74);
        label.setVisible(true);
        f.getContentPane().add(label);


        JTextField userText = new JTextField(20);
        userText.setBounds(140,110,165,25);
        f.add(userText);

        JButton a = new JButton("Back");
        a.setBounds(20,130,95,30);
        f.getContentPane().add(a);
        a.setVisible(false);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user =userText.getText();
                if (e.getSource() == a && user.equals(sprtsHash.sportHA(500))) {
                    f.setVisible(false);
                    f.dispose();
                    test w3 = new test();
                    w3.intro();
                    test.b.setVisible(false);

                }else if(e.getSource() == a && user.equals(sprtsHash.sportHA(400))){
                    f.setVisible(false);
                    f.dispose();
                    test w3 = new test();
                    w3.intro();
                    test.s4.setVisible(false);
                }else if(e.getSource() == a && user.equals(sprtsHash.sportHA(300))){
                    f.setVisible(false);
                    f.dispose();
                    test w3 = new test();
                    w3.intro();
                    test.s3.setVisible(false);
                }else if(e.getSource() == a && user.equals(sprtsHash.sportHA(200))){
                    f.setVisible(false);
                    f.dispose();
                    test w3 = new test();
                    w3.intro();
                    test.s2.setVisible(false);
                }else if(e.getSource() == a && user.equals(sprtsHash.sportHA(100))){
                    f.setVisible(false);
                    f.dispose();
                    test w3 = new test();
                    w3.intro();
                    test.s1.setVisible(false);
                }else{
                    f.setVisible(false);
                    f.dispose();
                    test w3 = new test();
                    w3.intro();
                }
                if(e.getSource()==a ){


                }
            }
        });



       /* JLabel s = new JLabel(String.valueOf(sum));
        s.setFont(new Font("Ariel", Font.PLAIN, 15));
        s.setBounds(360,-20,181,74);
        s.setVisible(true);
        f.getContentPane().add(s);*/


        JButton b=new JButton("Submit");
        b.setBounds(20,100,95,30);
        f.getContentPane().add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user =userText.getText().toLowerCase();
                if(e.getSource() ==b && user.equals(sprtsHash.sportHA(points))){
                    scoreT.sum = scoreT.sum + points;
                    LLS.count++;
                    LLS.arr[LLS.count]=points;
                    System.out.println(Arrays.toString(LLS.arr));
                    label.setText("Score: " + scoreT.sum);
                }
                if(e.getSource()==b) {
                    if(user.equals(sprtsHash.sportHA(points))) {
                        Score.points(points);
                        h.setVisible(true);
                        a.setVisible(true);
                    }else{
                        wrong.setVisible(true);
                        a.setVisible(true);
                    }
                }

            }
        });


        f.setVisible(true);
    }
}
