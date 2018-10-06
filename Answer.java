import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Answer{

    private List<String> addValueList = new ArrayList<>();

    public List<String> getAddValueList(){
        return this.addValueList;
    }

    public boolean evaluateAnswerByInput(String input){

        input.toLowerCase();

        if(input.toLowerCase().equals("yes")){
            return true;
        }else if(input.toLowerCase().equals("no")){
            return false;
        }else if(input.toLowerCase().equals("comfort")){
            return true;
        }else if(input.toLowerCase().equals("speed")){
            return false;
        }else if(input.toLowerCase().equals("gps") || input.toLowerCase().equals("dvd") || input.toLowerCase().equals("bluetooth") || 
                 input.toLowerCase().equals("automatic transmission") || input.toLowerCase().equals("self-driving")){
            return true;
        }else if(input.toLowerCase().equals("abs") || input.toLowerCase().equals("nothing") || input.toLowerCase().equals("fog lights") ||
                 input.toLowerCase().equals("central lock")){
            return false;
        }
        return false;
    }

    // Value value cannot be instantiated
    public void addValue(Value value){
        List<String> singleValueList = value.getSingleValueList();
        List<String> multipleValueList = value.getMultipleValueList();

        for(int i=0; i<singleValueList.size(); i++){
            this.addValueList.add(singleValueList.get(i));
        }

        for(int i=0; i<multipleValueList.size(); i++){
            this.addValueList.add(multipleValueList.get(i));
        } 
    }


    // public static void main(String[] args){
    //     Answer answer = new Answer();
    //     Value value = new Value();
    //     answer.addValue(value);
    //     List<String> list = answer.getAddValueList();

    //     for(String element: list){
    //         System.out.println(element);
    //     }
    // }
}