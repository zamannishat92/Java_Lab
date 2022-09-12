package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
//        panel.setBackground(Color.DARK_GRAY);

        JTextField tf1 = new JTextField(30);
//        JTextField tf2 = new JTextField(30);
//        JTextField tf3 = new JTextField(30);
        JLabel label = new JLabel("Label 1");

        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                panel.setBackground(Color.BLUE);
                String text = tf1.getText();
                label.setText(text);
            }
        });


        panel.add(button);
        panel.add(tf1);
        panel.add(label);
//        panel.add(tf2);
//        panel.add(tf3);


        frame.add(panel);
        frame.setVisible(true);
    }
}
