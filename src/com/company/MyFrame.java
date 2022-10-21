package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame("My Grocery Store");
    JPanel mainPanel = new JPanel();
    JPanel holder = new JPanel();
    JPanel cartTab = new JPanel();
    JScrollPane scrollPane = new JScrollPane(holder,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    ImageIcon appleImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/apple.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));

    public void setScreen(){
        frame.setSize(800, 800);
        frame.setResizable(true);
        mainPanel.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        holder.setBackground(Color.gray);
        for (int i = 0; i < 100; i++) {
            JLabel apple = new JLabel(appleImage);
            holder.add(apple);

        }
        scrollPane.setPreferredSize(new Dimension(500, 500));
        holder.setPreferredSize(new Dimension(500, 1000));
        cartTab.setSize(500, 100);
        cartTab.setBackground(Color.darkGray);
        mainPanel.add(scrollPane);
        mainPanel.add(cartTab, BorderLayout.NORTH);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
