import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeaHorse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeaHorse extends Actor
{
    private int angle;
    public void act() 
    {
        angle+=2;
        turn(angle);
        move(5);
        setRotation(0);
        if ( angle >= 360 )
        {
            angle=0;
        }
    }    
}
