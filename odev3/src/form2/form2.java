package form2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame{
    private JComboBox cmd_red;
    private JPanel panel1;
    private JComboBox cmd_green;
    private JComboBox cmd_blue;
    private JComboBox seçenekler;
    private JButton button1;
    int r,g,b;
    DefaultComboBoxModel modelred = new DefaultComboBoxModel<>();
    DefaultComboBoxModel modelgreen = new DefaultComboBoxModel<>();
    DefaultComboBoxModel modelblue = new DefaultComboBoxModel<>();



    form2() {
        add(panel1);
        setSize(600,600);

        setTitle("22410082028-Zahide Nur Şensoy-ComboBox Ödevi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        for(int i=0;i<256;i++){
            modelred.addElement(i);
            modelgreen.addElement(i);
            modelblue.addElement(i);
        }

        cmd_red.setModel(modelred);
        cmd_green.setModel(modelgreen);
        cmd_blue.setModel(modelblue);
        seçenekler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r = cmd_red.getSelectedIndex();
                g = cmd_green.getSelectedIndex();
                b = cmd_blue.getSelectedIndex();

                if(seçenekler.getSelectedIndex()==0){
                    button1.setForeground(new Color(r,g,b));
                }
                else{
                    button1.setForeground(new Color(r,g,b));}
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
           form2 f = new form2();
           f.setVisible(true);
            }
        });
    }
}

