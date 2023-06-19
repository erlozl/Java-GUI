package gui_project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui_project.ex02.Event02.CallBack;

public class Event03 extends MyFrame implements ActionListener {

    private JButton btn1, btn2;

    public Event03() {
        // 1. 컴포넌트 생성
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        // 2. 컴포넌트를 배치
        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        // 3. 그림 그리기
        setVisible(true); // 이건 마지막에 넣어놓아야 함

        // 4. 리스너
        // 실행할 타겟을 설정
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if (btn1.getText().equals("버튼1")) {
            // 분기로직
            System.out.println("버튼 1이 클릭되었습니다");
        } else if (btn2.getText().equals("버튼2")) {
            System.out.println("버튼 2가 클릭되었습니다");
        }
    }

    public static void main(String[] args) {
        new Event03();
    }

}
