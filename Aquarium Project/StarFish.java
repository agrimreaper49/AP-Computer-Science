import greenfoot.*; 

public class StarFish extends Actor
{
    public void act() 
    {
        move (15);
        
        if ( isAtEdge() )
        {
            turn ( (int)(Math.random() * 359 ) + 1 );
        }
        
    }    
}
