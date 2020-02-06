import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class note here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note extends SmoothMover
{
    private static int score = 0;
    private int notes = 0;
    private static int notesCorrect = 0;
    private double velocity = 0;
    
    public Note(int notes)
    {
        this.notes = notes;    
    }
    
    
    public void act() 
    { 
        velocity += 0.1;
        
        if ( notes == 1)
        {
            setImage("notesorgange.png");
            setLocation( getX()-7, getY() + 10 );
            if ( Greenfoot.isKeyDown("a") && isTouching ( Button.class ))
            {
                score++;
                notesCorrect++;
                getWorld().showText ("Score: " + score , 130 , 90);
                getWorld().showText ("Notes Correct: " + score , 130 , 140);
                getWorld().removeObject(this);
                
            }
            else if ( isAtEdge() || isTouching ( Button.class ) )
            {
            score--;
            
            getWorld().showText ("Score: " + score , 130 , 90);
            getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
            getWorld().removeObject(this);
            }
            
        }
        if ( notes == 2)
        {
            setImage("notesblue.png");
            setLocation( getX()-3, getY() + 10 );
            if ( Greenfoot.isKeyDown("s") && isTouching ( Button.class ))
            {
                score++;
                notesCorrect++;
                getWorld().showText ("Score: " + score , 130 , 90);
                notesCorrect++;
                getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
                getWorld().removeObject(this);
                
            }
            else if ( isAtEdge() || isTouching(Button.class) )
            {
            score--;
            
            getWorld().showText ("Score: " + score , 130 , 90);
            getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
            getWorld().removeObject(this);
        }
        
            
            
        }
        if ( notes == 3)
        {
            setImage("notesgreen.png");
            setLocation( getX(), getY() + 10 );
            if ( Greenfoot.isKeyDown("d") && isTouching ( Button.class ))
            {
                score++;
                notesCorrect++;
                getWorld().showText ("Score: " + score , 130 , 90);
                getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
                getWorld().removeObject(this);
                
            }
            else if ( isAtEdge() || isTouching(Button.class) )
            {
            score--;
            
            getWorld().showText ("Score: " + score , 130 , 90);
            getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
            getWorld().removeObject(this);
        }
        
            
            
        }
        if ( notes == 4)
        {
            setImage("notesyellow.png");
            setLocation( getX()+2, getY() + 10 );
            if ( Greenfoot.isKeyDown("f") && isTouching ( Button.class ))
            {
               score++;
               notesCorrect++;
               getWorld().showText ("Score: " + score , 130 , 90);
               getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
               getWorld().removeObject(this);
                
            }
            else if ( isAtEdge() || isTouching(Button.class) )
            {
            score--;
            
            getWorld().showText ("Score: " + score , 130 , 90);
            getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
            getWorld().removeObject(this);
        }
        
            
            
        }
        if ( notes == 5)
        {
            setImage("notesred.png");
            setLocation( getX()+ 7, getY() + 10 );
            if ( Greenfoot.isKeyDown("g") && isTouching ( Button.class ))
            {
                score++;
                notesCorrect++;
                getWorld().showText ("Score: " + score , 130 , 90);
                getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
                getWorld().removeObject(this);
               
            }
            else if ( isAtEdge() || isTouching(Button.class) )
            {
            score--;
            
            getWorld().showText ("Score: " + score , 130 , 90);
            getWorld().showText ("Notes Correct: " + notesCorrect , 130 , 140);
            getWorld().removeObject(this);
        }
        
            
            
        }
        
        
    }    
}
