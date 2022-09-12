package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest {
    public static void main(String[] args){
        JFrame jframe =new JFrame("MY FRAME");
        jframe.setSize(400,150);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JTextField tf = new JTextField(20);
        JLabel label = new JLabel("MY label");
        JButton button = new JButton("Cloick me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String tf1 = tf.getText();
                int a = Integer.parseInt(tf1);
                if(a == 1) {
                    label.setText("Good Morning");
                }
                else if(a == 2){
                    label.setText("Good Eveing");
                }
                else{
                    label.setText("Good Bye");
                }
            }
        });
        panel.add(button);
        panel.add(tf);
        panel.add(label);

        jframe.add(panel);
        jframe.setVisible(true);

    }
}
