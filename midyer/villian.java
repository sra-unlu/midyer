import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class villian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class villian extends Actor
{
    /**
     * Act - do whatever the villian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int worldToAppearIn;
    public int villianIAm;
    public villian(int who){
        worldToAppearIn = Greenfoot.getRandomNumber(9);
        villianIAm = who;
    }
    
    public void act(){
        
    }
}
