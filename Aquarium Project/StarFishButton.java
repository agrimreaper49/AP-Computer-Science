import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarFishButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarFishButton extends Actor
{
    /**
     * Act - do whatever the StarFishButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( Greenfoot.mouseClicked(this))
        {
        
        StarFish star = new StarFish();
        getWorld().addObject( star, (int)(Math.random()*1136), (int)(Math.random()*935) );
        }
    }    
}
