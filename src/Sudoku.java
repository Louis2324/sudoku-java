import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("unused")
public class Sudoku {
    int boardWidth = 650;
    int boardHeight = 650;

    JFrame frame = new JFrame("Sudoku");

    Sudoku() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
 
    }
}
