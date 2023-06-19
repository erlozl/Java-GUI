package gui_project.gui_test;

import java.awt.GridLayout;

// BorderLayout

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutEx02 extends JFrame {
    public LayoutEx02() {
        // JPanel panel = new JPanel();
        // add(panel);
        // 이걸 쓰면 밀림

        setLayout(new GridLayout(2, 3, 2, 2));
        // GridLayout(int rows, int cols, int hGap, int vGap
        ;
        // 행, 열, 높이, 넓이
        setSize(300, 150);
        setTitle("레이아웃");

        JButton btn1 = new JButton("button01");
        JButton btn2 = new JButton("button02");
        JButton btn3 = new JButton("button03");
        JButton btn4 = new JButton("button04");
        JButton btn5 = new JButton("button05");
        JButton btn6 = new JButton("button06");
        // 버튼 이름을 지정할 때는 여기에다가 써주기

        add(btn1, "button01");
        add(btn2, "button02");
        add(btn3, "button03");
        add(btn4, "button04");
        add(btn5, "button05");
        add(btn6, "button06");

        // btn을 하단에 위치시킨다
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutEx02();
    }
}
