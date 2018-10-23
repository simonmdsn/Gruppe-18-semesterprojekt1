package worldofzuul;


import java.util.Scanner; 


public class Game 
{
    //Attributes
    public Room california, oregon, utah, washington, idaho, nevada, arizona;
    private Parser parser;
    public Room currentRoom;
    private Scanner s = new Scanner(System.in);
    private String name;
    
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
        
        
      
        california = new Room("in California");
        oregon = new Room("in Oregon");
        nevada = new Room("in Nevada");
        arizona = new Room("in Arizona");
        utah = new Room("in Utah");
        washington = new Room("in Washington");
        idaho = new Room("in Idaho");
        
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

    public void play() 
    {
        //Call methods setPlayerName() and printWelcome();
        //this is the starting point of the game
        
        setPlayerName();
        printWelcome();
        roomController();
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    private void setPlayerName()
    {
        System.out.print("Choose your name: ");
        name = s.next();
    }
    
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to America, " + name + "!");
        draw.america();                 
        System.out.println("Your goal in this game, is to beat Trump in the presidential election.");
        System.out.println("Type '" + CommandWord.HELP + "' if you need help at anytime.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
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
        return wantToQuit;
    }

    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
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
            System.out.println(currentRoom.getLongDescription());
            roomController();
        }
    }
    
    private void roomController() 
    {
        if (currentRoom == california) {
            questions.caliQuestions();
            //test
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
