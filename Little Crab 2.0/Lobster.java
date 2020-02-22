import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor implements Controllable, Predator 
{
    private String up;
    private String down;
    private String sideLeft;
    private String sideRight;
    public Lobster(){
        up = "up";
        down = "down";
        sideLeft = "left";
        sideRight = "right";
    }
    public void controller(){
        if ( Greenfoot.isKeyDown(up) ){
            setLocation ( this.getX() , this.getY() - 5 );
        }
        if ( Greenfoot.isKeyDown(down) ){
            setLocation ( this.getX() , this.getY() + 5 );
        }
        if ( Greenfoot.isKeyDown(sideLeft) ){
            move(-5);
        }
        if ( Greenfoot.isKeyDown(sideRight) ){
            move(5);        
        }
    }
    public void eat() {
        if(isTouching(Crab.class) ){
            removeTouching(Crab.class);
        }
     
    }
}
