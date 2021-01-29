import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JComponent;
public class Main {

    public static void main(String[] args) {


        /**JButton registerButton = new JButton();
        registerButton.setText("Register");
        registerButton.setFocusable(false);
        registerButton.addActionListener(e -> System.out.println("poo"));

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        firstPanel.add(registerButton);
        firstPanel.add(LaunchPage());

        JLabel firstLabel = new JLabel();
        firstLabel.setText("This is a login system");
        firstLabel.setHorizontalAlignment(JLabel.CENTER);
        firstLabel.setVerticalAlignment(JLabel.TOP);
        firstLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        

        JFrame firstFrame = new Frame(); 
        firstFrame.setSize(350,200);
        firstFrame.setLocationRelativeTo(null);
        firstFrame.setLayout(new FlowLayout());
        firstFrame.add(firstLabel);
        firstFrame.add(firstPanel);
        firstFrame.setVisible(true);

        JFrame secondFrame = new Frame(); 
        secondFrame.setSize(350,200);
        secondFrame.setLocationRelativeTo(null);
        secondFrame.setLayout(new FlowLayout());
        secondFrame.add(firstLabel);
        secondFrame.add(firstPanel);
        secondFrame.setVisible(false);
        */
        LaunchPage launchPage = new LaunchPage();
    }
}
