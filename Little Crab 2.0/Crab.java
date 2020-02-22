import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor implements Automated, Predator
{
    private int speed = 5;
    private int turnAngle = -45;
    public boolean isStuck(){
        if (this.getX() >= getWorld().getWidth() - 20 || 
            this.getY() >= getWorld().getHeight() - 20 || this.getY() <= 20 ||
            this.getX() <= 20){
            return true;
        }
        return false;
    }
    public void move(){
        move(speed);
        if ( isStuck() ) {
            turn(turnAngle);
            move(speed);
        }
    }
    public void eat(){
       if( isTouching(Worm.class) ){
           removeTouching(Worm.class);
       }
    }
    
}
