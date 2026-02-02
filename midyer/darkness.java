import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class darkness here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class darkness extends Actor
{
    /**
     * Act - do whatever the darkness wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        System.out.println("alo");
        int x = world.getpx();
        System.out.println("alo");
        int y = world.getpy();
        System.out.println("alo");
        setLocation(x, y);
    }
    
    
}
