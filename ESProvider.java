import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ESProvider{

    FactParser factParser;
    RuleParser ruleParser;

    public ESProvider(FactParser factParser, RuleParser ruleParser){
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers(){

    }

    public List<String> getAnswerByQuestion(){
        Scanner scanner = new Scanner(System.in);
        RuleParser ruleParser = new RuleParser();
        SingleValue singleValue = new SingleValue();
        MultipleValue multipleValue = new MultipleValue();
        RuleRepository ruleRepository = ruleParser.getRuleRepository();
        List<String> singleValueList = singleValue.getSingleValueAnswer();
        List<String> multipleValueList = multipleValue.getMultipleValueAnswer();
        List<String> questionList = ruleRepository.getQuestionList();
        String input;
        List<String> answersList = new ArrayList<>();

        for(int i=0; i<questionList.size(); i++){
            System.out.println(questionList.get(i));
            if(i == 0){
                System.out.println(singleValueList.get(0) + " OR " + singleValueList.get(1));
                System.out.print("Enter answer: ");
                input = scanner.next();
                answersList.add(input);
            }else if(i == 1){
                System.out.println(singleValueList.get(2) + " OR " + singleValueList.get(3));
                System.out.print("Enter answer: ");
                input = scanner.next();
                answersList.add(input);
            }else if(i == 2){
                System.out.println(multipleValueList.get(0) + " OR " + multipleValueList.get(1));
                System.out.print("Enter answer: ");
                input = scanner.next();
                answersList.add(input);
            }
        }
        return answersList;
    }

    public static void main(String[] args){
        RuleParser ruleParser = new RuleParser();
        FactParser factParser = new FactParser();

        ESProvider esProvider = new ESProvider(factParser, ruleParser);

        List<String> answerList = esProvider.getAnswerByQuestion();
    }
}