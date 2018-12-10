package cz.uhk.fim.swingApp.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    JTable j;

    public MainFrame() {
        init();
    }

    public void init() {
        setTitle("Záznam měření výšky pacientů");
        setSize(525, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initContentUI();
    }

    private void initContentUI() {
        JPanel northPanel = new JPanel(new BorderLayout());

        // buttony - vytvoreni
        JButton add = new JButton("Přidat záznam");
        JButton edit = new JButton("Editovat záznam");
        JButton export = new JButton("Export do souboru");
        JButton remove = new JButton("Smazat záznam");

        Box boxButton = Box.createHorizontalBox();
        boxButton.add(add);
        boxButton.add(edit);
        boxButton.add(remove);
        boxButton.add(export);

        northPanel.add(boxButton, BorderLayout.NORTH);
        add(northPanel, BorderLayout.NORTH);

        String[][] data = {
                {"14:55 10.12.2018", "Petr Omáčka", "184", "false"},
                {"22:15 10.12.2018", "Olina Gordita", "155", "false"},
                {"05:15 10.12.2018", "Filip Novák", "201", "true"},
                {"17:15 10.12.2018", "Tomáš Černý", "165", "false"},
                {"06:15 10.12.2018", "Petra Zelená", "195", "true"},
        };

        // Column Names
        String[] columnNames = {"Datum a čas", "Jméno a příjmení", "Naměřené výška", "Překročeno 195cm(včetně)?"};

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        JScrollPane sp = new JScrollPane(j);
        add(sp);
    }

}
