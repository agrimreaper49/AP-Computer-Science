import greenfoot.*;

public class ClownFish extends Actor
{
    public void act() 
    {
        move(18);
        if(isAtEdge())
        {
            setLocation( getX()-1136, getY() );
        }
        
        
        
        
    }    
}

