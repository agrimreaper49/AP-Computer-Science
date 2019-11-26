import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static boolean started;
    private Prompter p;
    private int score;
    private GreenfootSound music = new GreenfootSound("guittarmusic.mp3");

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage bg = new GreenfootImage("bg.jpg");
        bg.scale( getWidth() , getHeight() );
        setBackground(bg);
        started = false;
        
    }
    
    public static void setStarted( boolean b )
    {
        started = b;

    }
    public void act()
    {
        
        if ( started )
        {
            showText( "Score" + score , 50 , 650 );
            
            removeObject( p );
        }
        if ( !music.isPlaying() )
        {
            music.play();
        }
    }
    public void addButton()
    {
        p = new Prompter();
        addObject( p , getWidth()/2 , getHeight()/2 );

    
    }
    public void started()
    {
        music.playLoop();
    }
    
    public void stopped()
    {
        music.stop();
    }
    

    
}
