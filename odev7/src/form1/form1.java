package form1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class form1 extends JFrame {
    private JTextField txt;
    private JLabel cevap;
    private JLabel bilgi;
    private JPanel panel;

    form1() {
        add(panel);
        setTitle("22410082028 Zahide Nur Şensoy TC Kimlik Ödevi");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        txt = new JTextField();
        cevap = new JLabel();
        cevap.setHorizontalAlignment(SwingConstants.CENTER);
        cevap.setOpaque(true);


        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
            private void checkTCValidity() {
                String tckimlik = txt.getText();

                if (tckimlik.length() == 11) {
                    int sum = 0;
                    for (int i = 0; i < 10; i++) {
                        sum += Character.getNumericValue(tckimlik.charAt(i));
                    }
                    int lastDigit = sum % 10;
                    if ((sum % 2 == 0) && (lastDigit == Character.getNumericValue(tckimlik.charAt(10)))) ;
                    cevap.setBackground(Color.RED);
                    cevap.setText("Geçerli");
                } else {
                    cevap.setBackground(Color.RED);
                    cevap.setText("Geçersiz");
                }
            }  {
                cevap.setBackground(UIManager.getColor("Panel.background"));
                cevap.setText("TC Kimlik Hanesi 11 haneli olmalıdır.");
            }
        });
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            form1 frame = new form1();
            frame.setVisible(true);
        });
    }
}
