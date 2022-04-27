import javax.swing.*;

public class FrontPanel extends JPanel{
    public  FrontPanel() {
        String text = JOptionPane.showInputDialog(this,"please enter your name",
                "Welcome to Jeopardy!!", JOptionPane.OK_CANCEL_OPTION| JOptionPane.PLAIN_MESSAGE);


        int action = JOptionPane.showConfirmDialog(this,"Do you really want to close the application"
        ,"confirm Exit", JOptionPane.OK_CANCEL_OPTION);

        if(action == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }
}
