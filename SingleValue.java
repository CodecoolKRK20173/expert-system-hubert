import java.util.List;
import java.util.ArrayList;

public class SingleValue extends Value{

    private RuleParser ruleParser = new RuleParser();
    private RuleRepository ruleRepository = ruleParser.getRuleRepository();
    private List<String> singleValueList = ruleRepository.getSingleValueList();

    public List<String> getSingleValueAnswer(){
        List<String> singleValueAnswerList = new ArrayList<>();
 
        for(String element: this.singleValueList){
            singleValueAnswerList.add(element.substring(13));
        }
        return singleValueAnswerList;
    }

    // public static void main(String[] args){
    //     RuleParser ruleParser = new RuleParser();
    //     RuleRepository ruleRepository = ruleParser.getRuleRepository();
    //     List<String> singleValueList = ruleRepository.getSingleValueList();

    //     SingleValue singleValue = new SingleValue();

    //     // for(int i=0; i<multipleValue.multipleValueList.size(); i++){
    //     //     System.out.println(multipleValue.multipleValueList.get(i));
    //     // }

    //     List<String> getList = singleValue.getSingleValueAnswer();

    //     for(String element: getList){
    //         System.out.println(element);
    //     }
    // }
}