package gui_project.gui_test;

// BorderLayout
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

        JButton btn1 = new JButton("North");
        JButton btn2 = new JButton("South");
        JButton btn3 = new JButton("East");
        JButton btn4 = new JButton("West");
        JButton btn5 = new JButton("Center");
        // 버튼 이름을 지정할 때는 여기에다가 써주기

        add(btn1, "North");
        add(btn2, "South");
        add(btn3, "East");
        add(btn4, "West");
        add(btn5, "Center");
        // btn을 하단에 위치시킨다
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutEx01();
    }
}
