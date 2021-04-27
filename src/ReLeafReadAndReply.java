import java.awt.*;

public class ReLeafReadAndReply {

    /*method for reading userInput and generating a response*/
    public static void GenerateResponse(){

        if(ReLeafMain.userInput.equals("hello") ||
                ReLeafMain.userInput.equals("hi") ||
                ReLeafMain.userInput.contains("hi my name is") ||
                ReLeafMain.userInput.contains("hi, my name is") ||
                ReLeafMain.userInput.contains("hello my name is") ||
                ReLeafMain.userInput.contains("hello im") ||
                ReLeafMain.userInput.contains("hiya im") ||
                ReLeafMain.userInput.contains("hiya my name is") ||
                ReLeafMain.userInput.equals("hiya")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Hello, how are you?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("happy")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Amazing, i am pleased to hear you are happy.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }


        else if(ReLeafMain.userInput.contains("sad") ||
                ReLeafMain.userInput.contains("im feeling sad")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling sad.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }


        else if(ReLeafMain.userInput.contains("i'm thinking about killing myself") ||
                ReLeafMain.userInput.contains("im thinking about killing myself")||
                ReLeafMain.userInput.contains("i wanna die")){

            ReLeafMain.reLeafMainMessageBox.append("Here are some contacts i can provide who may be able to help better than me right now." +
                    "" +
                    "\n\n1.Samaritans can be called anytime day or night for free by phoning 116 123.\n" +
                    "http://www.samaritans.org/how-we-can-help-you/contact-us\n");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }


        else if(ReLeafMain.userInput.contains("im ok") ||
                ReLeafMain.userInput.contains("i'm ok") ||
                ReLeafMain.userInput.contains("i'm alright") ||
                ReLeafMain.userInput.contains("im alright")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Being ok is positive, its good to hear.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }


        else if(ReLeafMain.userInput.contains("are you gonna help me") ||
                ReLeafMain.userInput.contains("are you going to help me") ||
                ReLeafMain.userInput.contains("help")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I can offer you a range of responses which" +
                    " may help you figure out your current issue, or at least i can be just someone to talk to.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }


        else if(ReLeafMain.userInput.contains("i dont know what to do with my life") ||
                ReLeafMain.userInput.contains("i don't know what to do with my life") ||
                ReLeafMain.userInput.contains("i dunno what to do with my life") ||
                ReLeafMain.userInput.contains("do you have any idea on what i should do with my life") ||
                ReLeafMain.userInput.contains("what should i do with my life") ||
                ReLeafMain.userInput.contains("what can i do")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: It sounds like you are confused, maybe we can find out what you enjoy and what" +
                    " you don't enjoy, that way we can find what it is you would like to do?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }

        else if(ReLeafMain.userInput.contains("i don't enjoy anything") ||
                ReLeafMain.userInput.contains("i dont enjoy anything") ||
                ReLeafMain.userInput.contains("i do not enjoy anything")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: There must be some things you enjoy?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }

        else if(ReLeafMain.userInput.contains("i'm always feeling low") ||
                ReLeafMain.userInput.contains("im always feeling low") ||
                ReLeafMain.userInput.contains("i am always feeling low")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling low, what do you think might" +
                    " lift your mood?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }

        else if(ReLeafMain.userInput.contains("i'm hurting") ||
                ReLeafMain.userInput.contains("im hurting") ||
                ReLeafMain.userInput.contains("im hurtin")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling low, what do you think might" +
                    " lift your mood?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("who are you") ||
                ReLeafMain.userInput.contains("who are ya")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I am a robot and I can offer you a range of responses which" +
                    " may help you figure out your current issue, or at least i can be just someone to talk to.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("do you love me") ||
                ReLeafMain.userInput.contains("can you love me") ||
                ReLeafMain.userInput.contains("will you love me") ||
                ReLeafMain.userInput.contains("love me")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: The question is do you love yourself?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("im lonely") ||
                ReLeafMain.userInput.contains("i'm lonely") ||
                ReLeafMain.userInput.contains("im feeling alone") ||
                ReLeafMain.userInput.contains("i'm feeling alone")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Do you feel there is any way you can make your life more social?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("whats the point in life") ||
                ReLeafMain.userInput.contains("what is the point in life") ||
                ReLeafMain.userInput.contains("what is the purpose of life") ||
                ReLeafMain.userInput.contains("what is the purpose in living")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Personally i feel the point in life is to live comfortably and" +
                    " be happy. How do you think we can achieve that?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("why am i here") ||
                ReLeafMain.userInput.contains("why do i exist") ||
                ReLeafMain.userInput.contains("whats my purpose") ||
                ReLeafMain.userInput.contains("what's my purpose")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: It seems you are feeling a bit purposeless, " +
                    "what do you think you could include in your life to make you feel you have more purpose?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }


        /*default communication issue message*/
        else {

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry i didn't quite catch that, could you make that clearer? " +
                    "*Please note that i can only interpret English language text*");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }



    }


}

