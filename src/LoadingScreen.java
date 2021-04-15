import javax.swing.*;
import java.awt.*;

public class LoadingScreen extends JComponent {
    private Image image;
    public LoadingScreen(Image image) {
        this.image = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}