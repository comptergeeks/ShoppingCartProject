package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame("My Fruit Store");
    JPanel mainPanel = new JPanel();
    JPanel holder = new JPanel();
    JPanel cartTab = new JPanel();
    JScrollPane scrollPane = new JScrollPane(holder, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
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

    public void setScreen() {
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
        JLabel label = new JLabel("My Fruit Store");
        cartTab.add(label, BorderLayout.CENTER);
        cartTab.add(cart, BorderLayout.EAST);
        mainPanel.add(scrollPane);
        mainPanel.add(cartTab, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    public void setProducts() {
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
        boolean isCart = false;
        appleImage.setDescription("Red Apples");
        greenappleImage.setDescription("Green Apples");
        orangeImage.setDescription("Oranges");
        blueberryImage.setDescription("Bluberries");
        raspberryImage.setDescription("Raspberries");
        grapeImage.setDescription("Grapes");
        strawberryImage.setDescription("Strawberry");
        lemonImage.setDescription("Lemons");
        limeImage.setDescription("Limes");
        watermelonImage.setDescription("Watermelons");
        pearImage.setDescription("Pears");
        peachesImage.setDescription("Peaches");
        bannanaImage.setDescription("Bananas");

        if (listOfImages.size() > 0) {
            for (int i = 0; i < listOfImages.size(); i++) {
                list.add(new Item(listOfImages.get(i), holder, frame, isCart));
            }
        }
    }

    public void checkCart() {
        boolean isCart = true;
        JFrame frame2 = new JFrame("Cart");
        frame2.setSize(500, 500);
        frame2.setResizable(true);
        JPanel panel = new JPanel();
        frame2.setContentPane(panel);
        panel.setBackground(Color.darkGray);
        JPanel newPanel = new JPanel();
        JScrollPane scrollPane2 = new JScrollPane(newPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setPreferredSize(new Dimension(500, 500));
        newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.Y_AXIS));
        panel.add(scrollPane2);
        frame2.setVisible(true);
        Stack<Item> itemStack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).count > 0) {
                for (int j = 0; j < list.get(i).count; j++) {
                    itemStack.add(new Item(list.get(i).image, newPanel, frame2, isCart));
                }
            }
        }
        openCart(itemStack, newPanel, frame2);
    }

    public void openCart(Stack<Item> itemStack, JPanel newPanel, JFrame frame2) {
        System.out.println(itemStack.size());
        if (itemStack.size() > 0) {
            while (!itemStack.isEmpty()) {
                newPanel.add(itemStack.pop().createCart());
                frame2.pack();
                repaint();
            }
        } else {
            JOptionPane.showMessageDialog(frame2, "You have no items. Add some into your cart and try again!", "Empty Cart", JOptionPane.WARNING_MESSAGE);
            frame2.dispose();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cart) {
            checkCart();
        }

    }
}
