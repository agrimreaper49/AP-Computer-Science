
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    private int foodCounter = ((int)(Math.random()*6) + 1);
    private int velocity;
    
    public Food()
    {
        if( foodCounter == 1)
        {
            setImage("food0.png");
        }
        if( foodCounter == 2)
        {
            setImage("food1.png");
        }
        if( foodCounter == 3)
        {
            setImage("food2.png");
        }
        if( foodCounter == 4)
        {
            setImage("food3.png");
        }
        if( foodCounter == 5)
        {
            setImage("food4.png");
        }
        if( foodCounter == 6)
        {
            setImage("food5.png");
        }
        
    }
    public void act() 
    {

        if (getWorld() != null) 
        {
            velocity += 15;
            setLocation ( getX(), getY() + velocity );
            if ( isTouching(ClownFish.class) || getY() >= 930)
            {
                getWorld().removeObject(this);
                Greenfoot.playSound("pling.wav");
            }
            
        }
       
        
       
    }
}
