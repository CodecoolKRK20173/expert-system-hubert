import java.util.List;
import java.util.ArrayList;

public class MultipleValue extends Value{

    private RuleParser ruleParser = new RuleParser();
    private RuleRepository ruleRepository = ruleParser.getRuleRepository();
    private List<String> multipleValueList = ruleRepository.getMultipleValueList();

    public List<String> getMultipleValueAnswer(){
        List<String> multipleValueAnswerList = new ArrayList<>();
 
        for(String element: this.multipleValueList){
            multipleValueAnswerList.add(element.substring(15));
        }
        return multipleValueAnswerList;
    }

    // public static void main(String[] args){
    //     RuleParser ruleParser = new RuleParser();
    //     RuleRepository ruleRepository = ruleParser.getRuleRepository();
    //     List<String> multipleValueList = ruleRepository.getMultipleValueList();

    //     MultipleValue multipleValue = new MultipleValue();

    //     // for(int i=0; i<multipleValue.multipleValueList.size(); i++){
    //     //     System.out.println(multipleValue.multipleValueList.get(i));
    //     // }

    //     List<String> getList = multipleValue.getMultipleValueAnswer();

    //     for(String element: getList){
    //         System.out.println(element);
    //     }
    // }
}