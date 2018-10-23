package worldofzuul;

import java.util.Scanner;

public class Questions {
    
    //Attributes
    private String answer;
    private boolean checkAnswer = false;
  
    
    //Scanner objekt
    private Scanner readAnswer = new Scanner(System.in);
    
    public void caliQuestions(){
        
        System.out.println("\nHow high is California ranked in population size?");
        System.out.println("A: First    B: Third    C: Eight");
        checkAnswer();
        if(checkAnswer == true){
           if(answer.equals("a") || answer.equals("A")){
               System.out.println("Correct, California is ranked first in population size.");
           } else {
               System.out.println("Incorrect, California is actually ranked first in population size");
           }
           readAnswer.close();
        }
        
    }
        
    public void checkAnswer(){
        
        while(!checkAnswer) {
        answer = readAnswer.next();
        if(answer.equals("a") || answer.equals("b") || answer.equals("c")){
            checkAnswer = true;
        } else{
        System.out.println("Incorrect input, try again.");
                }
        }
        
        
            
}
    
}
