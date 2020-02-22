import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor implements Automated
{
    public boolean isStuck(){
       if ( isAtEdge() ){
            return true;
       }
       return false;
    }
    public void move(){
        if ( isStuck() ){
            setRotation(180);
        }
    }
}
