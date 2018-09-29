import java.util.regex.Pattern;

public class Answer{

    public boolean evaluateAnswerByInput(String input){

        input.toLowerCase();

        Pattern patternYes = Pattern.compile("\\D{3}");
        Pattern patternNo = Pattern.compile("\\D{2}");
        Pattern patternFront = Pattern.compile("f\\D{4} .*");
        Pattern patternRear = Pattern.compile("r\\D{3} .*");
        Pattern patternAutomatic = Pattern.compile("au\\D{7}");
        Pattern patternManual = Pattern.compile("ma\\D{4}");
        Pattern patternComfort = Pattern.compile("co\\D{5}");
        Pattern patternSpeed = Pattern.compile("sp\\D{3}");

        Pattern patternBluetooth = Pattern.compile("blue\\D{5}");
        Pattern patternTransmission = Pattern.compile("au\\D{7} tran\\D{8}");
        Pattern patternSelf = Pattern.compile("se\\D{2}.*-.*dr\\D{5}");

        Pattern patternNothing = Pattern.compile("no\\D{5}");
        Pattern patternFog = Pattern.compile("fo.{1} li\\D{4}");
        Pattern patternCentral = Pattern.compile("ce\\D{5}.{1}lo\\D{2}");



        if((input.toLowerCase().equals("yes") || input.toLowerCase().equals("y")) && patternYes.matcher(input).matches()){
            return true;
        }else if((input.toLowerCase().equals("no") || input.toLowerCase().equals("n")) && patternNo.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("front") && patternFront.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("rear") && patternRear.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("automatic") && patternAutomatic.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("manual") && patternManual.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("comfort") && patternComfort.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("speed") && patternSpeed.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("gps") || input.toLowerCase().equals("dvd") || input.toLowerCase().equals("speed") ||
                 patternBluetooth.matcher(input).matches() || patternTransmission.matcher(input).matches() || patternSelf.matcher(input).matches()){
            return true;
        }else if(input.toLowerCase().equals("abs") || patternNothing.matcher(input).matches() || patternFog.matcher(input).matches() || patternCentral.matcher(input).matches()){
            return true;
        }else{
            System.out.println("Invalid value!");
        }
        return false;
    }

    // public void addValue(Value value){
    //     //TO DO
    // }
}