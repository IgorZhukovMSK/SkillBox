import javax.swing.*;
import java.awt.*;

public class Loader
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0, 0, 800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our first window application");
        frame.setVisible(true);
    }
}
