import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;

public class MainFrame extends JFrame{
    public void initialize(){
        BufferedImage picture = ImageIO.read(new File("../images/image.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(picture));
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(132, 128, 255));

        setTitle("Wave Function Collapse");
        setSize(1000, 800);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        add(picLabel);
    }
    

    public static void main(String[] args){
        boolean test = false;
        for (int i = 0; test == false; i++) {
            System.out.println(i);
        }
    }
}
