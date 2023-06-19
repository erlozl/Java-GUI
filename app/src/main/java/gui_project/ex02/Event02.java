package gui_project.ex02;

// 즉, ActionEvent 객체는 액션 이벤트가 발생한 원인에 대한 정보를 제공하고, ActionEvent 객체는 실제로 액션 이벤트가 발생했을 때 생성
// ActionListener 객체는 이벤트를 처리하는 로직을 구현하여 해당 이벤트에 대한 동작을 수행
// addActionListener 메서드는 버튼에 액션 이벤트 처리를 위한 리스너를 등록하기 위해 사용하는 메서드
// 동기적 프로그램
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Event02 extends MyFrame {

    private JButton btn1, btn2;

    public Event02() {
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
        CallBack call = new CallBack(); // 콜백될 타겟 메서드
        // 메서드는 이벤트가 발생했을 때 호출할 리스너를 등록하는 역할
        btn1.addActionListener(call);
        // javax.swing.AbstractButton 클래스에 정의된 메서드로,
        // 버튼에 액션 이벤트를 처리할 리스너를 등록하는 역할
        btn2.addActionListener(call);
        // 원래는 메서드가 오는 게 맞지만 자바형식상 클래스의 객체를 만들어서
        // 넣어줌
    }

    class CallBack implements ActionListener {
        // ActionListener : 이벤트 리스너 인터페이스 중 하나

        @Override
        // ActionEvent e <= 여기서 e는 클릭된 정보가 들어옴
        public void actionPerformed(ActionEvent e) {

            // JButton btn1 = (JButton) e.getSource();
            Object target = e.getSource(); // get에 관한 소스가 다 들어있음
            JButton btn1 = (JButton) target;

            System.out.println(btn1.getText());
            System.out.println(btn1.getX());
            System.out.println(btn1.getY());
            System.out.println(btn1.getWidth());
            System.out.println(btn1.getHeight());

            if (btn1.getText().equals("버튼1")) {
                // 분기로직
                System.out.println("버튼 1이 클릭되었습니다");
            } else if (btn2.getText().equals("버튼2")) {
                System.out.println("버튼 2가 클릭되었습니다");
            }
        }
    }

    public static void main(String[] args) {
        new Event02();
    }
}
