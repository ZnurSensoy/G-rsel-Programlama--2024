package deneme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class deneme2 extends JFrame implements ActionListener {
    private JTextField giris, cikis;
    private JComboBox kaydırmacmbx;
    private JComboBox<Integer> kaydirmacmbx;
    private JButton sifrele;

    public deneme2() {
        setTitle("22410082028 Zahide Nur ŞENSOY Sezar Şifreleme Ödevi");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Şifrelenecek Kelime:"));
        giris = new JTextField();
        add(giris);

        add(new JLabel("Kaydırma Miktarı:"));
        Integer[] shiftOptions = {1, 2, 3, 4, 5};
        kaydirmacmbx = new JComboBox<>(shiftOptions);
        add(kaydirmacmbx);

        sifrele = new JButton("Şifrele");
        sifrele.addActionListener(this);
        add(sifrele);

        add(new JLabel("Şifrelenmiş Metin:"));
        cikis = new JTextField();
        cikis.setEditable(false);
        add(cikis);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==sifrele) {
            String inputText = giris.getText();
            int shiftAmount = (int) kaydirmacmbx.getSelectedItem();
            String encryptedText = encrypt(inputText, shiftAmount);
            cikis.setText(encryptedText);
        }
    }

    private String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char encryptedChar = (char) ('A' + (ch - 'A' + shift) % 26);
                    result.append(encryptedChar);
                } else if (Character.isLowerCase(ch)) {
                    char encryptedChar = (char) ('a' + (ch - 'a' + shift) % 26);
                    result.append(encryptedChar);
                }
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new deneme2().setVisible(true);
            }
        });
    }
}
