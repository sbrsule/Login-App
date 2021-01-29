import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.io.PrintWriter;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class RegisterPage extends JFrame implements ActionListener {
    
    JFrame registerPage = new JFrame();
    ImageIcon imagei = new ImageIcon("door-key.png");
    JButton createLogin = new JButton();
    JButton backButton = new JButton();
    JTextField usernameInput;
    JTextField passwordInput1;
    JTextField passwordInput2;
    JLabel usernameLabel = new JLabel();
    JLabel passwordLabel1 = new JLabel();
    JLabel passwordReq = new JLabel();
    JLabel passwordLabel2 = new JLabel();

    RegisterPage(){
        usernameInput = new JTextField();
        usernameInput.setBounds(75, 60, 240, 30);

        usernameLabel.setText("Create Username");
        usernameLabel.setBounds(85, 30, 200, 30);

        passwordInput1 = new JTextField();
        passwordInput1.setBounds(75, 150, 240, 30);

        passwordLabel1.setText("Create Password");
        passwordLabel1.setBounds(85, 105, 240, 30);

        passwordReq.setText("(Must be atleast 8 characters)");
        passwordReq.setBounds(85, 120, 240, 30);

        passwordInput2 = new JTextField();
        passwordInput2.setBounds(75, 210, 240, 30);

        passwordLabel2.setText("Re-enter your password");
        passwordLabel2.setBounds(85, 180, 200, 30);

        createLogin.setBounds(130, 300, 130, 30);
        createLogin.setFocusable(false);
        createLogin.addActionListener(this);
        createLogin.setText("Create Account");

        backButton.setBounds(145, 340, 100, 30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        backButton.setText("Back");

        registerPage.setTitle("Login System");
        registerPage.setIconImage(imagei.getImage());
        registerPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerPage.add(usernameInput);
        registerPage.add(passwordInput1);
        registerPage.add(passwordInput2);
        registerPage.add(usernameLabel);
        registerPage.add(passwordLabel1);
        registerPage.add(passwordReq);
        registerPage.add(passwordLabel2);
        registerPage.add(createLogin);
        registerPage.add(backButton);
        registerPage.setSize(400,500);
        registerPage.setLayout(null);
        registerPage.setVisible(true);
        registerPage.setResizable(false);
        registerPage.setLocationRelativeTo(null);
    }
    @Override 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton) {
            registerPage.dispose();
            LaunchPage launchPage = new LaunchPage();
        }
        
        if(e.getSource() == createLogin) {
            String password_input = passwordInput1.getText();
            if((password_input.equals(passwordInput2.getText())) && (password_input.length() >= 8)) {
                System.out.println("Your password is valid!");
            }
            else if(password_input.equals(passwordInput2.getText()) == false) {
                System.out.println("Your passwords don't match, please try again!");
            }
            else if(password_input.length() < 8) {
                System.out.println("Your password isn't long enough!");
            }
                
            }
        }
    }


