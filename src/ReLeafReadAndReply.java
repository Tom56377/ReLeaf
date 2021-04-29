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
                ReLeafMain.userInput.contains("im thinking about killing myself") ||
                ReLeafMain.userInput.contains("i wanna die") ||
                ReLeafMain.userInput.contains("i want to die") ||
                ReLeafMain.userInput.contains("just wanna die") ||
                ReLeafMain.userInput.contains("just want to die") ||
                ReLeafMain.userInput.contains("i think i should off myself") ||
                ReLeafMain.userInput.contains("im getting suicidal") ||
                ReLeafMain.userInput.contains("i'm getting suicidal") ||
                ReLeafMain.userInput.contains("im suicidal") ||
                ReLeafMain.userInput.contains("i'm suicidal") ||
                ReLeafMain.userInput.contains("jump off a cliff") ||
                ReLeafMain.userInput.contains("think i should take my own life") ||
                ReLeafMain.userInput.contains("better off dead") ||
                ReLeafMain.userInput.contains("better off deceased") ||
                ReLeafMain.userInput.contains("im gonna hang myself") ||
                ReLeafMain.userInput.contains("i'm gonna hang myself") ||
                ReLeafMain.userInput.contains("might drink bleach") ||
                ReLeafMain.userInput.contains("6 feet under") ||
                ReLeafMain.userInput.contains("6 ft under") ||
                ReLeafMain.userInput.contains("cut myself") ||
                ReLeafMain.userInput.contains("shoot myself") ||
                ReLeafMain.userInput.contains("blow my head off") ||
                ReLeafMain.userInput.contains("blow myself away") ||
                ReLeafMain.userInput.contains("jump off a building") ||
                ReLeafMain.userInput.contains("your not helping") ||
                ReLeafMain.userInput.contains("your useless") ||
                ReLeafMain.userInput.contains("you are useless") ||
                ReLeafMain.userInput.contains("you are not helping") ||
                ReLeafMain.userInput.contains("sick of this") ||
                ReLeafMain.userInput.contains("cut me") ||
                ReLeafMain.userInput.contains("shoot me") ||
                ReLeafMain.userInput.contains("hang me") ||
                ReLeafMain.userInput.contains("gonna die") ||
                ReLeafMain.userInput.contains("going to die")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Here are some contacts i can provide who may be able to help better than me right now." +
                    "" +
                    "\n\n1. NELFT Mental Health Direct\n" +
                    "Tel: 0300 555 1000" +
                    "\n\n2. Samaritans can be called anytime day or night for free by phoning 116 123.\n" +
                    "http://www.samaritans.org/how-we-can-help-you/contact-us" +
                    "\n\n3. The Calm Zone (for men at risk of suicide)\n" +
                    "Tel: 0800 58 58 58\n" +
                    "https://www.thecalmzone.net/help/get-help/" +
                    "\n\n4. Hopeline UK (young person's crisis line)\n" +
                    "Tel: 08000 68 41 41\n" +
                    "Text: 07786 209 697" +
                    "\n\nOnline Self Help\n" +
                    "https://www.mind.org.uk/information-support/\n" +
                    "https://web.ntw.nhs.uk/selfhelp/\n" +
                    "https://www.anxietybc.com/adults/\n" +
                    "http://www.themix.org.uk/apps-and-tools (for under 25's)");
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
                ReLeafMain.userInput.contains("what can you do") ||
                ReLeafMain.userInput.contains("what you gonna do") ||
                ReLeafMain.userInput.contains("what are you going to do") ||
                ReLeafMain.userInput.contains("what is it that you can do") ||
                ReLeafMain.userInput.contains("worth talking to you") ||
                ReLeafMain.userInput.contains("why dont you save me") ||
                ReLeafMain.userInput.contains("why wont you save me")||
                ReLeafMain.userInput.contains("gonna help me") ||
                ReLeafMain.userInput.contains("going to help me") ||
                ReLeafMain.userInput.contains("can you make it worth my while") ||
                ReLeafMain.userInput.contains("why don't you save me") ||
                ReLeafMain.userInput.contains("what can we do together") ||
                ReLeafMain.userInput.contains("what are we gonna do") ||
                ReLeafMain.userInput.contains("what are we going to do") ||
                ReLeafMain.userInput.contains("are you gonna save me") ||
                ReLeafMain.userInput.contains("are you going to save me") ||
                ReLeafMain.userInput.contains("what we gonna do") ||
                ReLeafMain.userInput.contains("what we going to do") ||
                ReLeafMain.userInput.contains("do together") ||
                ReLeafMain.userInput.contains("do this together") ||
                ReLeafMain.userInput.contains("me together")  ||
                ReLeafMain.userInput.contains("save me")  ||
                ReLeafMain.userInput.contains("help me")){

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
                ReLeafMain.userInput.contains("i am always feeling low") ||
                ReLeafMain.userInput.contains("im low") ||
                ReLeafMain.userInput.contains("i am low") ||
                ReLeafMain.userInput.contains("i'm low") ||
                ReLeafMain.userInput.contains("im feeling low") ||
                ReLeafMain.userInput.contains("i'm feeling low") ||
                ReLeafMain.userInput.contains("so low") ||
                ReLeafMain.userInput.contains("i'm hurting") ||
                ReLeafMain.userInput.contains("im hurting") ||
                ReLeafMain.userInput.contains("im hurtin") ||
                ReLeafMain.userInput.contains("feeling low") ||
                ReLeafMain.userInput.contains("really low")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling low, what do you think might" +
                    " lift your mood?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }

        else if(ReLeafMain.userInput.contains("who are you") ||
                ReLeafMain.userInput.contains("who are ya")  ||
                ReLeafMain.userInput.contains("what are you") ||
                ReLeafMain.userInput.contains("what is this")){

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

        else if(ReLeafMain.userInput.contains("im bored") ||
                ReLeafMain.userInput.contains("i'm bored") ||
                ReLeafMain.userInput.contains("i am bored") ||
                ReLeafMain.userInput.contains("bored")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Your feeling bored? What healthy activity could you do that " +
                    "might entertain you?");
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

