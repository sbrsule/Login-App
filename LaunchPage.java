import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JLabel;
import java.awt.Font;

public class LaunchPage extends JFrame implements ActionListener{

    JButton loginButton = new JButton();
    JButton registerButton = new JButton();
    JFrame firstPage = new JFrame();
    JLabel firstLabel = new JLabel();
    ImageIcon imagei = new ImageIcon("door-key.png");

    LaunchPage(){
        loginButton.setBounds(90,160,200,40);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        loginButton.setText("Login");

        registerButton.setBounds(90, 240, 200, 40);
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);
        registerButton.setText("Register");

        firstLabel.setText("This is a login system");
        firstLabel.setBounds(100, 100, 200, 40);
        firstLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        firstPage.add(loginButton);
        firstPage.add(registerButton);
        firstPage.add(firstLabel);
        firstPage.setTitle("Login System");
        firstPage.setIconImage(imagei.getImage());
        firstPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstPage.setSize(400,500);
        firstPage.setLayout(null);
        firstPage.setVisible(true);
        firstPage.setResizable(false);
        firstPage.setLocationRelativeTo(null);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton) {
            firstPage.dispose();
            LoginPage login_page = new LoginPage();
        }
        if(e.getSource() == registerButton) {
            firstPage.dispose();
            RegisterPage register_page = new RegisterPage();
        }
    }

}
