import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class frameConstruction{
  public static void main(String[] args) {

    JFrame frame = new JFrame(); // constucted object from JFrame class

    JButton button = new JButton("Guess What?"); // construct object from JButton class
    JLabel label = new JLabel("Epstein didn't kill Himself"); // construct object from JLabel class

    JPanel panel = new JPanel();
    panel.add(button); // insert button
    panel.add(label); // insert label
    frame.add(panel); // add panel to JFrame


    //construct width and height of the JFrame

    final int FRAME_WIDTH = 800;
    final int FRAME_HEIGHT = 800;

    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT); // set width and height

    frame.setTitle("Epstein didn't kill himself"); //set Title


    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setVisible(true);











  }
}
