package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame () ;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setResizable(false); //lets window close properly when user clicks close (x) button.
        window.setTitle("Paint Tool"); //window cant be resized

        PaintPanel paintPanel = new PaintPanel();
        window.add(paintPanel); // add GamePanel to window

        window.pack(); // causes window to be sized to fit preferred size&layouts of its subcomponents (=GamePanel)

        window.setLocationRelativeTo(null); //window displayed at screen center
        window.setVisible(true);
    }
}