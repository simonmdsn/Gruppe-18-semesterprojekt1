package worldofzuul;


import java.util.Scanner; 


public class Game 
{
    //Attributes
    private Parser parser;
    private Room currentRoom;
    private Scanner s = new Scanner(System.in);
    private String name;
    
    
    //Constructor
    public Game() 
    {
        //Calls method create rooms
        //Creates a new parser object
        
        createRooms();
        parser = new Parser();
        
       
    }


    private void createRooms()
    {
        //Method that creates the rooms
        //currentRoom decides which room you're in
        
        Room outside, theatre, pub, lab, office;
      
        outside = new Room("outside the main entrance of the university");
        theatre = new Room("in a lecture theatre");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        
        outside.setExit("east", theatre);
        outside.setExit("south", lab);
        outside.setExit("west", pub);

        theatre.setExit("west", outside);

        pub.setExit("east", outside);

        lab.setExit("north", outside);
        lab.setExit("east", office);

        office.setExit("west", lab);

        currentRoom = outside;
    }

    public void play() 
    {
        //Revoking methods setPlayerName() and printWelcome();
        //this is the starting point of the game
        
        setPlayerName();
        printWelcome();
        
                
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
        America();
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
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
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
