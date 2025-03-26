package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame window = new JFrame () ;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000, 700);

        window.setResizable(false); //lets window close properly when user clicks close (x) button.
        window.setTitle("Paint Tool"); //window cant be resized

        window.setLayout(null);

        PaintPanel pp = new PaintPanel();
        pp.setBounds(250, 0, 750, 700);
        window.add(pp); // add PaintPanel to window

        ButtonPanel buttonPanel = new ButtonPanel(pp);
        buttonPanel.setBounds(0, 0, 250, 700);
        window.add(buttonPanel);
        

        window.setLocationRelativeTo(null); //window displayed at screen center
        window.setVisible(true);
    }
}