
package Logica;


public class Questions {
    
   private String[] question;
   private String[][] options;

    public Questions(String [] question, String[][] options) {
        this.question = question;
        this.options = options;
    }

    public String[] getQuestion() {
        return question;
    }

    public void setQuestion(String[] question) {
        this.question = question;
    }

    public String[][] getOptions() {
        return options;
    }

    public void setOptions(String[][] options) {
        this.options = options;
    }
   
   
    
}
