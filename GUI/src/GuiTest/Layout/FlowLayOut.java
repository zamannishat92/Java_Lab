package GuiTest.Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayOut {
    JFrame f;

    FlowLayOut() {
        f = new JFrame("My Frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setSize(200, 200);

        JButton jb1 = new JButton("B1");
        JButton jb2 = new JButton("Test 2");
        JButton jb3 = new JButton("B3");
        JButton jb4 = new JButton("B4");
        JButton jb5 = new JButton("B5");
        JButton jb6 = new JButton("B6");
        JButton jb7 = new JButton("B7");
        JButton jb8 = new JButton("B8");
        JButton jb9 = new JButton("Last 9");
        f.add(jb1);
        f.add(jb2);
        f.add(jb3);
        f.add(jb4);
        f.add(jb5);
        f.add(jb6);
        f.add(jb7);
        f.add(jb8);
        f.add(jb9);
        JPanel jp = new JPanel();
        jp.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        jp.setLayout(new FlowLayout(FlowLayout.LEADING));
        jp.setPreferredSize(new Dimension(150,50));
        JLabel l1 = new JLabel("Label1");
        JLabel l2 = new JLabel("Label2");
        jp.setBorder(BorderFactory.createLineBorder(Color.black));
        jp.add(l1);
        jp.add(l2);
        f.add(jp);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayOut();
    }
}

