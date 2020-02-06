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
    private double chanceOfSpawning = 0.005;
    private GreenfootSound music = new GreenfootSound("guittarmusic.mp3");
    public MyWorld()
    {    
        super(1000, 800, 1); 
        GreenfootImage bg = new GreenfootImage("bg1.jpg");
        bg.scale( getWidth() , getHeight() );
        setBackground(bg);
        showText ("Welcome to Guitar Hero!\n, Presented by Agrim Sharma", 130 , 50);
        
        started = false;
        addButton();
        Button butto1 = new Button (1);
        Button butto2 = new Button(2);
        Button butto3 = new Button (3);
        Button butto4 = new Button(4);
        Button butto5 = new Button (5);
        
        addObject ( butto1 , 79  , 680 );
        addObject ( butto2 , 279 , 680 );
        addObject ( butto3 , 479 , 680 );
        addObject ( butto4 , 679 , 680 );
        addObject ( butto5 , 879 , 680 );
        
        
        
       
    }

    public static void setStarted(boolean b)
    {
        started = b;

    }

    public void act()
    {
        
        if ( started )
        {
            
            
            if( Math.random()< chanceOfSpawning)
            {
                Note noteson = new Note((int)(Math.random()*5) + 1);
                int x = 404;
                int y = 21;
                addObject ( noteson , 496 , 9 );
                
                

            }
            
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
