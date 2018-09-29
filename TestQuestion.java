import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class TestQuestion{

    private List<String> splittedXML;

    public TestQuestion(){
        this.splittedXML = new ArrayList<>();
    }

    public List<String> getSplittedXML(){
        return this.splittedXML;
    }

    public Iterator<String> QuestionIterator(){
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
            Iterator<String> itr = splittedXML.iterator();

            while(itr.hasNext()){
                return itr;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    // public static void main(String[] args){
    //     Question question = new Question();
    //     Iterator<String> itr = question.QuestionIterator();

    //     while(itr.hasNext()){
    //         String temp = itr.next();
    //         System.out.println(temp);
    //     }
    // }
}