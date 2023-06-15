package gui_project.ex01;

import javax.swing.JFrame;

// MyFrame아 넌 JFrame이니 ?
public class MyFrame extends JFrame {

    public MyFrame() {
        setSize(300, 500);
        setTitle("MyFrame");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // MyFrame myf = new MyFrame();
        // MyFrame myf = 생략가능
        new MyFrame();
    }
}
