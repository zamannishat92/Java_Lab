package GuiTest;
import javax.swing.*;
import java.awt.*;

public class GUITEST {
    public static void main(String[] args)
    {
        JFrame jf = new JFrame("My Frame");
        //jf.setBackground(Color.BLACK);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocation(50 ,50);
        jf.setSize(400,200);

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.WHITE);
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.YELLOW);

        JLabel jl = new JLabel("setText");
        jl.setBackground(Color.YELLOW);
        JTextField jt = new JTextField(15);
        jp1.add(jl);
        jp1.add(jt);
        jt.setBackground(Color.RED);
        jt.setForeground(Color.BLACK);
        JButton jb1 = new JButton("Button1");
        jb1.setBackground(Color.RED);
        JButton jb2 = new JButton("Button2");
        jb2.setBackground(Color.RED);
        JButton jb3 = new JButton("Button3");
        jb3.setBackground(Color.RED);

        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        JPanel jp3 = new JPanel();
        jp3.add(jp1);
        jp3.add(jp2);
        jf.add(jp3);
        jf.setVisible(true);

    }
}
