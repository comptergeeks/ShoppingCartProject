package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame("My Grocery Store");
    JPanel mainPanel = new JPanel();
    JPanel holder = new JPanel();
    JPanel cartTab = new JPanel();
    JScrollPane scrollPane = new JScrollPane(holder,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    ImageIcon appleImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/apple.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon greenappleImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/greenapple.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon orangeImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/orange.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon blueberryImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/blueberry.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon raspberryImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/raspberry.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon strawberryImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/strawberry.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon grapeImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/grape.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon lemonImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/lemon.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon limeImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/lime.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon watermelonImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/watermelon.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon bannanaImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/bannana.jpeg").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon pearImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/pear.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon peachesImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/peaches.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon shoppingCartImage = new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/ShoppingCart/src/com/company/assets/shoppingcart.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    JButton cart = new JButton(shoppingCartImage);
    ArrayList<Item> list = new ArrayList<>();
    ArrayList<ImageIcon> listOfImages = new ArrayList<>();

    public void setScreen(){
        listOfImages.add(appleImage);
        listOfImages.add(greenappleImage);
        listOfImages.add(orangeImage);
        listOfImages.add(blueberryImage);
        listOfImages.add(raspberryImage);
        listOfImages.add(strawberryImage);
        listOfImages.add(grapeImage);
        listOfImages.add(lemonImage);
        listOfImages.add(limeImage);
        listOfImages.add(watermelonImage);
        listOfImages.add(pearImage);
        listOfImages.add(peachesImage);
        listOfImages.add(bannanaImage);
        setProducts();
        frame.setSize(800, 800);
        frame.setResizable(true);
        mainPanel.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
        holder.setBackground(Color.gray);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            holder.add(list.get(i));
        }
        //holder.add(new Item(appleImage, holder, frame));
        scrollPane.setPreferredSize(new Dimension(500, 500));
        cartTab.setSize(500, 100);
        cartTab.setBackground(Color.darkGray);
        cartTab.setLayout(new BorderLayout());
        cart.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        cart.addActionListener(this);
        JLabel label = new JLabel("My Grocery Store");
        cartTab.add(label, BorderLayout.CENTER);
        cartTab.add(cart, BorderLayout.EAST);
        mainPanel.add(scrollPane);
        mainPanel.add(cartTab, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    public void setProducts() {
        if (listOfImages.size() > 0) {
            for (int i = 0; i < listOfImages.size(); i++) {
                list.add(new Item(listOfImages.get(i), holder, frame));
            }
        }
    }
    public void checkCart() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cart) {
            System.out.println("pressed");
            checkCart();
        }

    }
}
