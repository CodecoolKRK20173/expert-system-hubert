import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Question{

    private String id;
    private String question;
    private Answer answer;
    private List<String> splittedXML;

    // public Question(String id, String question, Answer answer)
    public Question(String id, String question){
        this.id = id;
        this.question = question;
        this.answer = new Answer();
        this.splittedXML = new ArrayList<>();
    }

    public String getId(){
        //TO DO
        return "";
    }

    public String getQuestion(){
        try (BufferedReader br = new BufferedReader(new FileReader("/home/hubert/Pulpit/expert-system-hubert/Rules.xml"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] splittedTextXMLFile = line.split("\n");

                for(String singleLine: splittedTextXMLFile){
                    if(singleLine.toLowerCase().contains("<question>")){
                        splittedXML.add(singleLine.substring(17 + 1, singleLine.length() - 11));
                    }
                }
            }

            for(int i=0; i<splittedXML.size(); i++){
                this.question = splittedXML.get(i);
            }
            // Iterator<String> itr = splittedXML.iterator();

            // while(itr.hasNext()){
            //     this.question = itr.next();
            //     return this.question; 
            // }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.question;
    }

    public Answer getAnswer(){
        //TO DO
        return answer;
    }

    public boolean getEvaluateAnswer(String input){
        //TO DO
        return true;
    }


    public static void main(String[] args){
        Question question = new Question("1", "Kto?");

        System.out.println(question.getQuestion());
    }

}