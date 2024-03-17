package form1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class form1 extends JFrame {
    private JPanel panel;
    boolean olay = true;
    private JLabel label;


    public static void main(String[] args) {

    }
    form1(){
        add(panel);
        setSize(700,600);
        setTitle("22410082028-Zahide Nur ŞENSOY-TOGGLE BUTTON ÖDEVİ");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Image imgon = new ImageIcon(this.getClass().getResource("/on.png")).getImage();
        Image imgoff = new ImageIcon(this.getClass().getResource("/off.png")).getImage();


        JLabel lbl = new JLabel();
        lbl.setIcon(new ImageIcon(imgon));



        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                if (olay == true) {
                    lbl.setIcon(new
                            ImageIcon(imgoff));
                } else {
                    lbl.setIcon(new ImageIcon(imgon));
                }

                super.mouseClicked(e);
                lbl.setIcon(new ImageIcon(imgoff));
            }
        });
        {

        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f = new form1();
                f.setVisible(true);
            }
        });
    }
}
