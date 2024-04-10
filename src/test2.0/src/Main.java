import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Point;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Main {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        PointerInfo a = MouseInfo.getPointerInfo();
        Point mouse = a.getLocation(); //mouse.getX() or .getY()
        JFrame frame = new JFrame("My first JFrame");
        frame.setSize(900, 900);
        JLabel label = new JLabel();
        // JLabel label2 = new JLabel();
        label.setIcon(new ImageIcon(new ImageIcon("src/YAY.png").getImage().getScaledInstance((int) screenSize.getWidth(), (int) screenSize.getHeight(), Image.SCALE_SMOOTH)));
        //label.setIcon(new ImageIcon(new ImageIcon("src/Play.png").getImage().getScaledInstance((int)screenSize.getWidth(), (int)screenSize.getHeight(), Image.SCALE_SMOOTH)));
        frame.add(label);
        // frame.add(label2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
