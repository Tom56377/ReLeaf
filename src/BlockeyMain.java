import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class BlockeyMain {

    /*global userInput reference*/
    public static String userInput;
    /*global blockeyMessage reference*/
    public static JLabel blockeyMessage = new JLabel("Hello, how can I help you today?",SwingConstants.CENTER); //blockey default message


    public static void JFrameBlockey(){

        /*create window*/
        JFrame frame = new JFrame("Blockey");  //create frame
        frame.getContentPane().setPreferredSize(new Dimension(500,350));


        /*set panel and layout*/
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.add(panel);


        /*blockey message label*/
        blockeyMessage.setPreferredSize(new Dimension(200,100));
        blockeyMessage.setFont(new Font("Arial", Font.BOLD, 12));
        c.gridx = 1;
        c.gridy = 0;
        panel.add(blockeyMessage,c);


        /*userInput text area*/
        JScrollPane scroll = new JScrollPane ();
        scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
        JTextArea userTextArea = new JTextArea();
        userTextArea.setFont(new Font("Arial", Font.BOLD, 12));
        userTextArea.setLineWrap(true);
        c.gridx = 1;
        c.gridy = 3;
        scroll.getViewport().add(userTextArea);
        scroll.setPreferredSize(new Dimension(200,100));
        panel.add(scroll,c);


        /*button and listener for get userInput*/
        JButton sendButton = new JButton("send");
        c.gridx = 2;
        c.gridy = 3;
        panel.add(sendButton,c);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*get userInput and convert to lowercase for better readability,
                clear userTextArea and run the generate response method*/
                userInput = userTextArea.getText().toLowerCase();
                userTextArea.setText("");
                BlockeyReadAndReply.GenerateResponse();
            }
        });



        /*create window continued*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
