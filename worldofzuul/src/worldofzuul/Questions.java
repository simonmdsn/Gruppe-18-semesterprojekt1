package worldofzuul;

import java.util.Scanner;

public class Questions {
    
    //Attributes
    private String answer;
      
    //Scanner objekt
    private Scanner readAnswer;
    
    private boolean answerIsA(String correct, String incorrect) {
        readAnswer = new Scanner(System.in);
        
        boolean incorrectParameter = true;
        while(incorrectParameter) {
            String input = readAnswer.next();
            if(input.equals("a") || input.equals ("A")){
                System.out.print(correct);
                return false;
            } else if (input.equals("b") || input.equals("B")
                    || input.equals("c") || input.equals("C")) {
            System.out.print(incorrect);
            return false;
            } else {
                System.out.println("Incorrect input, please try again.");
            }
        }

      // Ubrugelig linje for at undgå return fejl - spørg Besnik for bedre implementatio

        return false;
    }
    
    private boolean answerIsB(String correct, String incorrect) {
        readAnswer = new Scanner(System.in);
        
        boolean incorrectParameter = true;
        while(incorrectParameter) {
            String input = readAnswer.next();
            if(input.equals("b") || input.equals ("B")){
                System.out.print(correct);
                return false;
            } else if (input.equals("a") || input.equals("A")
                    || input.equals("c") || input.equals("C")) {
            System.out.print(incorrect);
            return false;
            } else {
                System.out.println("Incorrect input, please try again.");
            }
        }

       // Ubrugelig linje for at undgå return fejl - spørg Besnik for bedre implementation

        return false;
    }
    
    private boolean answerIsC(String correct, String incorrect) {
        readAnswer = new Scanner(System.in);
        
        boolean incorrectParameter = true;
        while(incorrectParameter) {
            String input = readAnswer.next();
            if(input.equals("c") || input.equals ("C")){
                System.out.print(correct);
                return false;
            } else if (input.equals("b") || input.equals("B")
                    || input.equals("a") || input.equals("A")) {
            System.out.print(incorrect);
            return false;
            } else {
                System.out.println("Incorrect input, please try again.");
            }
        }
        // Ubrugelig linje for at undgå return fejl - spørg Besnik for bedre implementation
        return false;
    }
    
    public void arizonaQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("rigtig svar 1");
        String incorrectFirst = ("forkert svar 1 ");
        String correctSecond =("rigtig svar 2");
        String incorrectSecond = ("forkert svar 2");
        String correctThird = ("rigtig svar 3");
        String incorrectThird = ("rigtig svar 3");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("spørgsmaal 1");
        System.out.println("svarmulighed 1 ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("spørgsmaal 2");
        System.out.println("svarmulighed 2");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("spørgsmaal 3");
        System.out.println("svarmulighed 3");
        answerIsC(correctThird, incorrectThird);
    }
  
    public void californiaQuestions(){
        // Korrekte og inkorrekte svar tekst
        String correctFirst = ("Correct, California is ranked 1st in population size in the USA");
        String incorrectFirst = ("Incorrect, California is ranked as first");
=======
        // Ubrugelig linje
        return false;
    }
    
    public void californiaQuestions(){
        String correctFirst = ("Correct, California is ranked 1st in population size in the USA");
        String incorrectFirst = ("Incorrect, the answer is California is ranked first.");
        String correctSecond = ("Correct, Salt Lake City is located in Utah");
        String incorrectSecond = ("Incorrect, the correct answer is Salt Lake City");
        String correctThird = ("");
        String incorrectThird = ("");
        
        // Spørgsmål 1

        System.out.println("\nFirst Question:");
        System.out.println("How high is California ranked in population size?");
        System.out.println("A: First    B: Third    C: Eight\n");
        answerIsA(correctFirst,incorrectFirst);

        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question:");
        System.out.println("Which of these three cities is not located in Califoirnia");
        System.out.println("A: San Diego    B: Salt Lake City   C: San Francisco");
        answerIsB(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question:");
        System.out.println("Where in California is Silicon Valley located?");
        System.out.println("A: San Francisco    B: placeholder     C: placeholder");
        answerIsA(correctThird,incorrectThird);
                     
    }  
    public void idahoQuestions(){
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("rigtig svar 1");
        String incorrectFirst = ("forkert svar 1 ");
        String correctSecond =("rigtig svar 2");
        String incorrectSecond = ("forkert svar 2");
        String correctThird = ("rigtig svar 3");
        String incorrectThird = ("rigtig svar 3");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("spørgsmaal 1");
        System.out.println("svarmulighed 1 ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("spørgsmaal 2");
        System.out.println("svarmulighed 2");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("spørgsmaal 3");
        System.out.println("svarmulighed 3");
        answerIsC(correctThird, incorrectThird);
    }
    public void nevadaQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("rigtig svar 1");
        String incorrectFirst = ("forkert svar 1 ");
        String correctSecond =("rigtig svar 2");
        String incorrectSecond = ("forkert svar 2");
        String correctThird = ("rigtig svar 3");
        String incorrectThird = ("rigtig svar 3");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("spørgsmaal 1");
        System.out.println("svarmulighed 1 ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("spørgsmaal 2");
        System.out.println("svarmulighed 2");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("spørgsmaal 3");
        System.out.println("svarmulighed 3");
        answerIsC(correctThird, incorrectThird);
    }
    public void oregonQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("rigtig svar 1");
        String incorrectFirst = ("forkert svar 1 ");
        String correctSecond =("rigtig svar 2");
        String incorrectSecond = ("forkert svar 2");
        String correctThird = ("rigtig svar 3");
        String incorrectThird = ("rigtig svar 3");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("spørgsmaal 1");
        System.out.println("svarmulighed 1 ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("spørgsmaal 2");
        System.out.println("svarmulighed 2");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("spørgsmaal 3");
        System.out.println("svarmulighed 3");
        answerIsC(correctThird, incorrectThird);
    }
    
    public void utahQuestions(){
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("rigtig svar 1");
        String incorrectFirst = ("forkert svar 1 ");
        String correctSecond =("rigtig svar 2");
        String incorrectSecond = ("forkert svar 2");
        String correctThird = ("rigtig svar 3");
        String incorrectThird = ("rigtig svar 3");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("spørgsmaal 1");
        System.out.println("svarmulighed 1 ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("spørgsmaal 2");
        System.out.println("svarmulighed 2");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("spørgsmaal 3");
        System.out.println("svarmulighed 3");
        answerIsC(correctThird, incorrectThird); 
    }
    public void washingtonQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("rigtig svar 1");
        String incorrectFirst = ("forkert svar 1 ");
        String correctSecond =("rigtig svar 2");
        String incorrectSecond = ("forkert svar 2");
        String correctThird = ("rigtig svar 3");
        String incorrectThird = ("rigtig svar 3");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("spørgsmaal 1");
        System.out.println("svarmulighed 1 ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("spørgsmaal 2");
        System.out.println("svarmulighed 2");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("spørgsmaal 3");
        System.out.println("svarmulighed 3");
        answerIsC(correctThird, incorrectThird);
        
        System.out.println("\n\nSecond Question:");
        System.out.println("Which of these three cities is not located in Califoirnia");
        System.out.println("A: San Diego    B: Salt Lake City   C: San Francisco");
        
        answerIsB(correctSecond, incorrectSecond);
        
        System.out.println("\n\nThird Question:");
        System.out.println("Where in California is Silicon Valley located?");
        System.out.println("A: San Francisco    B: placeholder     C: placeholder");
        answerIsA(correctThird,incorrectThird);
                     
    }
    
    public void utahQuestions(){
        String correctFirst = ("rigtig");
        String incorrectFirst = ("forkert");
        String correctSecond =("rigtig");
        String incorrectSecond = ("forkert");
        
        System.out.println("\n First Question:");
        System.out.println("test1");
        System.out.println("test2");
        answerIsB(correctFirst,incorrectFirst);
        
        System.out.println("\nSecond Question");
        System.out.println("test3");
        System.out.println("test4");
        answerIsC(correctSecond, incorrectSecond);
    }
}