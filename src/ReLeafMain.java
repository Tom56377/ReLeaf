import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ReLeafMain {

    /*global userInput reference*/
    public static String userInput;
    /*global reLeafMessage reference*/
    public static JTextArea reLeafMainMessageBox = new JTextArea("ReLeaf: Hello, how can I help you today?"); //ReLeaf default message

    public static void JFrameReLeaf(){

        /*create window*/
        JFrame frame = new JFrame("ReLeaf");  //create frame
        frame.getContentPane().setPreferredSize(new Dimension(500,350));


        /*set panel and layout*/
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.add(panel);


        /*userInput text area*/
        JScrollPane scroll1 = new JScrollPane ();
        scroll1.setVerticalScrollBarPolicy(scroll1.VERTICAL_SCROLLBAR_ALWAYS);
        reLeafMainMessageBox.setFont(new Font("Arial", Font.BOLD, 12));
        reLeafMainMessageBox.setLineWrap(true);
        reLeafMainMessageBox.setWrapStyleWord(true);
        reLeafMainMessageBox.setEditable(false);
        c.gridx = 1;
        c.gridy = 0;
        scroll1.getViewport().add(reLeafMainMessageBox);
        scroll1.setPreferredSize(new Dimension(200,100));
        panel.add(scroll1,c);


        /*userInput text area*/
        JScrollPane scroll2 = new JScrollPane ();
        scroll2.setVerticalScrollBarPolicy(scroll2.VERTICAL_SCROLLBAR_ALWAYS);
        JTextArea userTextArea = new JTextArea();
        userTextArea.setFont(new Font("Arial", Font.BOLD, 12));
        userTextArea.setLineWrap(true);
        c.gridx = 1;
        c.gridy = 3;
        scroll2.getViewport().add(userTextArea);
        scroll2.setPreferredSize(new Dimension(200,100));
        panel.add(scroll2,c);


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
                userInput = userTextArea.getText();
                reLeafMainMessageBox.append("\n\nUser: " + userInput);
                reLeafMainMessageBox.setCaretPosition(reLeafMainMessageBox.getDocument().getLength());
                userInput = userTextArea.getText().toLowerCase();
                userTextArea.setText("");
                ReLeafReadAndReply.GenerateResponse();
            }
        });



        /*create window continued*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
