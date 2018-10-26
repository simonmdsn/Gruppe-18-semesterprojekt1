package worldofzuul;

import java.util.Scanner;

public class Questions {
    
    
    //Attributes
    private String answer;
    public int gamepoints;
      
    //Scanner objekt
    private Scanner readAnswer;
    
    public Questions(){
        
    }
    
    private boolean answerIsA(String correct, String incorrect) {
        readAnswer = new Scanner(System.in);
        
        boolean incorrectParameter = true;
        while(incorrectParameter) {
            String input = readAnswer.next();
            if(input.equals("a") || input.equals ("A")){
                System.out.print(correct);
                gamepoints++;
                return false;
            } else if (input.equals("b") || input.equals("B")
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
    
    private boolean answerIsB(String correct, String incorrect) {
        readAnswer = new Scanner(System.in);
        
        boolean incorrectParameter = true;
        while(incorrectParameter) {
            String input = readAnswer.next();
            if(input.equals("b") || input.equals ("B")){
                System.out.print(correct);
                gamepoints++;
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
                gamepoints++;
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
        public void californiaQuestions(){
        String correctFirst = ("Correct, California is ranked 1st in population size in the USA");
        String incorrectFirst = ("Incorrect, the answer is California is ranked first.");
        String correctSecond = ("Correct, Salt Lake City is located in Utah");
        String incorrectSecond = ("Incorrect, the correct answer is Salt Lake City");
        String correctThird = ("Correct, Silicon Valley is located in San Francisco");
        String incorrectThird = ("Incorrect, Silicon Valley is located in San Fransisco");
        
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
        System.out.println("A: San Francisco    B: Santa Cruz     C: Pasadena");
        answerIsA(correctThird,incorrectThird);
        }
    
    public void arizonaQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("Correct answer!");
        String incorrectFirst = ("Incorrect, Utah is to the north of Arizona.");
        String correctSecond =("Correct, Colorado River seperates Arizona in this case.");
        String incorrectSecond = ("Incorrect, the answer is Colorado River.");
        String correctThird = ("Correct, Phoenix is the capital of Arizona!");
        String incorrectThird = ("Incorrect, Phoenix is the capital of Arizona.");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("Which state is to the north of Arizona?");
        System.out.println("A: Idaho   B: Utah   C: Florida ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("Which river seperates Arizona from California and Nevada?");
        System.out.println("A: Salt River   B: Rio Grande   C: Colorado River");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("Which is the capital of Arizona?");
        System.out.println("A: Flagstaff    B: Tucson   C: Phoenix");
        answerIsC(correctThird, incorrectThird);
    }
    
    public void idahoQuestions(){
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("Correct, Idaho is the 14th largest state in the US");
        String incorrectFirst = ("Incorrect, Idaho is the 14th largest state in the US!");
        String correctSecond =("Correct, Idaho borders 6 states ");
        String incorrectSecond = ("Incorrect, Idaho borders 6 states!");
        String correctThird = ("Correct, the largest city in Idaho is Boise.");
        String incorrectThird = ("Wrooong! The largest city in Idaho is Boise!");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("Idaho is the ____ largest state in the country ");
        System.out.println("A: 46th B: 14th C: 4");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("How many states border Idaho?");
        System.out.println("A: 2    B: 4    C: 6");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("What is the largest city in Idaho?");
        System.out.println("A: Salt Lake City B: Caldwell   C: Boise");
        answerIsC(correctThird, incorrectThird);
    }
    public void nevadaQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("Correct!");
        String incorrectFirst = ("Incorrect, it's called The Battle Born State");
        String correctSecond =("Correct!");
        String incorrectSecond = ("Incorrect, the answer is Carson City!");
        String correctThird = ("You're goddamn right!");
        String incorrectThird = ("Nope, the correct answer is - All for our country!");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("Which of these is a nickname for Nevada?");
        System.out.println("A: The Centennial State B: The Battle Born State    C: The Gem State");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("What is the capital of Nevada?");
        System.out.println("A: Reno B: Las Vegas    C: Carson City");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("What is the motto of Nevada?");
        System.out.println("A: Willing and able B: Liberty and union, now and forever, one and inseparable  C: All for our country");
        answerIsC(correctThird, incorrectThird);
    }
    public void oregonQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("Correct, Salem is the capital of Oregon!");
        String incorrectFirst = ("Unfortunately, the capital of Oregon is Salem..");
        String correctSecond =("Correct, Oregon can be divided into 6 areas.");
        String incorrectSecond = ("Incorrcet, Oregon can be divided into 6 areas!");
        String correctThird = ("Correct, Snake River is a major river found in Oregon.");
        String incorrectThird = ("Wrong, Snake River is one of the major rivers in Oregon.");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:");
        System.out.println("What is the capital of Oregon?");
        System.out.println("A: Oregon City  B: Salem    C: Las Vegas ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question");
        System.out.println("Oregons geography can be divided into how many areas?");
        System.out.println("A: 6    B: 15   C: 304");
        answerIsA(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question");
        System.out.println("What major river can be found in Oregon?");
        System.out.println("A: Snake River  B: The Great Fall   C: Upwood River ");
        answerIsA(correctThird, incorrectThird);
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
    public int getPoints(){
        return gamepoints;
    }
}