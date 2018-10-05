import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Answer{

    public boolean evaluateAnswerByInput(String input){

        input.toLowerCase();

        if(input.toLowerCase().equals("yes")){
            return true;
        }else if(input.toLowerCase().equals("no")){
            return true;
        }else if(input.toLowerCase().equals("comfort")){
            return true;
        }else if(input.toLowerCase().equals("speed")){
            return true;
        }else if(input.toLowerCase().equals("gps") || input.toLowerCase().equals("dvd") || input.toLowerCase().equals("bluetooth") || 
                 input.toLowerCase().equals("automatic transmission") || input.toLowerCase().equals("self-driving")){
            return true;
        }else if(input.toLowerCase().equals("abs") || input.toLowerCase().equals("nothing") || input.toLowerCase().equals("fog lights") ||
                 input.toLowerCase().equals("central lock")){
            return true;
        }else{
            return false;
        }
    }

    public void addValue(Value value){
        //TO DO
    }


    public static void main(String[] args){
        TestQuestion testQuestion = new TestQuestion();
        testQuestion.loadXmlDOcument("Rules.xml");
        List<String> XmlList = testQuestion.getXmlList();

        for(int i=0; i<XmlList.size(); i++){
            System.out.println(XmlList.get(i));
        }
    }
}