import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class test implements ActionListener {
    public static void main(String[] args) {
        intro();
    }

    public static JFrame f;

    public static JLabel score;
    public static JButton b;
    public static JButton s4;
    public static JButton s3;

    public static JButton s2;
    public static JButton s1;



    public static void intro(){
         f=new JFrame("Button Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(null);
        f.setVisible(true);

        JPanel p = new JPanel();

        JLabel sports = new JLabel("Sports");
        sports.setFont(new Font("Ariel", Font.PLAIN, 15));
        sports.setBounds(45,60,95,30);
        f.getContentPane().add(sports);
        sports.setVisible(true);

        JLabel Music = new JLabel("Music");
        Music.setFont(new Font("Ariel", Font.PLAIN, 15));
        Music.setBounds(150,60,95,30);
        f.getContentPane().add(Music);
        Music.setVisible(true);

        JLabel Celebraties = new JLabel("Celebraties");
        Celebraties.setFont(new Font("Ariel", Font.PLAIN, 15));
        Celebraties.setBounds(240,60,95,30);
        f.getContentPane().add(Celebraties);
        Celebraties.setVisible(true);

        JLabel Movies = new JLabel("Movies");
        Movies.setFont(new Font("Ariel", Font.PLAIN, 15));
        Movies.setBounds(360,60,95,30);
        f.getContentPane().add(Movies);
        Movies.setVisible(true);

        score = new JLabel("Score: " + scoreT.sum);
        score.setFont(new Font("Ariel", Font.PLAIN, 15));
        score.setBounds(240,30,95,30);
        f.getContentPane().add(score);
        score.setVisible(true);


        b=new JButton("500");
        b.setBounds(20,100,95,30);
        f.getContentPane().add(b);
        p.add(b);
        b.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b) {
                    f.setVisible(false);
                    p.remove(b);
                    f.dispose();
                    test2 w2 = new test2();
                    w2.sport5(500);
                }

            }
        });

        s4 =new JButton("400");
        s4.setBounds(20,130,95,30);
        f.getContentPane().add(s4);
        //p.add(s4);
        s4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==s4) {
                    f.setVisible(false);
                    //p.remove(s4);
                    f.dispose();
                    test2 w2 = new test2();
                    w2.sport5(400);
                }

            }
        });

        s3 =new JButton("300");
        s3.setBounds(20,160,95,30);
        f.getContentPane().add(s3);
        s3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==s3) {
                    f.setVisible(false);
                    f.dispose();
                    test2 w2 = new test2();
                    w2.sport5(300);
                }

            }
        });

        s2 =new JButton("200");
        s2.setBounds(20,190,95,30);
        f.getContentPane().add(s2);
        s2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==s2) {
                    f.setVisible(false);
                    f.dispose();
                    test2 w2 = new test2();
                    w2.sport5(200);
                }

            }
        });

        s1 =new JButton("100");
        s1.setBounds(20,220,95,30);
        f.getContentPane().add(s1);
        s1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==s1) {
                    f.setVisible(false);
                    f.dispose();
                    test2 w2 = new test2();
                    w2.sport5(100);
                }

            }
        });

        JButton m5=new JButton("500");
        m5.setBounds(120,100,95,30);
        f.getContentPane().add(m5);
        m5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                test2 w2 = new test2();
                w2.music(500);
            }
        });

        JButton m4 =new JButton("400");
        m4.setBounds(120,130,95,30);
        f.getContentPane().add(m4);
        m4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                test2 w2 = new test2();
                w2.music(400);
            }
        });

        JButton m3 =new JButton("300");
        m3.setBounds(120,160,95,30);
        f.getContentPane().add(m3);
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                test2 w2 = new test2();
                w2.music(300);
            }
        });

        JButton m2 =new JButton("200");
        m2.setBounds(120,190,95,30);
        f.getContentPane().add(m2);
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                test2 w2 = new test2();
                w2.music(200);
            }
        });


        JButton m1 =new JButton("100");
        m1.setBounds(120,220,95,30);
        f.getContentPane().add(m1);
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                test2 w2 = new test2();
                w2.music(100);
            }
        });

        JButton c5=new JButton("500");
        c5.setBounds(225,100,95,30);
        f.getContentPane().add(c5);

        JButton c4 =new JButton("400");
        c4.setBounds(225,130,95,30);
        f.getContentPane().add(c4);

        JButton c3 =new JButton("300");
        c3.setBounds(225,160,95,30);
        f.getContentPane().add(c3);

        JButton c2 =new JButton("200");
        c2.setBounds(225,190,95,30);
        f.getContentPane().add(c2);

        JButton c1 =new JButton("100");
        c1.setBounds(225,220,95,30);
        f.getContentPane().add(c1);

        JButton mu5=new JButton("500");
        mu5.setBounds(335,100,95,30);
        f.getContentPane().add(mu5);

        JButton mu4 =new JButton("400");
        mu4.setBounds(335,130,95,30);
        f.getContentPane().add(mu4);

        JButton mu3 =new JButton("300");
        mu3.setBounds(335,160,95,30);
        f.getContentPane().add(mu3);

        JButton mu2 =new JButton("200");
        mu2.setBounds(335,190,95,30);
        f.getContentPane().add(mu2);

        JButton mu1 =new JButton("100");
        mu1.setBounds(335,220,95,30);
        f.getContentPane().add(mu1);

        JButton end=new JButton("end");
        end.setBounds(335,270,95,30);
        f.getContentPane().add(end);
        end.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f.dispose();
                finalp finalW = new finalp();
                finalW.finalPage();
            }
        });

        /*JButton c=new JButton("400");
        c.setBounds(20,130,95,30);
        JButton d=new JButton("300");
        d.setBounds(20,60,95,30);
        JButton e=new JButton("200");
        e.setBounds(20,40,95,30);
        JButton g=new JButton("100");
        g.setBounds(20,20,95,30);*/

        f.add(b);
        //f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==b){

        }
    }
}
