import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Switch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Switch extends Actor implements Controllable{
    private Boolean x = true;
    public void controller(){
       if (Greenfoot.mouseClicked(this)){
           if ( x == true ){
               x = false;
               getWorld().setBackground("black.jpg");
           }
           else{
               x = true;
               getWorld().setBackground("sand2.jpg");
           }
       }
       
    }
}
