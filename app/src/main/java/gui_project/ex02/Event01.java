package gui_project.ex02;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event01 extends JFrame {

    // composit 구성
    private JButton button;
    private JButton button2;
    private JLabel label;
    private JLabel label2;
    int counter = 0;

    public Event01() {
        setSize(600, 200);
        setLayout(new FlowLayout());
        button = new JButton("증가");
        button2 = new JButton("2 증가");
        label = new JLabel("현재의 카운터값 :" + counter);
        label2 = new JLabel("현재의 카운터 2값 :" + counter);
        button.addActionListener(new Inner01());
        button2.addActionListener(new Inner02());
        add(button);
        add(button2);
        add(label);
        add(label2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 인터페이스
    }

    class Inner01 implements ActionListener {

        @Override
        // ActionEvent 이벤트 객체
        public void actionPerformed(ActionEvent e) {
            JButton btn1 = (JButton) e.getSource();
            System.out.println("버튼 클릭됨 :");
            System.out.println(btn1.getText());
            counter++;
            System.out.println(counter);

            label.setText("현재의 카운터값 : " + counter);
        }
    }

    // 행위를 하나 더 만들 때는 클래스를 만들어야 함
    class Inner02 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn2 = (JButton) e.getSource();
            System.out.println("2 버튼 클릭");
            System.out.println(btn2.getText());
            counter = counter + 2;
            System.out.println(counter);
            label2.setText("현재의 카운터 2값 : " + counter);
        }

    }

    public static void main(String[] args) {
    }
}
