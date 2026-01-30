import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    person p = new person();
    public int playerx = 40;
    public int playery = 300;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        addObject(p, 40, 200); 
    }
    
    public void nextWorld(){
        
    }
    
    public int getpx(){
        return playerx;
    }
    
    public int getpy(){
        return playery;
    }
    
    public void updatepx(int x){
        playerx = x;
    }public void updatepy(int y){
        playery = y;
    }
}
