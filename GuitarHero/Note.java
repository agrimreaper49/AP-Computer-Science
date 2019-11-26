import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Note here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note extends SmoothMover
{
    private int whatColor;
    private int color = (int)(Math.random() * 5) + 1;;
    public Note ( int whatColor )
    {
        this.whatColor = whatColor;
        if (  color == 1) 
        {
            setImage("notesorgange.png");
        }
        if (  color == 2) 
        {
            setImage("notesred.png");
        }
        if (  color == 3) 
        {
            setImage("notesblue.png");
        }
        if (  color == 4) 
        {
            setImage("notesyellow.png");
        }
        if (  color == 5 ) 
        {
            setImage("notesgreen.png");
        }
    }
    public void act() 
    {
        
        setLocation ( getX() , getY() + 5 );
        if ( isAtEdge() )
        {
            getWorld().removeObject(this);
        }
    }    
}
