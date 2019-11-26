import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class octopus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class octopus extends SmoothMover
{
    private double velocity;
    
   
    public void act() 
    {
        
        if ( getExactY() >= 1000)
        {
            
            velocity = -50;
        }
        else
        {
            
            velocity+=1;
        }
        
        if ( Greenfoot.isKeyDown( "space" ) && velocity >= 3 )
        {
            velocity = -6;
            Greenfoot.playSound("blop.mp3");
        }
        else
        {
            velocity+=1;
        }
        
        setLocation (getExactX(), getExactY()+velocity);
    }    
}
