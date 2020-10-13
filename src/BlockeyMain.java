import javax.swing.*;
import java.awt.*;

public class BlockeyMain {

    public static void JFrameBlockey(){

        JFrame frame = new JFrame("Blockey");  //create frame
        frame.getContentPane().setPreferredSize(new Dimension(500,350));

        FlowLayout layout = new FlowLayout(FlowLayout.CENTER,40,40); //add flow layout for buttons

        /*blockey message positioning*/
        JPanel panelBlockeyMessage = new JPanel(); //add panel for buttons and add to frame
        panelBlockeyMessage.setLayout(layout);
        frame.add(panelBlockeyMessage);

        /*user input positioning*/
        JPanel panelUserInput = new JPanel(); //add panel for buttons and add to frame
        panelBlockeyMessage.setLayout(layout);
        frame.add(panelUserInput);


        /*blockey message label*/
        JLabel blockeyMessage = new JLabel("hello, how can I help you today?"); //blockey default message
        blockeyMessage.setPreferredSize(new Dimension(200,100));
        blockeyMessage.setFont(new Font("Arial", Font.BOLD, 12));
        panelBlockeyMessage.add(blockeyMessage);


        JTextArea userInput = new JTextArea();
        userInput.setPreferredSize(new Dimension(200,100));
        blockeyMessage.setFont(new Font("Arial", Font.BOLD, 12));
        panelUserInput.add(userInput);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
