import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class BlockeyMain {

    public static void JFrameBlockey(){

        JFrame frame = new JFrame("Blockey");  //create frame
        frame.getContentPane().setPreferredSize(new Dimension(500,350));



        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.add(panel);

        /*blockey message label*/
        JLabel blockeyMessage = new JLabel("Hello, how can I help you today?",SwingConstants.CENTER); //blockey default message
        blockeyMessage.setPreferredSize(new Dimension(200,100));
        blockeyMessage.setFont(new Font("Arial", Font.BOLD, 12));

        c.gridx = 1;
        c.gridy = 0;

        panel.add(blockeyMessage,c);





        /*userIput text area*/
        JScrollPane scroll = new JScrollPane ();
        scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);

        JTextArea userInput = new JTextArea();
        userInput.setFont(new Font("Arial", Font.BOLD, 12));
        userInput.setLineWrap(true);

        c.gridx = 1;
        c.gridy = 3;

        scroll.getViewport().add(userInput);
        scroll.setPreferredSize(new Dimension(200,100));

        panel.add(scroll,c);








        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
