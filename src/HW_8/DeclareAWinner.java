package HW_8;

import javax.swing.*;
import java.awt.*;

public class DeclareAWinner extends JFrame {
    private GameWindow gameWindow;

    private static final int WINDOW_POS_X = GameWindow.WINDOW_POS_X + 50;
    private static final int WINDOW_POS_Y = GameWindow.WINDOW_POS_Y + 50;
    private static final int WINDOW_HEIGHT = GameWindow.WINDOW_HEIGHT - 100;
    private static final int WINDOW_WIDTH = GameWindow.WINDOW_WIDTH - 100;
    static JLabel labelArea;

    static String[] label = {" YOU WON!", " YOU LOSE!", "TIE"};
    static Font font = new Font("Ariel", Font.PLAIN, 60);

    public DeclareAWinner(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("The Winner IS");

        labelArea = new JLabel();
        labelArea.setFont(font);

        add(labelArea, BorderLayout.CENTER);

        JPanel panel = new JPanel(new GridLayout(1, 1));
        JButton buttonExit = new JButton("Exit");
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        buttonExit.addActionListener(e -> {
            System.exit(0);
        });
        setVisible(false);


    }


}
