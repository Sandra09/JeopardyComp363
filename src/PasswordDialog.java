import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordDialog extends JDialog {
 private VerifyListener verifyListener;
    private JButton okButton;
    private JPasswordField passwordField;
    public PasswordDialog(JFrame frame){
super(frame, "Password", false);

setSize(400,300);

okButton = new JButton("Enter");
passwordField = new JPasswordField(15);

setLayout(new GridBagLayout());

GridBagConstraints gc = new GridBagConstraints();


gc.gridy=0;
gc.weighty=1;
gc.weightx=1;

        gc.gridx =0;
gc.fill = GridBagConstraints.NONE;

add(new JLabel("Enter Password: "),gc);

        gc.gridy=0;
        gc.weighty=1;
        gc.weightx=1;

        gc.gridx =1;
        gc.fill = GridBagConstraints.NONE;
        add(passwordField,gc);

        gc.gridy=1;
        gc.weighty=0.5;
        gc.weightx=1;

        gc.gridx =1;
        gc.fill = GridBagConstraints.LAST_LINE_END;
add(okButton,gc);


okButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        char[] password = passwordField.getPassword();
        String actualPassword = new String(password);
        verifyListener.checkPassword(actualPassword);
    }
});
    }
    public void setVerifyListener(VerifyListener verifyListener){
        this.verifyListener= verifyListener;
    }
}
