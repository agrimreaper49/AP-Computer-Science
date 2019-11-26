import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabButtton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabButtton extends Actor
{
    /**
     * Act - do whatever the CrabButtton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( Greenfoot.mouseClicked(this))
        {
        
        Crab john = new Crab();
        getWorld().addObject( john, (int)(Math.random()*1136), (int)(Math.random()*935) );
        }
    }    
}
