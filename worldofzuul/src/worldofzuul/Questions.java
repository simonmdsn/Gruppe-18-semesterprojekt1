package worldofzuul;

import java.util.Scanner;

public class Questions {
    
    //Attributes
    private String answer;
    public int gamepoints;
    
    protected int california;
    protected int arizona;
    protected int idaho;
    protected int nevada;
    protected int oregon;
    protected int utah;
    protected int washington;
    
    
    
    //Scanner objekt
    private Scanner readAnswer;
    
    
    
    public Questions(){}
    
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
        String msg1 = "\nFirst Question:\n---------------\n"
                    + "How high is California ranked in population size?\n"
                    + "A: 1st    B: 3rd    C: 8th\n";
        America.slowPrint(msg1, 30); 
        //System.out.println("\nFirst Question:\n---------------");
        //System.out.println("How high is California ranked in population size?");
        //System.out.println("A: 1st    B: 3rd    C: 8th\n");
        answerIsA(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question:\n----------------");
        System.out.println("Which of these three cities is not located in Califoirnia");
        System.out.println("A: San Diego    B: Salt Lake City   C: San Francisco");
        answerIsB(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question:\n---------------");
        System.out.println("Where in California is Silicon Valley located?");
        System.out.println("A: San Francisco    B: Santa Cruz     C: Pasadena");
        answerIsA(correctThird,incorrectThird);
        california++;
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
        System.out.println("\nFirst Question:\n---------------");
        System.out.println("Which state is to the north of Arizona?");
        System.out.println("A: Idaho   B: Utah   C: Florida ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question\n----------------");
        System.out.println("Which river seperates Arizona from California and Nevada?");
        System.out.println("A: Salt River   B: Rio Grande   C: Colorado River");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question\n---------------");
        System.out.println("Which is the capital of Arizona?");
        System.out.println("A: Flagstaff    B: Tucson   C: Phoenix");
        answerIsC(correctThird, incorrectThird);
        arizona++;
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
        System.out.println("\nFirst Question:\n---------------");
        System.out.println("Idaho is the ____ largest state in the country ");
        System.out.println("A: 46th B: 14th C: 4th");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question\n----------------");
        System.out.println("How many states border Idaho?");
        System.out.println("A: 2    B: 4    C: 6");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question\n---------------");
        System.out.println("What is the largest city in Idaho?");
        System.out.println("A: Salt Lake City B: Caldwell   C: Boise");
        answerIsC(correctThird, incorrectThird);
        idaho++;
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
        System.out.println("\nFirst Question:\n---------------");
        System.out.println("Which of these is a nickname for Nevada?");
        System.out.println("A: The Centennial State B: The Battle Born State    C: The Gem State");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question\n----------------");
        System.out.println("What is the capital of Nevada?");
        System.out.println("A: Reno B: Las Vegas    C: Carson City");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question\n---------------");
        System.out.println("What is the motto of Nevada?");
        System.out.println("A: Willing and able B: Liberty and union, now and forever, one and inseparable  C: All for our country");
        answerIsC(correctThird, incorrectThird);
        nevada++;
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
        System.out.println("\nFirst Question:\n---------------");
        System.out.println("What is the capital of Oregon?");
        System.out.println("A: Oregon City  B: Salem    C: Las Vegas ");
        answerIsB(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question\n----------------");
        System.out.println("Oregons geography can be divided into how many areas?");
        System.out.println("A: 6    B: 15   C: 304");
        answerIsA(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question\n---------------");
        System.out.println("What major river can be found in Oregon?");
        System.out.println("A: Snake River  B: The Great Fall   C: Upwood River ");
        answerIsA(correctThird, incorrectThird);
        oregon++;
    }
    
    public void utahQuestions(){
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("Correct, Salt Lake City is the capital of Utah!");
        String incorrectFirst = ("Wrooong, the answer is Salt Lake City!");
        String correctSecond =("Correct, Utah is the 13th largest state in the US");
        String incorrectSecond = ("Incorrect, Utah is 13th largest state in the US");
        String correctThird = ("Correct, Lake Powell is found in Utah");
        String incorrectThird = ("Incorrect, the correct answer is Lake Powell");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:\n---------------");
        System.out.println("What is the capital of Utah?");
        System.out.println("A: Salt Lake City   B: California   C: Utah City");
        answerIsA(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question\n----------------");
        System.out.println("Utah is the ____ largest state in the US");
        System.out.println("A: 23th B: 42th C: 13th");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question\n---------------");
        System.out.println("What major lake can be found in Utah?");
        System.out.println("A: Lake Powell  B: Lake Erie    C: Lake Pleasant");
        answerIsA(correctThird, incorrectThird); 
        utah++;
    }
    public void washingtonQuestions() {
        // Korrekte og inkorrekt svar tekst 
        String correctFirst = ("Correct, Washington is named after former president George Washington");
        String incorrectFirst = ("Incorrect, Washington is named after former president George Washington!");
        String correctSecond =("Correct, and with a population of ~730.000 people");
        String incorrectSecond = ("Incorrect, the correct answer is Seattle");
        String correctThird = ("Correct, there is about 7.4 million people in Washington");
        String incorrectThird = ("Wrong, there is about 7.4 million people in Washington");
        
        // Spørgsmål 1
        System.out.println("\nFirst Question:\n---------------");
        System.out.println("The state of Washington is the only state to be named after _____");
        System.out.println("A: Another state in the US  B: An animal    C: A United States president ");
        answerIsC(correctFirst,incorrectFirst);
        
        // Spørgsmål 2
        System.out.println("\n\nSecond Question\n----------------");
        System.out.println("What is the largest city of Washington");
        System.out.println("A: Olympia  B: Tacoma   C: Seattle");
        answerIsC(correctSecond, incorrectSecond);
        
        // Spørgsmål 3
        System.out.println("\n\nThird Question\n---------------");
        System.out.println("What is the population of Washington");
        System.out.println("A: ~7.4 Million B: ~15 Million  C: ~17 Million");
        answerIsA(correctThird, incorrectThird);
        washington++;                            
    }  
    public int getPoints(){
        return gamepoints;
    }
    
    public int getStateStatus() {
        int statestatus;
        return statestatus = california + arizona + idaho + nevada + oregon + utah + washington;
    }
}