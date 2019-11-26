import greenfoot.*;

/**
 * Write a description of class Prompter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prompter extends Actor
{
    
    public Prompter ()
    {
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) )
        {
            MyWorld.setStarted(true);
        }
    }    
}
