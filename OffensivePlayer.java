/** 
 * Program: NFL Player Program
 * File: OffensivePlayer.java 
 * Summary: The OffensivePlayer program displays a player and 10 player attributes including offensive specific attributes.
 * Author: Robert J Nichols
 * Date: 11/04/2017
 **/ 
public class OffensivePlayer extends NFLPlayer implements Display //Inherits from Player Class
{
    private String position;
    private String statName;
    private int statNum; 
    
    public OffensivePlayer(){}
    
    public OffensivePlayer(String firstNameIn, String lastNameIn, int ageIn , int numIn, 
            String collegeIn, String experienceIn, String teamIn, String positionIn,
            String statNameIn, int statNumIn, boolean isAvailableIn)
    {
        super(firstNameIn, lastNameIn, ageIn , numIn, collegeIn, experienceIn, teamIn, isAvailableIn);
        this.position = positionIn;
        this.statName = statNameIn;
        this.statNum = statNumIn;
    }
    
    public void setPosition(String positionIn)
    {
        this.position = positionIn;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public void setStatName(String statNameIn)
    {
        this.statName = statNameIn;
    }
    
    public String getStatName()
    {
        return statName;
    }
    
    public void setStatNum(int statNumIn)
    {
        this.statNum = statNumIn;
    }
    
    public int getStatNum()
    {
        return statNum;
    }

        @Override //override player class display info
    public String toString(){
        return getFirstName()
                + getLastName()
                + ", age:  " + String.valueOf(getAge())
                +" |  Jersey number:  " + String.valueOf(getNumber())
                +" |  College:  " + getCollege() 
                +" |  Experience:  " + getExp()
                +" |  Team:  " + getTeam() 
                +" |  Position:  " + getPosition()
                +" |  " + getStatName()+": "
                +" " + getStatNum()
                +" |  Available?  " + getAvailable();  
        
    }    
}
