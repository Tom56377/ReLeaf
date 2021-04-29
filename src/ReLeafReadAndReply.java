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

        else if(ReLeafMain.userInput.contains("im happy") ||
                ReLeafMain.userInput.contains("i'm happy") ||
                ReLeafMain.userInput.contains("i am happy") ||
                ReLeafMain.userInput.equals("i am elated") ||
                ReLeafMain.userInput.contains("im elated") ||
                ReLeafMain.userInput.equals("i'm elated")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Amazing, i am pleased to hear you are happy.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }


        else if(ReLeafMain.userInput.contains("sad") ||
                ReLeafMain.userInput.contains("im feeling sad")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling sad. What constructive " +
                    " things could you do to lift your mood");
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
                ReLeafMain.userInput.contains("going to die") ||
                ReLeafMain.userInput.contains("suicide") ||
                ReLeafMain.userInput.contains("suicidal") ||
                ReLeafMain.userInput.contains("kill") ||
                ReLeafMain.userInput.contains("harm") ||
                ReLeafMain.userInput.contains("hurt") ||
                ReLeafMain.userInput.contains("this is annoying") ||
                ReLeafMain.userInput.contains("annoying me now") ||
                ReLeafMain.userInput.contains("this is a joke") ||
                ReLeafMain.userInput.contains("your so annoying") ||
                ReLeafMain.userInput.contains("your a joke") ||
                ReLeafMain.userInput.contains("you are annoying") ||
                ReLeafMain.userInput.contains("you are a joke") ||
                ReLeafMain.userInput.contains("this is a calamity") ||
                ReLeafMain.userInput.contains("stop being annoying") ||
                ReLeafMain.userInput.contains("annoying me") ||
                ReLeafMain.userInput.contains("this is crap")){

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
                ReLeafMain.userInput.contains("im alright")  ||
                ReLeafMain.userInput.contains("doing alright") ||
                ReLeafMain.userInput.contains("doing ok") ||
                ReLeafMain.userInput.contains("doin alright") ||
                ReLeafMain.userInput.contains("doin ok")){

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
                ReLeafMain.userInput.contains("save me") ||
                ReLeafMain.userInput.contains("help") ||
                ReLeafMain.userInput.contains("solution") ||
                ReLeafMain.userInput.contains("solutions") ||
                ReLeafMain.userInput.contains("something for me") ||
                ReLeafMain.userInput.contains("summin for me")){

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

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling low,  What do you think might be bringing you down?" +
                    " What do you think might lift your mood?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }

        else if(ReLeafMain.userInput.contains("who are you") ||
                ReLeafMain.userInput.contains("who are ya")  ||
                ReLeafMain.userInput.contains("what are you") ||
                ReLeafMain.userInput.contains("what is this") ||
                ReLeafMain.userInput.contains("what am i looking for here")  ||
                ReLeafMain.userInput.contains("whats the point in this") ||
                ReLeafMain.userInput.contains("what is the point here")  ||
                ReLeafMain.userInput.contains("what is the point in this") ||
                ReLeafMain.userInput.contains("this is pointless")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I am a robot and I can offer you a range of responses which" +
                    " may help you figure out your current issue, or at least i can be just someone to talk to.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("do you love me") ||
                ReLeafMain.userInput.contains("can you love me") ||
                ReLeafMain.userInput.contains("will you love me") ||
                ReLeafMain.userInput.contains("i want to be in love") ||
                ReLeafMain.userInput.contains("i want love") ||
                ReLeafMain.userInput.contains("i want someone to love") ||
                ReLeafMain.userInput.contains("i want somebody to love")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: The question is do you love yourself? Maybe finding" +
                    " a way to have love for yourself is the right solution.");
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

        else if(ReLeafMain.userInput.contains("what colors the sun") ||
                ReLeafMain.userInput.contains("what colour is the sun") ||
                ReLeafMain.userInput.contains("what colours the sun") ||
                ReLeafMain.userInput.contains("what color is the sun")  ||
                ReLeafMain.userInput.contains("what is the colour of the sun") ||
                ReLeafMain.userInput.contains("what is the color of the sun") ||
                ReLeafMain.userInput.contains("whats the colour of the sun") ||
                ReLeafMain.userInput.contains("whats the color of the sun") ||
                ReLeafMain.userInput.contains("what's the colour of the sun") ||
                ReLeafMain.userInput.contains("what's the color of the sun")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Its yellow of course.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("what colors the moon") ||
                ReLeafMain.userInput.contains("what colour is the moon") ||
                ReLeafMain.userInput.contains("what colours the moon") ||
                ReLeafMain.userInput.contains("what color is the moon") ||
                ReLeafMain.userInput.contains("what is the colour of the moon") ||
                ReLeafMain.userInput.contains("what is the color of the moon") ||
                ReLeafMain.userInput.contains("whats the colour of the moon") ||
                ReLeafMain.userInput.contains("whats the color of the moon") ||
                ReLeafMain.userInput.contains("what's the colour of the moon") ||
                ReLeafMain.userInput.contains("what's the color of the moon")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Its grey.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("whats your favorite colour") ||
                ReLeafMain.userInput.contains("what's your favorite colour") ||
                ReLeafMain.userInput.contains("whats your favorite color") ||
                ReLeafMain.userInput.contains("what's your favorite color") ||
                ReLeafMain.userInput.contains("what is your favorite colour") ||
                ReLeafMain.userInput.contains("what is your favorite color") ||
                ReLeafMain.userInput.contains("do you have a favorite colour") ||
                ReLeafMain.userInput.contains("do you have a favorite color") ||
                ReLeafMain.userInput.contains("whats your favourite colour") ||
                ReLeafMain.userInput.contains("what's your favourite colour") ||
                ReLeafMain.userInput.contains("whats your favourite color") ||
                ReLeafMain.userInput.contains("what's your favourite color") ||
                ReLeafMain.userInput.contains("what is your favourite colour") ||
                ReLeafMain.userInput.contains("what is your favourite color") ||
                ReLeafMain.userInput.contains("do you have a favourite colour") ||
                ReLeafMain.userInput.contains("your favourite color") ||
                ReLeafMain.userInput.contains("your favourite colour") ||
                ReLeafMain.userInput.contains("do you have a favourite color") ||
                ReLeafMain.userInput.contains("your favorite colour") ||
                ReLeafMain.userInput.contains("your favorite color")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: My favourite colour is Green.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("biggest animal") ||
                ReLeafMain.userInput.contains("largest animal") ||
                ReLeafMain.userInput.contains("largest creature") ||
                ReLeafMain.userInput.contains("biggest creature") ||
                ReLeafMain.userInput.contains("largest living thing") ||
                ReLeafMain.userInput.contains("biggest living thing") ||
                ReLeafMain.userInput.contains("largest thing alive") ||
                ReLeafMain.userInput.contains("biggest thing to have ever lived") ||
                ReLeafMain.userInput.contains("biggest thing to have lived") ||
                ReLeafMain.userInput.contains("largest thing to have ever lived") ||
                ReLeafMain.userInput.contains("largest thing to have lived")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: The Blue Whale.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("sing to me") ||
                ReLeafMain.userInput.contains("can you sing") ||
                ReLeafMain.userInput.contains("can you sing me a song") ||
                ReLeafMain.userInput.contains("what songs can you sing") ||
                ReLeafMain.userInput.contains("sing me a song") ||
                ReLeafMain.userInput.contains("are you gonna sing") ||
                ReLeafMain.userInput.contains("are you going to sing") ||
                ReLeafMain.userInput.contains("lets sing")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I am a robot and have no vocal cords," +
                    " sorry my friend.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("whats your favorite number") ||
                ReLeafMain.userInput.contains("what's your favorite number") ||
                ReLeafMain.userInput.contains("what is your favorite number") ||
                ReLeafMain.userInput.contains("do you have a favorite number") ||
                ReLeafMain.userInput.contains("whats your favourite number") ||
                ReLeafMain.userInput.contains("what's your favourite number") ||
                ReLeafMain.userInput.contains("what is your favourite number") ||
                ReLeafMain.userInput.contains("do you have a favourite number")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I like all numbers, even the minus ones.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("where you from") ||
                ReLeafMain.userInput.contains("where do you come from") ||
                ReLeafMain.userInput.contains("where are you from") ||
                ReLeafMain.userInput.contains("where was you born") ||
                ReLeafMain.userInput.contains("whats your location") ||
                ReLeafMain.userInput.contains("what's your location") ||
                ReLeafMain.userInput.contains("what is your location") ||
                ReLeafMain.userInput.contains("do you live")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I was created on and inhabit planet Earth, in the " +
                    "United Kingdom.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("are you alive") ||
                ReLeafMain.userInput.contains("are you living")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I am a robot so i am not a " +
                    "living thing.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("tell me something interesting") ||
                ReLeafMain.userInput.contains("interest me") ||
                ReLeafMain.userInput.contains("make me interested") ||
                ReLeafMain.userInput.contains("do something interesting")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: What sort of constructive things " +
                    "interest you?");
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

