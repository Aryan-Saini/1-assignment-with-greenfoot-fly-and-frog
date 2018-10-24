









import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
     /**
     * fly is the constructor of fly type of objects
     * set rotations of a fly between a random number between 360 at the start world
     * 
     * @param there are no parameter
     * @return nothing is returned
     */
    public Fly()
    {
        /*
         * modify this code to make the turtle face any random 
         * initial direction
         */
        setRotation(Greenfoot.getRandomNumber(360));
    
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
        // make the fly move 4 steps in the direction it is facing
        
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        checkForFood();
        checkKeys();
        
    }  
    /**
     * cheecks if the up arrow or left arrow or right arrow are pressed
     * if up arrow is pressed move forward 4 pixels
     * if left arrow is pressed move forward left 5 pixels
     * if right arrow is pressed move forward right 5 pixels
     * 
     * @param there are no parameters
     * @return nothing is returned
     */
    
    public void checkKeys() {
        if(Greenfoot.isKeyDown("UP")){
            move(4);
            }
        else if(Greenfoot.isKeyDown("LEFT")){
            turn(-5);
        }
        else if(Greenfoot.isKeyDown("RIGHT")){
            turn(5);
        }
    }
    /**
     * checkForFood if fly is touching food
     * then remove the food object
     * and it also checks if there are any food left in the world beach but if there isnt then
     * add 10 more food objects
     * 
     * @param there are no parameter
     * @return nothing is returned
     */
    private void checkForFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            ((Beach)getWorld()).update();
            if (getWorld().getObjects(Food.class).isEmpty() == true){
                ((Beach)getWorld()).addFood(10);
            }
        }
    }

}
