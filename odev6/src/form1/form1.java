package form1;

import ButtonMovement.ButtonMovement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JButton btn;
    private JButton rhbutton;
    private JPanel pnl;
    private JLabel bilgi;

    form1(){
        add(pnl);
        setTitle("22410082028-Zahide Nur Şensoy-Renk ve Konum Değiştiren Button");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        btn = new JButton("Oluştur");
        btn.setBounds(10,10,100,30);
        rhbutton = new JButton("B");
        rhbutton.setBounds(175,100,50,50);
        
        add(btn);
        add(rhbutton);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveAndChangeColor(rhbutton);
            }
        });
    }
    
    
    private void moveAndChangeColor(JButton button) {
        Random random = new Random();
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        Color randomColor = new Color(r,g,b);
        button.setBackground(randomColor);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ButtonMovement buttonMovement = new ButtonMovement();
                Object setVisible = buttonMovement.setVisible;
            }
        });
    }

    private class Random {
        public float nextFloat() {
            return 0;
        }
    }
}
