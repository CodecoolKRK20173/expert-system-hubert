public class Question{

    private String id;
    private String question;
    private Answer answer;

    public Question(String id, String question, Answer answer){
        this.id = id;
        this.question = question;
        this.answer = new Answer();
    }

    public String getId(){
        //TO DO
        return "";
    }

    public String getQuestion(){
        //TO DO
        return "";
    }

    public Answer getAnswer(){
        //TO DO
        return answer;
    }

    public boolean getEvaluateAnswer(String input){
        //TO DO
        return true;
    }
}