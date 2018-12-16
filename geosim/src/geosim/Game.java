package geosim;


import geosimExtensions.America;
import geosimExtensions.Questions;
import java.io.IOException;
import java.util.Scanner; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Game 
{
    //Attributes
    public Room california, oregon, utah, washington, idaho, nevada, arizona;
    private Parser parser;
    public Room currentRoom;
    private Scanner s = new Scanner(System.in);
    protected static String name;
    
    //Objects
    private America draw = new America();
    private Questions questions = new Questions();
    
    
    //Constructor
    public Game() 
    {
        //Calls method create rooms
        //Creates a new parser object
        
        createRooms();
        parser = new Parser();
        
       
    }


    public void createRooms()
    {
        //Method that creates the rooms
        //currentRoom decides which room you're in
        
        
      
        california = new Room("California");
        oregon = new Room("Oregon");
        nevada = new Room("Nevada");
        arizona = new Room("Arizona");
        utah = new Room("Utah");
        washington = new Room("Washington");
        idaho = new Room("Idaho");
        
        //Which exists each room has
        
        california.setExit("north", oregon);
        california.setExit("east", nevada);

        oregon.setExit("north", washington);
        oregon.setExit("east", idaho);
        oregon.setExit("south", california);
        
        washington.setExit("south", oregon);
        
        idaho.setExit("west", oregon);
        idaho.setExit("south", nevada);
        
        nevada.setExit("west", california);
        nevada.setExit("north", idaho);
        nevada.setExit("east", utah);
        
        utah.setExit("west", nevada);
        utah.setExit("south", arizona);
        
        arizona.setExit("north", utah);
        
        currentRoom = california;
        
    }

    public void play() {
        //Call methods setPlayerName() and printWelcome();
        //this is the starting point of the game
        
        setPlayerName();
        Welcome();
        //roomController();
                
        boolean finished = false;
 
        while (!finished) { 
           
        
        
        if (questions.washington == 1 && questions.gamepoints >= 6 && questions.idaho == 0 && currentRoom == washington)
        {
            System.out.println("\nYou're way ahead of Trump! Keep up the great work " + name +".");
        }
        
         if (questions.idaho == 1 && questions.gamepoints >= 6 && questions.washington == 0 && currentRoom == idaho)
        {
            System.out.println("\nYou're way ahead of Trump! Keep up the great work " + name + ".");
        }
                 
         
        
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing " + name +". Good bye.");
    }
    

    
    private void setPlayerName()
    {
        System.out.print("Choose your name: ");
        name = s.next();
    }
    
    public void Welcome() {
        System.out.println("\nWelcome to America, " + Game.name + "!\n");
        draw.america(); 
        String message = "Your goal in this game, is to beat Trump in the presidential election.\n"
                + "You'll do this by having superior knowledge about the geography of the states on the west coast.\n\n"
                + "Whenever you reach a new travel destination, you can type '" + CommandWord.PLAY 
                + "' to complete the questions about the state.\n"
                + "Typing '" + CommandWord.HELP + "' will list all the available commands.\n\n"
                + "You are in " + currentRoom.getShortDescription() + "\n";
        draw.slowPrint(message,30);
        printHelp();
    }
   

    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        if(commandWord == CommandWord.UNKNOWN) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        if (commandWord == CommandWord.HELP) {
            printHelp();
        }
        else if (commandWord == CommandWord.GO) {
            goRoom(command);
        }
        else if (commandWord == CommandWord.QUIT) {
            wantToQuit = quit(command);
        }
        else if (commandWord == CommandWord.PLAY) {
            roomController();
        }
        else if (commandWord == CommandWord.MAP) {
            draw.map();
        }
        else if (commandWord == CommandWord.DIRECTIONS) {
        System.out.println(currentRoom.getExitString());
        }
        else if (commandWord == CommandWord.GETPOINTS) {
        System.out.println("You have obtained " + questions.gamepoints + " points.");
        }    
        return wantToQuit;
    }

    private void printHelp() 
    {
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("That is not an available direction");
        }
        else {
            
            currentRoom = nextRoom;
            System.out.println("You are in " + currentRoom.getShortDescription());
            currentRoom.getExitString();
        }
    }
   
    private void checkFinish(){
        if (questions.gamepoints >= 12) {
                System.out.println("You won " + name + "! Thank you for playing. Good bye");
                System.exit(0);
        }
        
        if (questions.getStateStatus() == 7) {
                System.out.println("You tried " + name + "... But failed.");
                System.exit(0);
        }
          
    }
    
    private void roomController(){
        if (currentRoom == arizona && questions.arizona == 0){
            questions.arizonaQuestions();
            System.out.println("\n\nYou now have: " + questions.getPoints() + " points");
            checkFinish();
            System.out.println("\nYou are now leaving " + currentRoom.getShortDescription());
            System.out.println(currentRoom.getExitString());
        } else if (currentRoom == arizona && questions.arizona == 1){
            System.out.println(currentRoom.getExitString());
        }
        
        
        if (currentRoom == california && questions.california == 0) {
            questions.californiaQuestions();
            System.out.println("\n\nYou now have: " + questions.getPoints() + " points");
            checkFinish();
            System.out.println("\nYou are now leaving " + currentRoom.getShortDescription());
            System.out.println(currentRoom.getExitString()); 
        } else if (currentRoom == california && questions.california == 1){
            System.out.println(currentRoom.getExitString());
        }
       
       
        if (currentRoom == idaho && questions.idaho == 0){
            questions.idahoQuestions();
            System.out.println("\n\nYou now have: " + questions.getPoints() + " points");
            checkFinish();
            System.out.println("\nYou are now leaving " + currentRoom.getShortDescription());
            System.out.println(currentRoom.getExitString()); 
        } else if (currentRoom == idaho && questions.idaho == 1){
            System.out.println(currentRoom.getExitString());
        }
       
        
        if(currentRoom == nevada && questions.nevada == 0){
            questions.nevadaQuestions();
            System.out.println("\n\nYou now have: " + questions.getPoints() + " points");
            checkFinish();
            System.out.println("\nYou are now leaving " + currentRoom.getShortDescription());
            System.out.println(currentRoom.getExitString()); 
        } else if (currentRoom == nevada && questions.nevada == 1){
            System.out.println(currentRoom.getExitString());
        }   
        
        
        if(currentRoom == oregon && questions.oregon == 0){       
            questions.oregonQuestions();
            System.out.println("\n\nYou now have: " + questions.getPoints() + " points");
            checkFinish();
            System.out.println("\nYou are now leaving " + currentRoom.getShortDescription());
            System.out.println(currentRoom.getExitString()); 
        } else if (currentRoom == oregon && questions.oregon == 1){
            System.out.println(currentRoom.getExitString());
        }
        

        if (currentRoom == utah && questions.utah == 0){
            questions.utahQuestions();
            System.out.println("\n\nYou now have: " + questions.getPoints() + " points");
            checkFinish();
            System.out.println("\nYou are now leaving " + currentRoom.getShortDescription());
            System.out.println(currentRoom.getExitString()); 
        } else if (currentRoom == utah && questions.utah == 1){
            System.out.println(currentRoom.getExitString());
        }
         
        if (currentRoom == washington && questions.washington == 0){
            questions.washingtonQuestions();
            System.out.println("\n\nYou now have: " + questions.getPoints() + " points");
            checkFinish();
            System.out.println("\nYou are now leaving " + currentRoom.getShortDescription());            
            System.out.println(currentRoom.getExitString()); 
        } else if (currentRoom == washington && questions.washington == 1){
            System.out.println(currentRoom.getExitString());
        }
       
}


    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;
        }
    }
   
}
