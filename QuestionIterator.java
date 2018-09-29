import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class QuestionIterator{

    private Question question = new Question();
    private int currentIndex = 0;
    private Iterator<String> iterator = question.QuestionIterator();
    private List<String> QuestionsXmlList = StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false).collect(Collectors.<String> toList());  
    private String[] arrayQuestionXml = QuestionsXmlList.toArray(new String[QuestionsXmlList.size()]); // dobrze 7 elementów
    private int currentSize = arrayQuestionXml.length; //dobrze rozmiar = 7

    public boolean hasNext(){
        return currentIndex < currentSize && arrayQuestionXml[currentIndex] != null;
    }

    public String next(){
        return arrayQuestionXml[currentIndex++];
    }

    public static void main(String[] args){
        QuestionIterator questionIterator = new QuestionIterator();
        
        Iterator<String> itr = questionIterator.iterator;
  

        while(itr.hasNext()){
            String temp = itr.next();
            System.out.println(temp);
        }
    }
}