package gui_project.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        backgroundMap = new JLabel(
                new ImageIcon(
                        "C:\\workspace\\java_lab\\gui_project\\app\\src\\main\\java\\gui_project\\image\\backgroundMap.png"));
        setContentPane(backgroundMap);

        setSize(1000, 640);
        setLayout(null); // absolute 레이아웃 (자유롭게 배치 가능)
        setLocationRelativeTo(null); // JFrame 가운데 배치하기
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
