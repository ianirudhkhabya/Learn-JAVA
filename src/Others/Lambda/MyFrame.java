package Others.Lambda;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton button = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");

    MyFrame() {

        button.setBounds(100, 100, 150, 100);
        button.addActionListener((e) -> System.out.println("Button #1"));

        button2.setBounds(100, 200, 150, 100);
        button2.addActionListener((e) -> System.out.println("Button #2"));

        this.add(button);
        this.add(button2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
