import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
        Image image = Toolkit.getDefaultToolkit().getImage(ReLeafMain.class.getResource("images/releaf_icon.png"));
        frame.setIconImage(image);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
        //frame.setLayout(new BorderLayout());

        /*loading screens*/
        BufferedImage ls = null;
        try {
            ls = ImageIO.read(new File("C:\\Users\\tbutt\\Documents\\IdeaProjects\\ce301_buttwell_tom_p_r\\src\\images\\indigo_logo_landscape.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setContentPane(new LoadingScreen(ls));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            ls = ImageIO.read(new File("C:\\Users\\tbutt\\Documents\\IdeaProjects\\ce301_buttwell_tom_p_r\\src\\images\\releaf_icon_wide.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setContentPane(new LoadingScreen(ls));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);


        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            ls = ImageIO.read(new File("C:\\Users\\tbutt\\Documents\\IdeaProjects\\ce301_buttwell_tom_p_r\\src\\images\\main_background.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setContentPane(new LoadingScreen(ls));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);


        /*userInput text area*/
        JScrollPane scroll1 = new JScrollPane();
        scroll1.setVerticalScrollBarPolicy(scroll1.VERTICAL_SCROLLBAR_ALWAYS);
        reLeafMainMessageBox.setFont(new Font("Arial", Font.BOLD, 14));
        reLeafMainMessageBox.setBackground(new Color(217, 255, 217));
        reLeafMainMessageBox.setLineWrap(true);
        reLeafMainMessageBox.setWrapStyleWord(true);
        reLeafMainMessageBox.setEditable(false);
        scroll1.getViewport().add(reLeafMainMessageBox);
        frame.add(scroll1);
        scroll1.setBounds(50,50,1200,400);

        Border border1 = BorderFactory.createLineBorder(Color.BLACK);
        reLeafMainMessageBox.setBorder(BorderFactory.createCompoundBorder(border1,
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        /*userInput text area*/
        JScrollPane scroll2 = new JScrollPane ();
        scroll2.setVerticalScrollBarPolicy(scroll2.VERTICAL_SCROLLBAR_ALWAYS);
        JTextArea userTextArea = new JTextArea();
        userTextArea.setFont(new Font("Arial", Font.BOLD, 14));
        userTextArea.setBackground(new Color(217, 255, 217));
        userTextArea.setLineWrap(true);
        scroll2.getViewport().add(userTextArea);
        frame.add(scroll2);
        scroll2.setBounds(50,450,700,200);

        Border border2 = BorderFactory.createLineBorder(Color.BLACK);
        userTextArea.setBorder(BorderFactory.createCompoundBorder(border2,
        BorderFactory.createEmptyBorder(10, 10, 10, 10)));

        /*button and listener for get userInput*/
        JButton sendButton = new JButton("Send");
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));
        sendButton.setForeground(Color.BLACK);
        sendButton.setBackground(new Color(217, 255, 217));
        sendButton.setBorder(new LineBorder(Color.BLACK));
        frame.add(sendButton);
        sendButton.setBounds(800,520,100,50);
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

        /*help button*/
        JButton helpButton = new JButton("Help");
        helpButton.setFont(new Font("Arial", Font.BOLD, 14));
        helpButton.setForeground(Color.BLACK);
        helpButton.setBackground(Color.WHITE);
        helpButton.setBorder(new LineBorder(Color.BLACK));
        frame.add(helpButton);
        helpButton.setBounds(1200,600,100,50);
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*open jFrame that proves help information*/
                JFrame helpFrame = new JFrame("ReLeaf Help");
                helpFrame.getContentPane().setPreferredSize(new Dimension(500,350));
                Image image2 = Toolkit.getDefaultToolkit().getImage(ReLeafMain.class.getResource("images/help_icon.png"));
                helpFrame.setIconImage(image2);
                //helpFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                helpFrame.pack();
                helpFrame.setLocationRelativeTo(null);
                helpFrame.setVisible(true);
                helpFrame.setLayout(new BorderLayout());
                //helpFrame.getContentPane().setBackground(new Color(235, 255, 235));

                JTextArea helpTextArea = new JTextArea("ReLeaf does not record or use your data, anything" +
                        " you say is essentially confidential.\n" +
                        "\n##HOW TO USE##\n" +
                        "Start by asking questions, anything that comes to mind, ReLeaf will offer" +
                        " responses\nand offer a virtual conversation.");
                helpTextArea.setEditable(false);
                helpFrame.add(helpTextArea);

            }
        });

        /*version label*/
        JLabel versionLabel = new JLabel("ReLeaf Version: 1.0");
        frame.add(versionLabel);
        versionLabel.setBounds(1195,580,200,200);


        /*added to stop last element(button) from glitching*/
        JLabel label = new JLabel();
        frame.add(label);
        label.setBounds(0,0,0,0);








    }

}
