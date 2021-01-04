import javax.swing.*;
import java.awt.*;

public class IndigoLogoPortraitWithReLeaf extends JPanel {

    private Image backgroundImg;

    public void paintComponent(Graphics g){


        backgroundImg = Toolkit.getDefaultToolkit().createImage("indigo_logo_portrait_with_releaf.png");
        super.paintComponent(g);
        g.drawImage(backgroundImg, 0, 0, null);
    }

}
