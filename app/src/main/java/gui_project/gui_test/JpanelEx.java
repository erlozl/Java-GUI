package gui_project.gui_test;

// JPanel 클래스는 컴포넌트들을 부착할 수 있도록 설계된 컨테이너 중의 하나
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelEx extends JFrame {
    public JpanelEx() {

        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        add(panel);

        JButton btn1 = new JButton("Button01");
        btn1.setBackground(Color.orange);
        JButton btn2 = new JButton("Button02");
        btn2.setBackground(Color.WHITE);

        panel.add(btn1);
        panel.add(btn2);

        setSize(500, 500);
        setVisible(true);
        setTitle("패널");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JpanelEx();

    }
}
