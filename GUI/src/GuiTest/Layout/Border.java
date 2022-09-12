package GuiTest.Layout;

import javax.swing.*;
import java.awt.*;

public class Border {
    JFrame f;
    Border(){
        f = new JFrame("My Frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,200);
        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        JPanel P3 = new JPanel();
        JPanel P4 = new JPanel();
        JPanel P5 = new JPanel();

        P1.add(new JLabel("Header"));
        P2.add(new JLabel("Footer"));
        P3.add(new JLabel("Ads"));
        P4.add(new JLabel("Links"));
        P5.add(new JLabel("Content"));

        P1.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P3.setBorder(BorderFactory.createLineBorder(Color.black));
        P4.setBorder(BorderFactory.createLineBorder(Color.black));
        P5.setBorder(BorderFactory.createLineBorder(Color.black));

        f.add(P1, BorderLayout.NORTH);
        f.add(P2, BorderLayout.SOUTH);
        f.add(P3, BorderLayout.EAST);
        f.add(P4, BorderLayout.WEST);
        f.add(P5, BorderLayout.CENTER);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Border();
    }
}

