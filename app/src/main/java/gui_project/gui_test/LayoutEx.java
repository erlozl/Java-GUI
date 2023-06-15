package gui_project.gui_test;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
// 배치관리자
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutEx extends JFrame {
    public LayoutEx() {
        JPanel panel = new JPanel();
        // JFrame frame = new JFrame(); 별로로 다시 생성할 필요가 없다
        JButton btn = new JButton("확인");

        panel.setLayout(new BorderLayout());
        // btn.setMaximumSize(new Dimension(300, 200));
        // setMaximumSize()는 컴포넌트의 크기 제약을 나타내는 것이지만, 레이아웃 매니저에 따라 이 제약이 적용되지 않을 수 있다
        btn.setPreferredSize(new Dimension(300, 200));
        panel.add(btn, BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutEx();
    }
}
