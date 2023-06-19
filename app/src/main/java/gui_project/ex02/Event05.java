package gui_project.ex02;

// 람다식
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Event05 extends MyFrame {

    private JButton btn1, btn2;

    public Event05() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        btn1.addActionListener(e -> System.out.println("버튼1 클릭"));
        // e는 ActionListener 인터페이스의 actionPerformed 메서드의 매개변수인 ActionEvent를 나타냅니다.
        // 람다식을 사용하여 간단하게 버튼 클릭 이벤트를 처리하는 경우,e를 사용하여 이벤트 정보를 추출하거나 활용
        btn2.addActionListener(e -> System.out.println("버튼2 클릭"));
        // 메서드를 넘긴거구나(행위를 넘긴거구나)

        setVisible(true); // 이건 마지막에 넣어놓아야 함
    }

    public static void main(String[] args) {
        new Event05();
    }
}
