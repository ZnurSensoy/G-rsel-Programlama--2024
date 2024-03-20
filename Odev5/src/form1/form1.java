package form1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form1 extends JFrame{
    private JPanel pnl;
    private JSlider slider1;
    private JLabel odev;
    private JSlider slider2;
    private JSlider slider3;
    private JSlider slider4;
    private JLabel vıze;
    private JLabel fınal;
    private JLabel ortalama;
    private JLabel ol;
    private JLabel vl;
    private JLabel fl;
    private JLabel ortl;
    private JLabel bilgi;

    int o,v,f,ortt;
    float ort;

    form1(){
        add(pnl);
        setTitle("22410082028-Zahide Nur ŞENSOY-Slider Ödevi");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
             o = slider1.getValue();
             ol.setText(Integer.toString(o));
             v = slider2.getValue();
             f = slider3.getValue();
             ort = ((float) v+o+f)/2;
             ortt = Math.round(ort);
             slider4.setValue(ortt);
             ortl.setText(Integer.toString(ortt));
             if(ortt>=60){ slider4.setBackground(Color.GREEN);
             }  else if (ortt>=55 && ortt<60){
                 slider4.setBackground(Color.ORANGE);
             } else if (ortt<55){
                 slider4.setBackground(Color.RED);
             }

            }
        });

        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                o = slider1.getValue();
                v = slider2.getValue();
                vl.setText(Integer.toString(v));
                f = slider3.getValue();
                ort = ((float) o+v+f)/2;
                ortt = Math.round(ort);
                slider4.setValue(ortt);
                ortl.setText(Integer.toString(ortt));
            }
        });

        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                o = slider1.getValue();
                v = slider2.getValue();
                f = slider3.getValue();
                fl.setText(Integer.toString(f));
                ort = ((float) o+v+f)/2;
                ortt = Math.round(ort);
                slider4.setValue(ortt);
                ortl.setText(Integer.toString(ortt));
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f = new form1();
                f.setVisible(true);
            }
        });
    }
}
