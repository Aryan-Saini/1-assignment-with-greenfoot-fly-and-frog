
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
     /**
     * ScoreBoard makes a n image that says the score and the scoreboard starts at 0 
     * 
     * @param there are no parameter 
     * @return nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }
    /**
     * addToScore clears the old image and makes a new image with a diffrent number
     * 
     * @param there are no parameter
     * @nothing is returned
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("Score: " + points, 5,25); 
    }
}
