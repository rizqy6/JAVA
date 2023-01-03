
import java.awt.*;
import javax.swing.*;


public class FrameA extends javax.swing.JFrame{
    public FrameA(){
        super ("Frame dan Button");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        FrameA fa = new FrameA();
        Container kontainer = fa.getContentPane();
        JButton jbtkOK = new JButton("OK");
        kontainer.add(jbtkOK);
    }
}
