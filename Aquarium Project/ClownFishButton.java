import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClownFishButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClownFishButton extends Actor
{
    /**
     * Act - do whatever the ClownFishButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( Greenfoot.mouseClicked(this))
        {
        ClownFish clowny = new ClownFish();
        
        getWorld().addObject( clowny, (int)(Math.random()*1136), (int)(Math.random()*935) );
        }
    }    
}
