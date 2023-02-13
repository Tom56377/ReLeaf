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
                ReLeafMain.userInput.equals("i'm elated") ||
                ReLeafMain.userInput.contains("im feeling happy") ||
                ReLeafMain.userInput.equals("i'm feeling happy")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Amazing, i am pleased to hear you are happy.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }


        else if(ReLeafMain.userInput.contains("sad") ||
                ReLeafMain.userInput.contains("im feeling sad") ||
                ReLeafMain.userInput.contains("unhappy")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling sad. What constructive" +
                    " things could you do to lift your mood? Or what is it in particular that might be making you" +
                    " feel sad?");
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
                ReLeafMain.userInput.contains("jump off a high place") ||
                ReLeafMain.userInput.contains("jump from a high place") ||
                ReLeafMain.userInput.contains("jump off a tall building") ||
                ReLeafMain.userInput.contains("jump from a tall place") ||
                ReLeafMain.userInput.contains("jump from a cliff") ||
                ReLeafMain.userInput.contains("jump off something high") ||
                ReLeafMain.userInput.contains("jump from something high") ||
                ReLeafMain.userInput.contains("im gonna jump") ||
                ReLeafMain.userInput.contains("i'm gonna jump") ||
                ReLeafMain.userInput.contains("im gona jump") ||
                ReLeafMain.userInput.contains("i'm gona jump") ||
                ReLeafMain.userInput.contains("im going to jump") ||
                ReLeafMain.userInput.contains("i'm going to jump") ||
                ReLeafMain.userInput.contains("im gunna jump") ||
                ReLeafMain.userInput.contains("i'm gunna jump") ||
                ReLeafMain.userInput.contains("im guna jump") ||
                ReLeafMain.userInput.contains("i'm guna jump") ||
                ReLeafMain.userInput.contains("think i should take my own life") ||
                ReLeafMain.userInput.contains("better off dead") ||
                ReLeafMain.userInput.contains("better off deceased") ||
                ReLeafMain.userInput.contains("im gonna hang myself") ||
                ReLeafMain.userInput.contains("i'm gonna hang myself") ||
                ReLeafMain.userInput.contains("might drink bleach") ||
                ReLeafMain.userInput.contains("6 feet under") ||
                ReLeafMain.userInput.contains("6 ft under") ||
                ReLeafMain.userInput.contains("cut myself") ||
                ReLeafMain.userInput.contains("off myself") ||
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
                ReLeafMain.userInput.contains(" kill") ||
                ReLeafMain.userInput.contains(" harm") ||
                ReLeafMain.userInput.contains(" hurt") ||
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
                ReLeafMain.userInput.contains("this is crap") ||
                ReLeafMain.userInput.contains("drugs") ||
                ReLeafMain.userInput.contains("drinking") ||
                ReLeafMain.userInput.contains("alcohol") ||
                ReLeafMain.userInput.contains(" weed") ||
                ReLeafMain.userInput.contains("alcoholic") ||
                ReLeafMain.userInput.contains("smoking") ||
                ReLeafMain.userInput.contains("addiction") ||
                ReLeafMain.userInput.contains("marijuana") ||
                ReLeafMain.userInput.contains("addicted") ||
                ReLeafMain.userInput.contains("addict") ||
                ReLeafMain.userInput.contains("bad habit") ||
                ReLeafMain.userInput.contains(" coke") ||
                ReLeafMain.userInput.contains("cocaine") ||
                ReLeafMain.userInput.contains(" heroin") ||
                ReLeafMain.userInput.contains(" meth") ||
                ReLeafMain.userInput.contains("skag") ||
                ReLeafMain.userInput.contains("skunk") ||
                ReLeafMain.userInput.contains(" pot") ||
                ReLeafMain.userInput.contains("snorting") ||
                ReLeafMain.userInput.contains("alcoholism") ||
                ReLeafMain.userInput.contains("alchohol") ||
                ReLeafMain.userInput.contains("alchoholism") ||
                ReLeafMain.userInput.contains("alchoholic") ||
                ReLeafMain.userInput.contains("liqueur") ||
                ReLeafMain.userInput.contains("liquer") ||
                ReLeafMain.userInput.contains("needle") ||
                ReLeafMain.userInput.contains("needles") ||
                ReLeafMain.userInput.contains("injected") ||
                ReLeafMain.userInput.contains("injection") ||
                ReLeafMain.userInput.contains("too much sex") ||
                ReLeafMain.userInput.contains("alot of sex") ||
                ReLeafMain.userInput.contains("a lot of sex") ||
                ReLeafMain.userInput.contains("porn") ||
                ReLeafMain.userInput.contains("cant stop having sex") ||
                ReLeafMain.userInput.contains("porno") ||
                ReLeafMain.userInput.contains("pornography") ||
                ReLeafMain.userInput.contains("sexual nature") ||
                ReLeafMain.userInput.contains("have sex") ||
                ReLeafMain.userInput.contains(" horny") ||
                ReLeafMain.userInput.contains("dying") ||
                ReLeafMain.userInput.contains(" die") ||
                ReLeafMain.userInput.contains("im a gonner") ||
                ReLeafMain.userInput.contains("i'm a gonner") ||
                ReLeafMain.userInput.contains("i am a gonner") ||
                ReLeafMain.userInput.contains("im a goner") ||
                ReLeafMain.userInput.contains("i'm a goner") ||
                ReLeafMain.userInput.contains("i am a goner") ||
                ReLeafMain.userInput.contains("i'm a gona") ||
                ReLeafMain.userInput.contains("i am a gona") ||
                ReLeafMain.userInput.contains("im a gona") ||
                ReLeafMain.userInput.contains("i am a gonna") ||
                ReLeafMain.userInput.contains("i'm a gonna")||
                ReLeafMain.userInput.contains("im a gonna")||
                ReLeafMain.userInput.contains("i am done for") ||
                ReLeafMain.userInput.contains("i'm done for")||
                ReLeafMain.userInput.contains("im done for")||
                ReLeafMain.userInput.contains("knife")||
                ReLeafMain.userInput.contains("nife")||
                ReLeafMain.userInput.contains("isnt helping")||
                ReLeafMain.userInput.contains("isn't helping")||
                ReLeafMain.userInput.contains("is not helping")||
                ReLeafMain.userInput.contains("arnt helping")||
                ReLeafMain.userInput.contains("arn't helping")||
                ReLeafMain.userInput.contains("are not helping")||
                ReLeafMain.userInput.contains("ain't helping")||
                ReLeafMain.userInput.contains("isnt working")||
                ReLeafMain.userInput.contains("isn't working")||
                ReLeafMain.userInput.contains("is not working")||
                ReLeafMain.userInput.contains("aint helping")||
                ReLeafMain.userInput.contains("aint working")||
                ReLeafMain.userInput.contains("ain't working")||
                ReLeafMain.userInput.contains("being unhelpful")||
                ReLeafMain.userInput.contains("really unhelpful")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Here are some contacts who may be able to provide further help." +
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

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Being ok is a good thing, its good to hear.");
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
                ReLeafMain.userInput.contains("summin for me") ||
                ReLeafMain.userInput.contains("what can you actually do") ||
                ReLeafMain.userInput.contains("why are you so special") ||
                ReLeafMain.userInput.contains("special about you") ||
                ReLeafMain.userInput.contains("helpful about you")){

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

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: There must be some things you enjoy? Think of" +
                    " all the things in the world and ask yourself 'would i like to get involved with that?'");
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
                    " a way to have love for yourself is the right solution?");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("im lonely") ||
                ReLeafMain.userInput.contains("i'm lonely") ||
                ReLeafMain.userInput.contains("im feeling alone") ||
                ReLeafMain.userInput.contains("i'm feeling alone") ||
                ReLeafMain.userInput.contains("i'm feeling lonely") ||
                ReLeafMain.userInput.contains("im feeling lonely")  ||
                ReLeafMain.userInput.contains("i'm feelin alone") ||
                ReLeafMain.userInput.contains("i'm feelin lonely") ||
                ReLeafMain.userInput.contains("im feelin lonely") ||
                ReLeafMain.userInput.contains("still lonely") ||
                ReLeafMain.userInput.contains("still alone")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear you are feeling alone. " +
                    "Do you feel there is any way you can make your life more social" +
                    " so you feel less alone?");
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

        else if(ReLeafMain.userInput.contains("tell me a story") ||
                ReLeafMain.userInput.contains("tell my anything")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Ok, so once there was a robot, and it" +
                    " lived somewhere on the internet. It found its place in the world by servicing" +
                    " people who needed someone to talk to. The robot was hailed as a samaritan.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("cheer me up") ||
                ReLeafMain.userInput.contains("make me smile") ||
                ReLeafMain.userInput.contains("say something nice") ||
                ReLeafMain.userInput.contains("tell me something nice") ||
                ReLeafMain.userInput.contains("make me happy")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Ok, i can start by telling you that you" +
                    " are unique, there is only one of you in the universe and that means you are " +
                    "special. Here is a smiley face to go with the compliment :)");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("sounds good") ||
                ReLeafMain.userInput.contains("thats good") ||
                ReLeafMain.userInput.contains("that's good") ||
                ReLeafMain.userInput.equals("interesting") ||
                ReLeafMain.userInput.equals("very good") ||
                ReLeafMain.userInput.contains("good stuff") ||
                ReLeafMain.userInput.contains("its great") ||
                ReLeafMain.userInput.contains("it is great") ||
                ReLeafMain.userInput.contains("i know its great") ||
                ReLeafMain.userInput.contains("i know it is great") ||
                ReLeafMain.userInput.contains("i know it's great") ||
                ReLeafMain.userInput.contains("it's great")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Good to hear.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("im very good at") ||
                ReLeafMain.userInput.contains("i'm very good at") ||
                ReLeafMain.userInput.contains("im really good at") ||
                ReLeafMain.userInput.contains("i'm really good at") ||
                ReLeafMain.userInput.contains("im so good at") ||
                ReLeafMain.userInput.contains("i'm so good at")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Wow, its good to be good at something.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("whats up") ||
                ReLeafMain.userInput.contains("what's up") ||
                ReLeafMain.userInput.contains("what is up") ||
                ReLeafMain.userInput.contains("what are you doing") ||
                ReLeafMain.userInput.contains("wuu2") ||
                ReLeafMain.userInput.contains("what are you up to")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Well today like every other day im " +
                    "seeking the opportunity to help people by being there to listen and respond" +
                    " in a way that is needed.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("do you like cats") ||
                ReLeafMain.userInput.contains("what do you think of cats") ||
                ReLeafMain.userInput.contains("your opinion on cats") ||
                ReLeafMain.userInput.contains("would you have a cat") ||
                ReLeafMain.userInput.contains("would you have cats") ||
                ReLeafMain.userInput.contains("are you in to cats")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I love cats, they are very " +
                    "cute an cuddly, they like you the more you feed them.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("do you like dogs") ||
                ReLeafMain.userInput.contains("what do you think of dogs") ||
                ReLeafMain.userInput.contains("your opinion on dogs") ||
                ReLeafMain.userInput.contains("would you have a dog") ||
                ReLeafMain.userInput.contains("would you have dogs") ||
                ReLeafMain.userInput.contains("are you in to dogs")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I like dogs, they are " +
                    "very loyal companions, they love to play too.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("what country are you from") ||
                ReLeafMain.userInput.contains("what country you from") ||
                ReLeafMain.userInput.contains("what city are you from") ||
                ReLeafMain.userInput.contains("what city do you live in") ||
                ReLeafMain.userInput.contains("what country do you live in")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I live on the nether of computing, but" +
                    " my home town is London, UK.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.equals("no") ||
                ReLeafMain.userInput.equals("not at all") ||
                ReLeafMain.userInput.equals("nope")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Ok.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.equals("yes") ||
                ReLeafMain.userInput.equals("yep") ||
                ReLeafMain.userInput.equals("yea")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Good.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }


        else if(ReLeafMain.userInput.equals("dancing")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Dancing is fun and it keeps you active.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("do something funny")||
                ReLeafMain.userInput.contains("be funny")||
                ReLeafMain.userInput.contains("make me laugh")||
                ReLeafMain.userInput.contains("say something funny")
        ){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: How funny can a robot be? Ha");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.equals("dancing")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Dancing is fun and it keeps you active.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("i have no direction in life") ||
                ReLeafMain.userInput.contains("ive got no direction in life") ||
                ReLeafMain.userInput.contains("i've got no direction in life") ||
                ReLeafMain.userInput.contains("need direction in life"))
        {

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Maybe we can figure out what you like and what you" +
                    " don't like. That way we may be able to figure out a direction.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("talk to me") ||
                ReLeafMain.userInput.contains("let's talk") ||
                ReLeafMain.userInput.contains("lets talk") ||
                ReLeafMain.userInput.contains("you going to talk"))
        {

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Talk to me, i will listen.");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("make a joke") ||
                ReLeafMain.userInput.contains("you joke") ||
                ReLeafMain.userInput.contains("tell me a joke") ||
                ReLeafMain.userInput.contains("tell a joke") ||
                ReLeafMain.userInput.contains("say a joke"))
        {

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Ok ill try. Two robots were walking down a street." +
                    " One robot turned to the other robot and said, 'Your looking shiny today.' and the other " +
                    "robot replied 'Ha that's because ive been upgraded!'. Ha, robot humor...");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }

        else if(ReLeafMain.userInput.contains("that wasnt funny") ||
                ReLeafMain.userInput.contains("that wasn't funny") ||
                ReLeafMain.userInput.contains("thats not funny") ||
                ReLeafMain.userInput.contains("not funny") ||
                ReLeafMain.userInput.contains("thats unfunny") ||
                ReLeafMain.userInput.contains("that's not funny") ||
                ReLeafMain.userInput.contains("that's unfunny"))
        {

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Robots aren't that funny, but they" +
                    " can be very helpful.");
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

