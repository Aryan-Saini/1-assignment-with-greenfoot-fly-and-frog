
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    /**
     * frog is the constructor for frog type of objects
     * also sets the speed of the frog between 4-8 pixels at the start of the world
     * 
     * @param there are no parameter
     * @return nothing is returned
     */
    public Frog()
    {        
        // sets the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(4+4);
    }
    /**
       * act is the method that is
       * run during every act cycle
       * of the scenario
       *
       * @param There are no parameters
       * @return Nothing is returned
       */
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        walk();
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ 
        
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        turnAtEdge();

        
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        checkForFly();

        
        
    }  
    /**
     * this will allow the frog to move but not in a straight line. it will go of cource 35% of the time the other 65% it will move froward
     * it will move forward the direction it is facing
     * 
     * @param there are no parameter
     * @return there is no return
     */
    public void walk(){
        if(Greenfoot.getRandomNumber(100) > 35){
            move(speed);
        }
            else
        {
                if(Greenfoot.getRandomNumber(100) < 50){ 
                   turn(15);
                   move(speed);
            }
                else{
                turn(-15);
                move(speed);
                }   
            }
        }
    /**
     * checkForFly checks if the frog has touched a fly... 
     * removes the fly if touched
     * 
     * @param There are no paramters
     * @return Nothing is returned
     */
    public void checkForFly(){
        if (isTouching(Fly.class) == true){
            removeTouching(Fly.class);
            Greenfoot.stop();
        }    
    }

    /**
     * turnAtEdge checks if the frog is at the edge
     * if the frog is at the edge...
     * turn 7 degress
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    public void turnAtEdge(){
        if(atEdgeOfWorld() == true){
            turn(-7);
            }
    }
}
