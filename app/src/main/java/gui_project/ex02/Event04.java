package gui_project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Event04 extends MyFrame {

    private JButton btn1, btn2;

    public Event04() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        // 인터페이스를 new하는 방법, 익명 클래스 - 문법
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼 1이 클릭되었습니다");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼 2가 클릭되었습니다");
            }

        });

        setVisible(true); // 이건 마지막에 넣어놓아야 함
    }

    public static void main(String[] args) {
        new Event04();
    }
}
