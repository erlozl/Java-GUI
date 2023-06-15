package gui_project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame2 extends JFrame {
    public MyFrame2() {
        setSize(500, 500);
        setLocation(600, 300);
        setTitle("rlozl의 프레임");

        // setLayout(new FlowLayout());
        // this.setLayout(new FlowLayout()); 배치 관리자

        // FlowLayout 레이아웃 매니저는 컴포넌트들을 왼쪽에서 오른쪽으로 순서대로 정렬하는 방식
        // setLayout을 쓰면 background도 컴포넌트이기 때문에 작게 왼쪽으로 정렬됨
        // 컴포넌트들을 가운데로 정렬하거나 크기를 조절하고 싶다면 FlowLayout 대신 다른 레이아웃 매니저를 사용해야한다.
        // 예를 들어 GridLayout, BorderLayout, BoxLayout 등의 다른 레이아웃 매니저를 적용하여 컴포넌트들의 배치와 크기를
        // 조정

        // getContentPane().setBackground(Color.black);
        // 컨테이너안에 배경색을 바꿀거야 (색 블랙으로)

        JButton mfbutton = new JButton("까꿍");
        this.add(mfbutton);
        // add 메소드 붙이는 이유는 컴포넌트라서
        // 여기서 this를 해주는 이유는 JFrame을 상속받고 있지 않고
        // 이 클래스 안에서 쓸거기 때문에 this로 사용

        JPanel panel = new JPanel(); // 패널 생성
        panel.setBackground(Color.ORANGE);
        this.add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();

        MyFrame2 Myfra = new MyFrame2();
        // 동작이 수행되는 거기 때문에 호출만 해도 가능

        // new MyFrame2();
        // 객체 생성과 초기화가 한 줄에 표현되는 간결한 표현 방식
        // 생성된 객체를 바로 사용

        // 익명 객체(anonymous object)를 생성

    }
}
