import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Aquarium extends World
{
    private GreenfootSound music = new GreenfootSound("waterDrops.wav");
    public Aquarium()
    {    
        super(1136, 935, 1); 
        Turtle turd = new Turtle();
        addObject( turd, 200, 500 );
        octopus octy = new octopus();
        addObject( octy, 500, 100 );
        StarFish star = new StarFish();
        addObject( star, 700, 500 );
        SeaHorse sea = new SeaHorse();
        addObject(sea, 500, 400);
        ClownFish clowny = new ClownFish();
        addObject(clowny, 55, 800);
        ClownFishButton Butty = new ClownFishButton();
        addObject(Butty, 80, 350);
        StarFishButton stard = new StarFishButton();
        addObject(stard, 80, 150);
        CrabButtton Crabbyb = new CrabButtton();
        addObject(Crabbyb, 80, 550);
        Crab johnny = new Crab();
        addObject(johnny, 220, 180);
        
    }
    
    private int counter;
    
    public void act()
    {
        
        counter++;
        
        if ( Math.random() < 0.5 )
        {
            addObject(new Food(), (((int)(Math.random()*1136))), (int)(Math.random()*135));
            counter = 0;
        }
        
        
        if( !music.isPlaying() )
        {
            music.play();
        }
        
        
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
