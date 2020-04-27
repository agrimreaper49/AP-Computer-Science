import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Button extends Actor
{
    private int colorOfButton  = (int)(Math.random() * 5 ) + 1;
    public Button (int colorOfButton)
    {
        this.colorOfButton = colorOfButton;    
    }
    public void act() 
    {
        if ( colorOfButton == 1 )
        {
            setImage ("orangebutton.jpg");
            if ( Greenfoot.isKeyDown ( "a" ))
            {
                setImage ("black.png");
            }
            
        }
        if ( colorOfButton == 2 )
        {
            setImage ("bluebutton.jpg");
            if ( Greenfoot.isKeyDown ( "s" ))
            {
                setImage ("black.png");
            }
            
        }
        if ( colorOfButton == 3 )
        {
            setImage ("greenbutton.jpg");
            if ( Greenfoot.isKeyDown ( "d" ))
            {
                setImage ("black.png");
            }
            
        }
        if ( colorOfButton == 4 )
        {
            setImage ("yellowbutton.jpg");
            if ( Greenfoot.isKeyDown ( "f" ))
            {
                setImage ("black.png");
            }
            
        }
        if ( colorOfButton == 5 )
        {
            setImage ("redbutton.jpg");
            if ( Greenfoot.isKeyDown ( "g" ))
            {
                setImage ("black.png");
            }
            
        }
    }    
}
