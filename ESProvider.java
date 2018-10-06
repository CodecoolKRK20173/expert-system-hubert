import java.util.List;

public class ESProvider{

    FactParser factParser;
    RuleParser ruleParser;

    public ESProvider(FactParser factParser, RuleParser ruleParser){
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers(){

    }

    public void getAnswerByQuestion(String questionId){
        RuleParser ruleParser = new RuleParser();
        RuleRepository ruleRepository = ruleParser.getRuleRepository();
        List<String> questionList = ruleRepository.getQuestionList();

        for(String element: questionList){
            System.out.println(element);
        }
    }

    public static void main(String[] args){
        RuleParser ruleParser = new RuleParser();
        FactParser factParser = new FactParser();

        ESProvider esProvider = new ESProvider(factParser, ruleParser);

        esProvider.getAnswerByQuestion("");
    }
}