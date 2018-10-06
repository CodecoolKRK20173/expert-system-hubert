import java.util.Iterator;
import java.util.List;

public class QuestionIterator{

    private RuleParser ruleParser = new RuleParser();
    private RuleRepository ruleRepository = ruleParser.getRuleRepository();
    private List<String> questionList = ruleRepository.getQuestionList();
    private String[] questionArray = questionList.toArray(new String[questionList.size()]);
    private int currentIndex = 0;
    private int currentSize = questionList.size();

    public boolean hasNext(){
        return currentIndex < currentSize && questionArray[currentIndex] != null;
    }

    public String next(){
        return questionArray[currentIndex++];
    }


    // public static void main(String[] args){
    //     QuestionIterator questionIterator = new QuestionIterator();

    //     RuleParser ruleParser = new RuleParser();
    //     RuleRepository ruleRepository = ruleParser.getRuleRepository();
    //     List<String> questionList = ruleRepository.getQuestionList();
    //     String[] questionArray = questionList.toArray(new String[questionList.size()]);

    //     Iterator<String> itr = questionList.iterator();

    //     while(itr.hasNext()){
    //         String temp = itr.next();
    //         System.out.println(temp);
    //     }
    // }
}