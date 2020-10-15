public class BlockeyReadAndReply {

    /*method for reading userInput and generating a response*/
    public static void GenerateResponse(){

        if(BlockeyMain.userInput.contains("happy")){

            BlockeyMain.blockeyMessage.setText("Amazing");

        }
        else if(BlockeyMain.userInput.contains("sad")){

            BlockeyMain.blockeyMessage.setText("Sorry to hear your feeling sad");

        }

    }


}

