import javax.swing.*;
import java.awt.*;

public class GameFrame {
    JFrame frame;
    Table table;

    GameFrame()
    {
        frame = new JFrame("Pong Game");
        Table table = new Table();
        table.setBackground(Color.black);
        frame.add(table);
        frame.setBackground(Color.black);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
}