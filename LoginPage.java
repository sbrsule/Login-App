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

public class LoginPage extends JFrame implements ActionListener {
    JFrame login = new JFrame();
    ImageIcon image = new ImageIcon("door-key.png");
    JLabel usernameLabel = new JLabel();
    JLabel passwordLabel = new JLabel();
    JButton enterLogin = new JButton();
    JButton backButton = new JButton();
    JTextField usernameInput;
    JTextField passwordInput;
       
    LoginPage(){
        usernameInput = new JTextField();
        usernameInput.setBounds(75, 60, 240, 30);

        usernameLabel.setText("USERNAME");
        usernameLabel.setBounds(85, 30, 200, 30);

        passwordInput = new JTextField();
        passwordInput.setBounds(75, 120, 240, 30);

        passwordLabel.setText("PASSWORD");
        passwordLabel.setBounds(85, 90, 200, 30);

        enterLogin.setBounds(145, 170, 100, 30);
        enterLogin.setFocusable(false);
        enterLogin.addActionListener(this);
        enterLogin.setText("Login");

        backButton.setBounds(145, 210, 100, 30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        backButton.setText("Back");

        login.setTitle("Login System");
        login.setIconImage(image.getImage());
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(400,300);
        login.setLayout(null);
        login.add(usernameInput);
        login.add(usernameLabel);
        login.add(passwordInput);
        login.add(passwordLabel);
        login.add(enterLogin);
        login.add(backButton);
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
    }

    public static void checkLogin(String user, String pass){
        System.out.println("Your username is: " + user);
        System.out.println("Your password is: " + pass); 
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enterLogin) {
            checkLogin(usernameInput.getText(), passwordInput.getText());
        }
        if(e.getSource() == backButton) {
            login.dispose();
            LaunchPage launchPage = new LaunchPage();
        }
    }
}

