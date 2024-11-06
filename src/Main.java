import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(1000, 700));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        Board board = new Board();
        frame.add(board);
    }
}