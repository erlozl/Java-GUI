package gui_project.ex02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

// 사용자가 키보드를 이용하여 입력받는 경우
public class KeyEvent01 extends MyFrame {
    private JTextField textfield;

    KeyEvent01() {
        setTitle("key 이벤트 예제");
        textfield = new JTextField(20);
        textfield.addKeyListener(new KeyInner());
        add(textfield);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class KeyInner implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            display(e, "KeyPressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

    }

    public static void main(String[] args) {
        new KeyEvent01();
    }
}
