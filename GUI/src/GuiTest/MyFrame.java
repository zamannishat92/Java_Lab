package GuiTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;


public class MyFrame {
    JFrame j;
    JLabel L1, L2, L3;
    JTextField T1, T2, T3;
    JButton button;
    JPanel P1, P2, P3, P4;

    MyFrame() {
        j = new JFrame("My Frame");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(400, 300);

        L1 = new JLabel("Name");
        L2 = new JLabel("UserName");
        L3 = new JLabel("Password");
        T1 = new JTextField(15);
        T2 = new JTextField(15);
        T3 = new JTextField(15);
        button = new JButton("sign up");

        P1 = new JPanel();
        P2 = new JPanel();
        P3 = new JPanel();
        P4 = new JPanel();
        P1.add(L1);
        P1.add(T1);
        P2.add(L2);
        P2.add(T2);
        P3.add(L3);
        P3.add(T3);
        P3.add(button);
        P4.add(P1);
        P4.add(P2);
        P4.add(P3);
        j.add(P4);
        j.setVisible(true);

        button.addActionListener(new printWriter());

    }

    public static void main(String[] args) {
        new MyFrame();
    }

    public class printWriter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            File file = new File("file1.txt");
            try {
                PrintWriter pw = new PrintWriter(file);
                String s1 = T1.getText();
                String s2 = T2.getText();
                String s3 = T3.getText();
                T1.setText(s1);T2.setText(s2);T3.setText(s3);
                pw.println(s1);
                pw.println(s2);
                pw.println(s3);

                pw.close();
            } catch (Exception e) {

            }

        }
    }
}
