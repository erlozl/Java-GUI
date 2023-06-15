package gui_project.ex01;

// 프레임 생성 방법 -JFrame 클래스에 의하여 표현됨
// 이 애가 만든 클래스를 공부하는 거임 - 문서 읽어보는 거 중요!
// JFrame은 Swing에서 기본적으로 실행되는 윈도우 컨테이너. 
// JFrame은 사용자에게 보이는 창을 생성하고, 컴포넌트들을 담을 수 있는 영역을 제공한다
// 일반적으로 Swing 애플리케이션에서는 JFrame 객체를 생성하여 애플리케이션의 주 창을 표시한다.
// JFrame은 윈도우의 외관과 동작을 관리하며, 여러 개의 컴포넌트를 포함하고 배치할 수 있는 기능을 제공
import javax.swing.JFrame;

// 프레임 & 컨테이너라고 부름
public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("FrameTest");
        // 기본 창
        f.setSize(600, 500);
        f.setVisible(true);
        // 예) 페인팅하는 거임
        // 그 운영체제에 맞게 그려준다
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 데몬 종료 - 숫자 3써도 됨, 3을 안 쓰는 이유는 가독성이 좋지 않기 때문에
        // 클래스.final 상수 = static 변수

        // 컨테이너 안에 컴포넌드를 배치하는 것 gui
    }
}
