import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    //Gets a random food picture through 3 diffrent pictures
    /** 
     * food is the constructor for food type of objects
     * 
     * @param there are no parameter
     * @return nothing is returned
     */
    public Food()
    {
        /*
         * There are 5 different fruit images available to this scenario.
         * 
         * apple1.png
         * bananas.png
         * cherries.png
         * grapes.png
         * strawberry.png 
         * 
         * Modify this code so that the Food object will have the
         * one of the FIVE images assigned to it (instead of the one of three it currently uses) 
         */ 

        int foodType = Greenfoot.getRandomNumber(3);
        if( foodType == 0 ) {
            setImage("apple1.png");
        } else if( foodType == 1 ) {
            setImage("grapes.png");
        } else if( foodType == 2 ) {
            setImage("strawberry.png ");
        }
    }   
}
