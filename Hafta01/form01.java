package Hafta01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form01 extends JFrame {
    private JPanel panel;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label4;
    private JLabel label3;
    private JButton Button;
    float sayi1,sayi2,sonuc;


    form01() {
        add(panel);
        setTitle("İlk Ödevim");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float)sayi1 - sayi2;
                label4.setText(Float.toString(sonuc));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float)sayi1 / sayi2;
                label4.setText(Float.toString(sonuc));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float)sayi1 * sayi2;
                label4.setText(Float.toString(sonuc));
            }
        });
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float)sayi1 + sayi2;
                label4.setText(Float.toString(sonuc));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form01 f= new form01();
                f.setVisible(true);
            }
        });
    }
}

