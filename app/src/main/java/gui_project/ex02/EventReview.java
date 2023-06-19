package gui_project.ex02;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventReview extends JFrame {

    private JButton button;
    private JLabel label;
    int counter = 0;

    public EventReview() {
        setSize(600, 200);
        setLayout(new FlowLayout());
        button = new JButton("증가");
        label = new JLabel("현재의 카운터값 :" + counter);
        // 난 클래스가 아니라 메서드를 주입하고 싶은데,
        // 자바 언어 특성상 어쩔 수 없이 클래스를 주입한다.
        button.addActionListener(new Inner());
        // 폴링방식
        // button.addActionListener((e)->{
        // });
        /*
         * 내가 무엇을 실행할지 null에 넣어줌 , null = 행위
         * 자바에서는 메서드가 메모리에 독립적으로 뜰 수 없다
         * 그렇기 때문에 클래스를 넣어줌
         */

        /*
         * 이벤트를 등록한다는 것은 OS가 들고 있는 리스너한테 어떤 버튼을 클릭했을 때
         * 무엇을 실행할지(어떤 콜백메서드가 실행되게 할지) 결정시켜주는 것
         */

        // 사용자가 버튼을 클릭하는 것(콜)하고,
        // 메서드가 그걸 (백)함

        // 리스너가 버튼이 언제 클릭될지 지켜보는 - 폴링방식 (지속적으로 계속 물어보는 방식)
        // 버튼이 클릭됐을 때 알려주는 - 푸쉬방식 ex)유튜브 구독 알림
        // 단점 - 연결이 유지되어야 하니 통신의 부화가 큼

        add(button);
        add(label);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 인터페이스

    }

    class Inner implements ActionListener {

        // 콜백 메서드
        // 콜백(callback)은 어떤 이벤트가 발생했을 때 시스템에 의해 호출되는 메서드를 의미
        // 여기서는 버튼을 클릭할 때 발생하는 액션 이벤트에 대한 콜백 메서드로
        // actionPerformed 메서드가 호출
        // @Override
        // ActionEvent 이벤트 객체

        // actionPerformed 메서드의 시그니처를 포함하고 있다.
        // 이 메서드는 이벤트가 발생했을 때 호출되며, 이때 ActionEvent 객체가 생성되어 파라미터로 전달
        public void actionPerformed(ActionEvent e) {
            // 여기서 actionPerformed는 메서드의 이름이며, ActionEvent 타입의 매개변수 e를 받고, 반환타입은 void입니다.
            // 따라서 actionPerformed 메서드는 ActionEvent 객체를 인자로 받아 처리하고,
            // 반환값이 없는 메서드입니다
            JButton btn = (JButton) e.getSource();
            // 어떤 이벤트가 발생할 지 모르니 버튼을 다운캐스팅해야 함
            // * 다운캐스팅 : 상위 클래스로 선언된 객체를 하위 클래스로 형변환
            System.out.println("버튼 클릭됨 :");
            System.out.println(btn.getText());
            // 버튼을 클릭했기 때문에 실행값을 나오지만
            // label에 값은 뜨지 않기 때문에 리페인팅해줌
            counter++;
            System.out.println(counter);
            label.setText("현재의 카운터값 : " + counter);
            // 다시 리페인팅하는 걸 setText이라고 함
        }
        // 클래스안에 클래스 만들 수 있을 때 - 내부에서만 사용할 때

    }

    public static void main(String[] args) {
        EventReview event = new EventReview();
    }
}
