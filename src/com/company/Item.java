package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class Item extends JPanel implements ActionListener {
    ImageIcon image;
    JPanel container;
    JFrame frame;
    int count;
    JLabel quantity = new JLabel(String.valueOf(count));
    Item(ImageIcon passImage, JPanel holder, JFrame passFrame, Boolean isCart) {
        image = passImage;
        container = holder;
        frame = passFrame;
        if(!isCart) {
            createPanel();
        } else {
            createCart();
        }
    }
    public void createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel(image), BorderLayout.WEST);
        panel.setBackground(Color.LIGHT_GRAY);
        JPanel buttonHolder = new JPanel();
        GridLayout buttonLayout = new GridLayout(0,3);
        buttonHolder.setLayout(buttonLayout);
        JButton plus = new JButton("+");
        plus.addActionListener(this);
        JButton minus = new JButton("-");
        minus.addActionListener(this);
        buttonHolder.add(quantity);
        buttonHolder.add(plus);
        buttonHolder.add(minus);
        buttonHolder.setOpaque(false);
        panel.add(buttonHolder, BorderLayout.EAST);
        container.add(panel);
    }
    
    public JPanel createCart() {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel(image), BorderLayout.WEST);
        panel.setBackground(Color.LIGHT_GRAY);
        JPanel informationHolder = new JPanel();
        GridLayout infoLayout = new GridLayout(0,1);
        informationHolder.setLayout(infoLayout);
        JLabel title = new JLabel(image.getDescription());
        informationHolder.setOpaque(false);
        //System.out.println();
        informationHolder.add(title);
        panel.add(informationHolder, BorderLayout.EAST);
        return panel;

    }

    public void incrementCounter() {
        count++;
        frame.setMinimumSize(frame.getSize());
        frame.pack();
        frame.setMinimumSize(null);
        quantity.setText(String.valueOf(count));

    }
    public void decrementCounter() {
        if(count > 0) {
            count--;
            frame.setMinimumSize(frame.getSize());
            frame.pack();
            frame.setMinimumSize(null);
            quantity.setText(String.valueOf(count));
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().toString().contains("+")) {
            incrementCounter();
        }
        if (e.getSource().toString().contains("-")) {
            decrementCounter();
        }

    }
}
