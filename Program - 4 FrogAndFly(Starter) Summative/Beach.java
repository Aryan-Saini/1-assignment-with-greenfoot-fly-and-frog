
/**
 * Name: Aryan Saini
 * Class:Software Development 10S
 * Teacher:Mr.Hardman
 * Date last modified: 10/23/2018
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */

public class Beach extends World
{
    private Scoreboard score;
    /** 
     * beach is the constructor for beach type of objects
     * 
     * @param there are no parameter
     * @return nothing is returned
     */
    public Beach()
    {    
       super(800, 600, 1); 
       addFood(10);
       
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)

       // add a Fly object at a random position somewhere in the world
       addFly();
       // add a Frog object at the center of the world 
       addFrog();
       score = new Scoreboard();
       addObject(score,75,25);
    }
    
    /**
     * Adds n Food objects to the world at random locations
     * fot the fly to eat
     * 
     * @param needs to know how much food it is adding to the world
     * @return there are none
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
         
        }
    }
    /**
     * Adds a one fly object to the world at a random location
     * 
     * @param there are no parameters
     * @return mothing is returned
     */
    public void addFly(){
        int x = Greenfoot.getRandomNumber( getWidth() );
        int y = Greenfoot.getRandomNumber( getHeight() );
        addObject(new Fly(),x,y);
    }
    /**
     * adds a frog object to the middle of the world
     * 
     * @param there are no parameters
     * @return there are no return types
     */
    public void addFrog(){
        addObject(new Frog(),getWidth()/2,getHeight()/2);
    }
    /**
     * updates the scoreboard and changes the number of the score
     * if fly ate food
     * 
     * @param there are no parameter
     * @return nothing is returned 
     */
    public void update(){
        score.addToScore();
    }
    
}
