package ArcInJava;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class InputHandler extends JPanel implements KeyListener {

    public char input;

    public InputHandler() {
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    public void takeInput() {
        // Implement your input handling logic here
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        int keycode = arg0.getKeyCode();

        switch (keycode) {
            case KeyEvent.VK_W:
                input = 'W';
                System.out.println("W key pressed");
                break;
            case KeyEvent.VK_A:
                input = 'A';
                System.out.println("A key pressed");
                break;
            case KeyEvent.VK_S:
                input = 'S';
                System.out.println("S key pressed");
                break;
            case KeyEvent.VK_D:
                input = 'D';
                System.out.println("D key pressed");
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        int keycode = arg0.getKeyCode();

        switch (keycode) {
            case KeyEvent.VK_W:
                System.out.println("W key released");
                break;
            case KeyEvent.VK_A:
                System.out.println("A key released");
                break;
            case KeyEvent.VK_S:
                System.out.println("S key released");
                break;
            case KeyEvent.VK_D:
                System.out.println("D key released");
                break;
            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // Handle key typed events if needed
    }
}
