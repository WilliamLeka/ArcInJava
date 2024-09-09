import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ArcInJava.InputHandler;

public class GUI extends JPanel {
    static JFrame mainFrame;

    public GUI(InputHandler inputHandler) {
        this.mainFrame  = new JFrame("Game Window");
        mainFrame.getContentPane().setBackground(Color.BLACK);
        mainFrame.add(inputHandler); // adds the input handler to Jframe
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);  // Set the window size


      // Add a dummy panel for testing
      JPanel panel = new JPanel();
      panel.setOpaque(false); // Ensure the panel does not cover the background
      JLabel jlabel = new JLabel("This is a label");
      jlabel.setFont(new Font("Verdana",1,20));
      panel.add(jlabel);
        
      mainFrame.add(panel);
      
      // Make the frame visible
      mainFrame.setVisible(true);
    }

    public void playerStatusBar() {
        JPanel playerstatusPanel = new JPanel();
        playerstatusPanel.setSize(400, 300);
        playerstatusPanel.setBackground(Color.RED);
        playerstatusPanel.setOpaque(true);
        mainFrame.add(playerstatusPanel);

    }
}
