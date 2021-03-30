import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class ReLeafMain {

    /*global userInput reference*/
    public static String userInput;
    /*global reLeafMessage reference*/
    public static JTextArea reLeafMainMessageBox = new JTextArea("ReLeaf: Hello, how can I help you today?"); //ReLeaf default message

    public static void JFrameReLeaf(){

        /*create window*/
        JFrame frame = new JFrame("ReLeaf");  //create frame
        frame.getContentPane().setPreferredSize(new Dimension(500,350));
        /*create window continued*/
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(235, 255, 235));


        /*userInput text area*/
        JScrollPane scroll1 = new JScrollPane ();
        scroll1.setVerticalScrollBarPolicy(scroll1.VERTICAL_SCROLLBAR_ALWAYS);
        reLeafMainMessageBox.setFont(new Font("Arial", Font.BOLD, 14));
        reLeafMainMessageBox.setBackground(new Color(217, 255, 217));
        reLeafMainMessageBox.setLineWrap(true);
        reLeafMainMessageBox.setWrapStyleWord(true);
        reLeafMainMessageBox.setEditable(false);
        scroll1.getViewport().add(reLeafMainMessageBox);
        scroll1.setBounds(50,50,1200,400);
        frame.add(scroll1);


        /*userInput text area*/
        JScrollPane scroll2 = new JScrollPane ();
        scroll2.setVerticalScrollBarPolicy(scroll2.VERTICAL_SCROLLBAR_ALWAYS);
        JTextArea userTextArea = new JTextArea();
        userTextArea.setFont(new Font("Arial", Font.BOLD, 14));
        userTextArea.setBackground(new Color(217, 255, 217));
        userTextArea.setLineWrap(true);
        scroll2.getViewport().add(userTextArea);
        scroll2.setBounds(50,450,700,200);
        frame.add(scroll2);


        /*button and listener for get userInput*/
        JButton sendButton = new JButton("Send");
        sendButton.setBounds(800,500,100,50);
        frame.add(sendButton);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*get userInput and convert to lowercase for better readability,
                clear userTextArea and run the generate response method*/

                userInput = userTextArea.getText().trim();

                if(userInput.isEmpty() || userInput.equals(" ")){}
                    else{
                        userInput = userTextArea.getText().replaceFirst("\\s++$", "");
                        reLeafMainMessageBox.append("\n\nUser: " + userInput);
                        reLeafMainMessageBox.setCaretPosition(reLeafMainMessageBox.getDocument().getLength());
                        userInput = userTextArea.getText().toLowerCase();
                        userTextArea.setText("");
                        ReLeafReadAndReply.GenerateResponse();}
            }
        });


        /*added to stop last element(button) from glitching*/
        JLabel label = new JLabel();
        frame.add(label);
        label.setBounds(0,0,0,0);

        Image image = Toolkit.getDefaultToolkit().getImage(ReLeafMain.class.getResource("releaf_icon.png"));
        frame.setIconImage(image);






    }

}
