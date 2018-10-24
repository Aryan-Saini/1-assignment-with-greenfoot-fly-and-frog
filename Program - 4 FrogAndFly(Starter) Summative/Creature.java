import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creature extends Actor
{   
    /**
     * atEdgeOfWorld is boolean that checks if an object is at the edge of the world
     * 
     * @param there are no parameter
     * @return it returns a true or false value
     */
    public boolean atEdgeOfWorld()
    {
        return getX()<5 || getY()<5 || getX()>getWorld().getWidth()-5 || getY()>getWorld().getHeight()-5;
    }   
}
