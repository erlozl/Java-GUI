package gui_project.ex02;

import javax.swing.JFrame;

// Frame을 먼저 만들어놓으면 좋음
public class MyFrame extends JFrame {
    MyFrame() {
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
}
