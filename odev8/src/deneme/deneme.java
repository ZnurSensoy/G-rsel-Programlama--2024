package deneme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deneme extends JFrame {
    private JSpinner satır, sütun;
    private JButton buton;
    private JPanel pnl, pnl1, pnl2;

    public deneme() {
        setTitle("22410082028 Zahide Nur Şensoy Matriks Toplama Ödevi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(1, 4));



        pnl = new JPanel();

        pnl.setLayout(new GridLayout(0, 1));
        pnl.add(new JLabel("Satır"));
        pnl.add(new JLabel(":"));
        satır = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        pnl.add(satır);


        pnl1 = new JPanel();
        pnl1.setLayout(new GridLayout(0, 1));
        pnl1.add(new JLabel("Sütun"));
        pnl1.add(new JLabel(":"));
        sütun = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        pnl1.add(sütun);


        pnl2 = new JPanel();
        pnl2.setLayout(new GridLayout(0, 1));
        pnl2.add(new JLabel("Sonuç :"));
        pnl2.add(new JLabel());


        buton = new JButton("Matrix ekle");
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMatrices();
            }
        });

        add(pnl);
        add(pnl1);
        add(buton);
        add(pnl2);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addMatrices() {
        int str = (int) satır.getValue();
        int stn = (int) sütun.getValue();

        int[][] matrix1 = generateRandomMatrix(str, stn);
        int[][] matrix2 = generateRandomMatrix(str, stn);
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        displayMatrix(resultMatrix);
    }

    private int[][] generateRandomMatrix(int str, int stn) {
        int[][] matrix = new int[str][stn];
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stn; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    private int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int str = matrix1.length;
        int stn = matrix1[0].length;
        int[][] resultMatrix = new int[str][stn];

        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stn; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    private void displayMatrix(int[][] matrix) {
        pnl2.removeAll();

        int str = matrix.length;
        int stn = matrix[0].length;

        JPanel matrixDisplayPanel = new JPanel(new GridLayout(str, stn));
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stn; j++) {
                matrixDisplayPanel.add(new JLabel(String.valueOf(matrix[i][j])));
            }
        }
        pnl2.add(matrixDisplayPanel);

        validate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new deneme();
            }
        });
    }
}
