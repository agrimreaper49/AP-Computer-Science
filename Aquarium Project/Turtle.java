import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    private int velocity;
    public void act() 
    {
        if ( Greenfoot.isKeyDown("up") )
        {
            setLocation ( getX(), getY() - 5 );
        }
        if ( Greenfoot.isKeyDown("down") )
        {
            setLocation ( getX(), getY() + 5 );
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            velocity+=10;
        }
        if ( Greenfoot.isKeyDown("left") )
        {
            velocity-=10;
        }
        move(velocity);
        velocity*=0.95;
        if ( velocity > 0 )
        {
            setImage ( "turtleRight.png" );
        }
        if( velocity < 0)
        {
            setImage ( "turtleLeft.png" ); 
        }
        
    }    
}
