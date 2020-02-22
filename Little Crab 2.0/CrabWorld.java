
import greenfoot.*;
import java.util.*; 
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
  GreenfootImage bg = new GreenfootImage("matt.jpg");
  private ArrayList<Actor> actors = new ArrayList<Actor>();
  public CrabWorld()
  { 
      super(1200, 800, 1); 
      setBackground(bg);
      spawnStuff();
  }
  public void act(){
      activateMovables();
      activateControllables();
      feedPredators();
    }
  public void spawnStuff(){
      int randomCrabs = (int)(Math.random() * 5 ) + 3;
      for ( int i = 0; i < randomCrabs; i++ ){
          addObject(new Crab() , (int)(Math.random() * 1200) + 1 , (int)(Math.random() * 800 ) + 1 );
      }
      int randomWorms = (int)(Math.random() * 19) + 28;
      for ( int i = 0; i < randomWorms; i++ ){
          addObject(new Worm() , (int)(Math.random() * 1200) + 1 , (int)(Math.random() * 800 ) + 1 );
      }
      Lobster lobster = new Lobster();
      Lobster lobby = new Lobster();
      addObject(lobster , getWidth()/2 - 40 , getHeight()/2 );
      addObject(lobby , getWidth()/2 + 40, getHeight()/2 );
      Switch switchy = new Switch();
      addObject(switchy ,getWidth(), getHeight());
  }
  public void activateMovables(){
      List <Automated> auto = getObjects(Automated.class);
      for ( int i = 0; i < auto.size(); i++ ){
          auto.get(i).move();
      }
  }
  public void activateControllables(){
      List <Controllable> control = getObjects(Controllable.class);
      for ( int i = 0; i < control.size(); i++ ){
          control.get(i).controller();
      }
  }
  public void feedPredators(){
      List <Predator> feed = getObjects(Predator.class);
      for ( int i = 0; i < feed.size(); i++ ){
          feed.get(i).eat();
      }
  }
  
}
