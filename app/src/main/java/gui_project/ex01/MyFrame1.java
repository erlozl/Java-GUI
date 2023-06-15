package gui_project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

// MyFrame아 넌 JFrame이니 ?
public class MyFrame1 extends JFrame {

    public MyFrame1() {
        setSize(300, 500);
        setTitle("MyFrame1");

        this.setLayout(new FlowLayout()); // 배치 관리자
        JButton button = new JButton("버튼");
        this.add(button);

        JButton button2 = new JButton("버튼");
        this.add(button2);

        JButton button3 = new JButton("버튼");
        this.add(button3);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // MyFrame myf = new MyFrame();
        // MyFrame myf = 생략가능
        new MyFrame1();
    }
}
