package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame("My Grocery Store");
    JPanel mainPanel = new JPanel();
    JPanel holder = new JPanel();
    JPanel cartTab = new JPanel();
    JPanel apple = new JPanel();
    JScrollPane scrollPane = new JScrollPane(holder,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    ImageIcon appleImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/apple.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon orangeImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/orange.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon shoppingCartImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/shoppingcart.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    JButton cart = new JButton(shoppingCartImage);

    public void setScreen(){
        frame.setSize(800, 800);
        frame.setResizable(true);
        mainPanel.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
        holder.setBackground(Color.gray);
        for (int i = 0; i < 10; i++) {
            holder.add(new Item(appleImage, "apples", holder, frame));
        }
        //holder.add(new Item(appleImage, "apples", holder));
        scrollPane.setPreferredSize(new Dimension(500, 500));
        cartTab.setSize(500, 100);
        cartTab.setBackground(Color.darkGray);
        cartTab.setLayout(new BorderLayout());
        cart.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        cart.addActionListener(this);
        cartTab.add(cart, BorderLayout.EAST);
        mainPanel.add(scrollPane);
        mainPanel.add(cartTab, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    public void setProducts() {
        Map<ImageIcon, String> actors = new HashMap<ImageIcon, String>();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cart) {
            System.out.println("pressed");
        }

    }
}
