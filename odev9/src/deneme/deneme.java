package deneme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class deneme extends JFrame {

    private  int MATRIS_BOYUTU = 5;
    private JPanel panel;
    private JButton artan;
    private JButton azalan;
    private JButton karıştır;
    private  JTable table;
    private  JScrollPane ScrollPane;

    private JLabel bilgi;

    public deneme() {
        setTitle("22410082028 Zahide Nur Şensoy Matris Ödevi");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        table = new JTable(MATRIS_BOYUTU, MATRIS_BOYUTU);
        ScrollPane = new JScrollPane(table);

        panel.add(artan);
        panel.add(azalan);
        panel.add(karıştır);

        add(ScrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        table.setRowHeight(60);

        artan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ascendingOrder();
            }
        });

        azalan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                descendingOrder();
            }
        });

        karıştır.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shuffle();
            }
        });
    }

    private void ascendingOrder() {
        ArrayList<Integer> list = generateList();
        Collections.sort(list);
        updateTable(list);
    }

    private void descendingOrder() {
        ArrayList<Integer> list = generateList();
        Collections.sort(list, Collections.reverseOrder());
        updateTable(list);
    }

    private void shuffle() {
        ArrayList<Integer> list = generateList();
        Collections.shuffle(list);
        updateTable(list);
    }

    private ArrayList<Integer> generateList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= MATRIS_BOYUTU * MATRIS_BOYUTU; i++) {
            list.add(i);
        }
        return list;
    }

    private void updateTable(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < MATRIS_BOYUTU; i++) {
            for (int j = 0; j < MATRIS_BOYUTU; j++) {
                table.getModel().setValueAt(list.get(count++), i, j);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new deneme().setVisible(true);
            }
        });
    }
}
