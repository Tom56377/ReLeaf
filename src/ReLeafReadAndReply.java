public class ReLeafReadAndReply {

    /*method for reading userInput and generating a response*/
    public static void GenerateResponse(){

        if(ReLeafMain.userInput.contains("happy")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Amazing");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }
        else if(ReLeafMain.userInput.contains("sad")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Sorry to hear your feeling sad");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }
        else if(ReLeafMain.userInput.contains("i'm thinking about killing myself")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Ok, maybe suicide is not the right answer");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());
        }
        else if(ReLeafMain.userInput.contains("im ok")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: Being ok is good");
            ReLeafMain.reLeafMainMessageBox.setCaretPosition(ReLeafMain.reLeafMainMessageBox.getDocument().getLength());

        }
        else if(ReLeafMain.userInput.contains("are you gonna help me") ||
                ReLeafMain.userInput.contains("are you going to help me")){

            ReLeafMain.reLeafMainMessageBox.append("\n\nReLeaf: I can offer you a range of responses which" +
                    " may help you figure out your current issue");
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

