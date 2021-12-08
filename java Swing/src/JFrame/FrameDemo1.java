package JFrame;

import javax.swing.JFrame;

public class FrameDemo1 extends JFrame {

    FrameDemo1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 500);
        setTitle("Tanmoy");
    }

    public static void main(String[] args) {

        FrameDemo1 frame = new FrameDemo1();

        frame.setVisible(true);

    }
}
