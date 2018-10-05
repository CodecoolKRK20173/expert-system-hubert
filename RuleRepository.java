import java.util.List;
import java.util.ArrayList;

public class RuleRepository{

    public List<String> ruleList = new ArrayList<>();
    public List<String> questionList = new ArrayList<>();
    public List<String> singleValueList = new ArrayList<>();
    public List<String> multipleValueList = new ArrayList<>();

    private List<String> addQuestionList = new ArrayList<>();

    private RuleParser ruleParser = new RuleParser();

    public List<String> getRuleList(){
        return this.ruleList;
    }

    public List<String> getQuestionList(){
        return this.questionList;
    }

    public List<String> getSingleValueList(){
        return this.singleValueList;
    }

    public List<String> getMultipleValueList(){
        return this.multipleValueList;
    }

    public void addQuestion(Question question){
        List<String> questionList = question.getQuestionList();

        for(int i=0; i<questionList.size(); i++){
            this.addQuestionList.add(questionList.get(i));
        }
    }
}