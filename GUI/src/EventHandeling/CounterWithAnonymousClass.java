package EventHandeling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterWithAnonymousClass {
    JFrame f;
    JTextField TF;
    JButton B1;
    CounterWithAnonymousClass(){
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(new JLabel("Counter"));
        TF = new JTextField(15);
        TF.setText("0");
        f.add(TF);
        B1=new JButton("Count");
        f.add(B1);

        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = TF.getText();
                int a = Integer.parseInt(s);
                a = a+1;
                s = a+"";
                TF.setText(s);
            }
        });
        f.setVisible(true);
    }
    public static void main(String[] args){
         new CounterWithAnonymousClass();
    }
}
