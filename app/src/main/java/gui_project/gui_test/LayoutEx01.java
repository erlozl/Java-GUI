package gui_project.gui_test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutEx01 extends JFrame {
    public LayoutEx01() {
        JPanel panel = new JPanel();
        add(panel);

        setLayout(new BorderLayout());
        setSize(300, 300);
        setTitle("레이아웃");

        JButton btn = new JButton();
        add(btn, "South");
        // btn을 하단에 위치시킨다
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutEx01();
    }
}
