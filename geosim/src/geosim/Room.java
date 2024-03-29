    package geosim;

import geosimExtensions.Questions;
import java.util.Set;
import java.util.HashMap;


public class Room 
{
    private String description;
    private HashMap<String, Room> exits;

    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    public String getShortDescription()
    {
        return description;
    }

    public String getLongDescription()
    {
        return "You are in " + description + "\n" + getExitString();
    }

    Questions questions = new Questions();
    
    public String getExitString()
    {
        String returnString = "Available directons:";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
            }
        return returnString;
    }
    

    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
}

