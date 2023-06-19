package gui_project.ex02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameEvent extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public JFrameEvent() {
        setSize(300, 300);
        setTitle("JFrameEvent");

        button = new JButton();
        label = new JLabel();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        JFrameEvent je = new JFrameEvent();
    }

}
