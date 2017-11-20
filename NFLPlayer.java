/** 
 * Program: NFL Player Program
 * File: Player.java 
 * Summary: The Player program displays a player and 10 player attributes.
 * Author: Robert J Nichols
 * Date: 11/04/2017
 **/ 

public abstract class NFLPlayer implements Display { //Begin Player Class

    // Declare instance variables.
    private String firstName; // first name of player
    private String lastName; // last name of player
    private int age; // age of player
    private int number; // jersey number of player
    private String college; // college player went to
    private String experience; // how many seasons they've been in NFL
    private String team; // current team
    private String position; // current position
    private boolean isAvailable; // are they available to pick for your team?
    private String stat; // Stat string (dependent on which position they play).
    private int statInt; // The number of yards passed, received, etc.
    
    //declare an empty constructor
    public NFLPlayer (){}
    
    // Declare the player constructor that takes in all of the players parameters
    public NFLPlayer(String firstNameIn, String lastNameIn, int ageIn , int numIn, 
            String collegeIn, String experienceIn, String teamIn, boolean isAvailableIn)
    {
        //Assigns the values to their appropriate instance variable
        firstName = firstNameIn; 
        lastName = lastNameIn; 
        age = ageIn; 
        number = numIn; 
        college = collegeIn;
        experience = experienceIn;
        team = teamIn; 
        isAvailable = isAvailableIn; 
    } // End player constructor
    
    public void setFirstName(String nameIn){
        this.firstName = nameIn; // Set instance variable to value passed into the method.
    } 
    
    public String getFirstName(){ 
        return this.firstName; // Get the value of the instance variable.
    }
    
    public void setLastName(String lastNameIn){
        this.lastName = lastNameIn; // Set instance variable to value passed into the method.
    }
    
    public String getLastName(){
        return this.lastName; // Get the value of the instance variable.
    }
    
    public void setAge(int ageIn){
        this.age = ageIn; // Set instance variable to value passed into the method.
    }
    
    public int getAge(){
        return age; // Get the value of the instance variable.
    }
    
    public void setNumber(int numIn){
        this.number = numIn; // Set instance variable to value passed into the method.
    }
    
    public int getNumber(){
        return number; // Get the value of the instance variable.
    }
    
    public void setCollege(String collegeIn){
        this.college = collegeIn; // Set instance variable to value passed into the method.
    }
    
    public String getCollege(){
        return this.college; // Get the value of the instance variable.
    }
    
    public void setExp(String experienceIn){
        this.experience = experienceIn; // Set instance variable to value passed into the method.
    }
    
    public String getExp(){
        return this.experience; // Get the value of the instance variable.
    }
    
    public void setTeam(String teamIn){
        this.firstName = teamIn; // Set instance variable to value passed into the method.
    }
    
    public String getTeam(){
        return this.team; // Get the value of the instance variable.
    }
    
    public void setPosition(String positionIn){
        this.firstName = positionIn; // Set instance variable to value passed into the method.
    }
    
    public String getPosition(){
        return this.position; // Get the value of the instance variable.
    }
    
    public void setStat(String statIn){
        this.stat = statIn; // Set instance variable to value passed into the method.
    }
    
    public String getStat(){
        return this.stat; // Get the value of the instance variable.
    }
    
    public void setStatInt(int statIntIn){
        this.statInt = statIntIn; // Set instance variable to value passed into the method.
    }
    
    public int getStatInt(){
        return statInt; // Get the value of the instance variable.
    }
    
    public void setAvailable(boolean isAvailableIn){
        this.isAvailable = isAvailableIn; // Set instance variable to value passed into the method.
    }
    
    public boolean getAvailable(){
        return this.isAvailable; // Get the value of the instance variable.
    }
    

    public String toString(){
        return "First Name: " + getFirstName()
                + "\nLast Name: " + getLastName()
                + "\nAge: " + String.valueOf(getAge())
                +"\nJersey number: " + String.valueOf(getNumber())
                +"\nCollege: " + getCollege() 
                +"\nExperience: " + getExp()
                +"\nTeam: " + getTeam() 
                +"\nPosition: " + getPosition()
                +"\n" + getStat()+": "
                +"\n" + getStatInt()
                +"\nAvailable? " + getAvailable();
    }
}